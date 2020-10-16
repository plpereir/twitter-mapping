import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TwitterListComponent } from './twitter-list/twitter-list.component';
 
const routes: Routes = [
  { path: 'twitters', component: TwitterListComponent }
];
 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }