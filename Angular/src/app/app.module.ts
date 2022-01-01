import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { BillingComponent } from './billing/billing.component';
import { FormsModule } from '@angular/forms';
import { CustomergroupComponent } from './customergroup/customergroup.component';
import { BillingService } from './billing.service';
import { ProductService } from './product.service';

import { AreamasterComponent } from './areamaster/areamaster.component';
import { BillingviewComponent } from './billingview/billingview.component';
import { ViewreportComponent } from './viewreport/viewreport.component';
import { ProductsComponent } from './products/products.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    BillingComponent,
    CustomergroupComponent,
    AreamasterComponent,
    BillingviewComponent,
    ViewreportComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  
  ],
  providers: [BillingService,ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
