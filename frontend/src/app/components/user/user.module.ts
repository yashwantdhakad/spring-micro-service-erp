import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { HttpClient } from '@angular/common/http';

import { MaterialModule } from '../../components/common/material/material.module';
import { SharedModule } from '../common/shared/shared-module';

import { UserComponent } from './user/user.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { UserDetailComponent } from './user-detail/user-detail.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { UserRoutingModule } from './user-routing.module';

@NgModule({
  declarations: [UserComponent, CreateUserComponent, UserDetailComponent, EditUserComponent],
  imports: [
    CommonModule,
    UserRoutingModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    SharedModule,
    TranslateModule.forChild({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient],
      },
    }),
  ],
})
export class UserModule {}

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}
