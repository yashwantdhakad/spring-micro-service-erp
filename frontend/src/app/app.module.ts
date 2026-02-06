import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { DatePipe } from '@angular/common';

import { MaterialModule } from './components/common/material/material.module';

import { EffectsModule } from '@ngrx/effects';
import { StoreModule } from '@ngrx/store';


import { LanguageSelectorComponent } from './components/common/language-selector/language-selector.component';









import { CurrencyPipe } from './pipes/currency.pipe';
import { SnackbarService } from './services/common/snackbar.service';
import { EnumEffects } from './store/enum/enum.effects';
import { enumReducer } from './store/enum/enum.reducer';
import { GeoEffects } from './store/geo/geo.effects';
import { geoReducer } from './store/geo/geo.reducer';

import { AboutComponent } from './components/about/about.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { AuthService } from './services/common/auth.service';
import { TokenInterceptor } from './services/common/token.interceptor';

// AoT requires an exported function for factories
export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AboutComponent,
    HomeComponent,




    LanguageSelectorComponent,



    CurrencyPipe,
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    HttpClientModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    AppRoutingModule,
    StoreModule.forRoot({ geo: geoReducer, enum: enumReducer }),
    EffectsModule.forRoot([GeoEffects, EnumEffects]),
  ],
  providers: [
    AuthService,
    DatePipe,
    SnackbarService,
    { provide: HTTP_INTERCEPTORS, useClass: TokenInterceptor, multi: true },
  ],
  bootstrap: [AppComponent],
})
export class AppModule { }
