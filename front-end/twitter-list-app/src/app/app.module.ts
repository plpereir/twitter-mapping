import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { TwitterListComponent } from './twitter-list/twitter-list.component';
import { TwitterService } from './twitter-service.service';
 
@NgModule({
  declarations: [
    AppComponent,
    TwitterListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [TwitterService],
  bootstrap: [AppComponent]
})
export class AppModule { }