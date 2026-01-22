import { Component } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
import { menuItems } from './menu';
import { AuthService } from './services/common/auth.service';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  isLoggedIn: boolean = false;
  navBarToggleOpened: boolean = false;

  submenuOpenStates: boolean[] = [];

  title = 'erp';
  items = menuItems;

  constructor(
    private authService: AuthService,
    private router: Router,
    private translate: TranslateService
  ) {
    this.translate.addLangs(['en', 'es']);
    this.translate.setDefaultLang('en');
    this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        this.checkLoggedInStatus();
      }
    });
  }

  ngOnInit(): void {
    this.checkLoggedInStatus();
  }


  checkLoggedInStatus(): void {
    this.isLoggedIn = this.authService.isAuthenticated();
  }

  toggleNavBar() {
    this.navBarToggleOpened = !this.navBarToggleOpened;
  }

  toggleListGroup(item: any): void {
    item.expanded = !item.expanded;
  }

  toggleSubmenu(index: number) {
    this.submenuOpenStates[index] = !this.submenuOpenStates[index];
  }

  switchLanguage(language: string) {
    this.translate.use(language);
  }

  logout(): void {
    this.authService.logout();
  }
}
