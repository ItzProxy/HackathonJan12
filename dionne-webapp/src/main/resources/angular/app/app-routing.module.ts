import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {UserListComponent} from "./components/users/user-list/user-list.component";
import {UserComponent} from "./components/users/user/user.component";

const routes: Routes = [
  {
    path: '',
    component: UserListComponent,
  },
  {
    path: ':userId',
    component: UserComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
