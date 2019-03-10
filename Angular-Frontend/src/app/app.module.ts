import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


import { httpInterceptorProviders } from './auth/auth-interceptor';
import {RouterModule} from '@angular/router';
import { QuestionListComponent } from './questions/question-list/question-list.component';
import { AddformComponent } from './addform/addform.component';
import {HomeComponent} from './home/home.component';
import { TagsListComponent } from './tags/tags-list/tags-list.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    QuestionListComponent,
    AddformComponent,
    HomeComponent,
    TagsListComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [httpInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
