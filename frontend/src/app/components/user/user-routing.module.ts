import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { CreateUserComponent } from './create-user/create-user.component';
import { UserDetailComponent } from './user-detail/user-detail.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: '', component: UserComponent, data: { title: 'Users List' } },
      { path: 'create', component: CreateUserComponent, data: { title: 'Create User' } },
      { path: ':userLoginId', component: UserDetailComponent, data: { title: 'User Details' } },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class UserRoutingModule {}
