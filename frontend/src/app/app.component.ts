import { Component, ChangeDetectorRef } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
import { menuItems } from './menu';
import { AuthService } from './services/common/auth.service';
import { Router, NavigationEnd } from '@angular/router';
import { MatDialog } from '@angular/material/dialog';
import { LanguageSelectorComponent } from './components/common/language-selector/language-selector.component';

@Component({
  standalone: false,
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
  currentLanguage = 'en';
  languages = [
    { code: 'en', label: 'English' },
    { code: 'es', label: 'Español' },
    { code: 'fr', label: 'Français' },
    { code: 'hi', label: 'हिन्दी' },
    { code: 'ja', label: '日本語' },
    { code: 'zh', label: '中文' },
  ];

  constructor(
    private authService: AuthService,
    private router: Router,
    private translate: TranslateService,
    private cdr: ChangeDetectorRef,
    private dialog: MatDialog
  ) {
    this.translate.addLangs(this.languages.map((lang) => lang.code));
    this.translate.setDefaultLang('en');
    const savedLang = localStorage.getItem('locale');
    this.currentLanguage = savedLang && this.translate.getLangs().includes(savedLang)
      ? savedLang
      : 'en';
    this.translate.use(this.currentLanguage);
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
    setTimeout(() => {
      this.isLoggedIn = this.authService.isAuthenticated();
      if (!this.isLoggedIn) {
        this.navBarToggleOpened = false;
        this.submenuOpenStates = [];
      }
      this.cdr.markForCheck();
    });
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
    this.currentLanguage = language;
    this.translate.use(language);
    localStorage.setItem('locale', language);
  }

  openLanguageDialog(): void {
    const dialogRef = this.dialog.open(LanguageSelectorComponent, {
      data: {
        current: this.currentLanguage,
        languages: this.languages,
      },
    });
    dialogRef.afterClosed().subscribe((language) => {
      if (language) {
        this.switchLanguage(language);
      }
    });
  }

  getCurrentLanguageLabel(): string {
    return this.languages.find((lang) => lang.code === this.currentLanguage)?.label || this.currentLanguage;
  }

  logout(): void {
    this.navBarToggleOpened = false;
    this.submenuOpenStates = [];
    this.authService.logout();
  }
}
