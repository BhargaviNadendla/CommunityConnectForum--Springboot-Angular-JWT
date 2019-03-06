import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import {AddformComponent} from './addform/addform.component';
import {QuestionListComponent} from './questions/question-list/question-list.component';
import {AppComponent} from './app.component';
import {HomeComponent} from './home/home.component';


const routes: Routes = [
  { path: '', redirectTo: '/signin', pathMatch: 'full' },
  { path: 'signin', component: LoginComponent},
  { path: 'signup', component: RegisterComponent},
  { path: 'home', component: HomeComponent},
  { path: 'question', component: QuestionListComponent},
  { path: 'addform', component: AddformComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
