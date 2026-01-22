import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { of, throwError } from 'rxjs';
import { LoginComponent } from './login.component';
import { AuthService } from 'src/app/services/common/auth.service';
import { NavigationService } from 'src/app/services/common/navigation.service';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;
  let authService: jasmine.SpyObj<AuthService>;
  let navigationService: jasmine.SpyObj<NavigationService>;
  let router: jasmine.SpyObj<Router>;

  beforeEach(async () => {
    const authSpy = jasmine.createSpyObj('AuthService', ['login', 'setToken']);
    const navigationSpy = jasmine.createSpyObj('NavigationService', ['getLastUrl']);
    const routerSpy = jasmine.createSpyObj('Router', ['navigateByUrl']);

    await TestBed.configureTestingModule({
      declarations: [LoginComponent],
      imports: [ReactiveFormsModule],
      providers: [
        { provide: AuthService, useValue: authSpy },
        { provide: NavigationService, useValue: navigationSpy },
        { provide: Router, useValue: routerSpy },
      ],
    }).compileComponents();

    authService = TestBed.inject(AuthService) as jasmine.SpyObj<AuthService>;
    navigationService = TestBed.inject(NavigationService) as jasmine.SpyObj<NavigationService>;
    router = TestBed.inject(Router) as jasmine.SpyObj<Router>;
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  afterEach(() => {
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should initialize form with default values', () => {
    expect(component.loginForm).toBeDefined();
    expect(component.loginForm.get('username')?.value).toBe('');
    expect(component.loginForm.get('password')?.value).toBe('');
  });


  it('should not submit if form is invalid', () => {
    component.loginForm.get('username')?.setValue('');
    component.onSubmit();
    expect(authService.login).not.toHaveBeenCalled();
  });

  it('should login and redirect to last URL', fakeAsync(() => {
    const fakeToken = 'valid-token';
    authService.login.and.returnValue(of({ accessToken: fakeToken }));
    navigationService.getLastUrl.and.returnValue('/dashboard');

    component.loginForm.setValue({ username: 'john.doe', password: 'moqui' });
    component.onSubmit();
    tick();

    expect(authService.login).toHaveBeenCalledWith('john.doe', 'moqui');
    expect(authService.setToken).toHaveBeenCalledWith(fakeToken);
    expect(router.navigateByUrl).toHaveBeenCalledWith('/dashboard');
    expect(component.isLoading).toBeFalse();
  }));

  it('should redirect to /home if last URL is /login or null', fakeAsync(() => {
    authService.login.and.returnValue(of({ accessToken: 'token' }));
    navigationService.getLastUrl.and.returnValue('/login');

    component.loginForm.setValue({ username: 'john.doe', password: 'moqui' });
    component.onSubmit();
    tick();

    expect(router.navigateByUrl).toHaveBeenCalledWith('/home');
  }));

  it('should handle login error', fakeAsync(() => {
    authService.login.and.returnValue(throwError(() => new Error('Login failed')));

    component.loginForm.setValue({ username: 'john.doe', password: 'moqui' });
    component.onSubmit();
    tick();

    expect(component.isLoading).toBeFalse();
  }));
});
