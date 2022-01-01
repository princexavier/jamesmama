import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  btnName:any='Start Billing';

  constructor(private router : Router) { }

  ngOnInit(): void {
  }
  billing(event:Event){
    this.btnName= this.btnName =='Back' ? 'Start Billing': 'Back';
    
    this.router.navigateByUrl("/billing");
    if(this.btnName!='Back'){
      this.router.navigateByUrl("/");
    }
  }
  customerGroup(event:Event){
    this.router.navigateByUrl('/customerGroup')
  }
  areaMaster(event:Event){
    this.router.navigateByUrl('/areaMaster')

  }
  viewReport(){
    this.router.navigateByUrl('/viewreport');

  }
  addProduct(){
    this.router.navigateByUrl('/products');

  }

}
