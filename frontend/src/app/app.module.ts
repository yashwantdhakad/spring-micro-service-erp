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
import { AddEditProductComponent } from './components/category/add-edit-product/add-edit-product.component';
import { EditCategoryComponent } from './components/category/edit-category/edit-category.component';
import { ConfirmationDialogComponent } from './components/common/confirmation-dialog/confirmation-dialog.component';
import { LanguageSelectorComponent } from './components/common/language-selector/language-selector.component';
import { CustomerAutoCompleteComponent } from './components/customer/customer-auto-complete/customer-auto-complete.component';
import { EditCustomerComponent } from './components/customer/edit-customer/edit-customer.component';
import { AddToFeatureGroupComponent } from './components/feature/add-to-feature-group/add-to-feature-group.component';
import { AddToProductComponent } from './components/feature/add-to-product/add-to-product.component';
import { EditFeatureComponent } from './components/feature/edit-feature/edit-feature.component';
import { AddCategoryFeatureGroupApplComponent } from './components/featuregroup/add-category-feature-group-appl/add-category-feature-group-appl.component';
import { AddProductFeatureGroupApplComponent } from './components/featuregroup/add-product-feature-group-appl/add-product-feature-group-appl.component';
import { EditFeaturegroupComponent } from './components/featuregroup/edit-featuregroup/edit-featuregroup.component';
import { ContentComponent } from './components/order/content/content.component';
import { ItemComponent } from './components/order/item/item.component';
import { NoteComponent } from './components/order/note/note.component';
import { ProductItemComponent } from './components/order/product-item/product-item.component';
import { AddClassificationComponent } from './components/party/add-classification/add-classification.component';
import { AddEditAddressComponent } from './components/party/add-edit-address/add-edit-address.component';
import { AddEditBankAccountComponent } from './components/party/add-edit-bank-account/add-edit-bank-account.component';
import { AddEditCreditCardComponent } from './components/party/add-edit-credit-card/add-edit-credit-card.component';
import { AddEditEmailComponent } from './components/party/add-edit-email/add-edit-email.component';
import { AddEditPhoneComponent } from './components/party/add-edit-phone/add-edit-phone.component';
import { AddIdentificationComponent } from './components/party/add-identification/add-identification.component';
import { AddRoleComponent } from './components/party/add-role/add-role.component';
import { PartyContentComponent } from './components/party/party-content/party-content.component';
import { PartyNoteComponent } from './components/party/party-note/party-note.component';
import { AddEditProductCategoryComponent } from './components/product/add-edit-product-category/add-edit-product-category.component';
import { AddEditProductPriceComponent } from './components/product/add-edit-product-price/add-edit-product-price.component';
import { ProductAssocComponent } from './components/product/product-assoc/product-assoc.component';
import { ProductContentComponent } from './components/product/product-content/product-content.component';
import { ProductEditComponent } from './components/product/product-edit/product-edit.component';
import { EditSupplierComponent } from './components/supplier/edit-supplier/edit-supplier.component';
import { UserDetailComponent } from './components/user/user-detail/user-detail.component';
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
    ProductEditComponent,
    AddEditAddressComponent,
    AddEditEmailComponent,
    AddEditPhoneComponent,
    AddRoleComponent,
    AddClassificationComponent,
    AddIdentificationComponent,
    AddEditCreditCardComponent,
    AddEditBankAccountComponent,
    EditSupplierComponent,
    CustomerAutoCompleteComponent,
    ConfirmationDialogComponent,
    LanguageSelectorComponent,
    AddEditProductPriceComponent,
    AddEditProductCategoryComponent,
    ItemComponent,
    NoteComponent,
    AddEditProductComponent,
    EditCategoryComponent,
    EditCustomerComponent,
    ContentComponent,
    ProductContentComponent,
    ProductAssocComponent,
    ProductItemComponent,
    PartyNoteComponent,
    PartyContentComponent,
    UserDetailComponent,
    EditFeatureComponent,
    EditFeaturegroupComponent,
    AddToFeatureGroupComponent,
    AddToProductComponent,
    AddCategoryFeatureGroupApplComponent,
    AddProductFeatureGroupApplComponent,
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
export class AppModule {}
