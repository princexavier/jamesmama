import { ViewreportComponent } from './viewreport/viewreport.component';
import { CustomergroupComponent } from './customergroup/customergroup.component';
import { BillingComponent } from './billing/billing.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { AreamasterComponent } from './areamaster/areamaster.component';
import { ProductsComponent } from './products/products.component';


const routes: Routes = [
  
  {
    path:'billing',component:BillingComponent
  },
  {
    path:'customerGroup',component:CustomergroupComponent
  },
  {
    path:'areaMaster',component:AreamasterComponent
  },
  {
    path:'viewreport',component:ViewreportComponent
  },
  {
    path:'products',component:ProductsComponent
  },

  
  {
    path:'**',redirectTo:'WelcomeComponent'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
