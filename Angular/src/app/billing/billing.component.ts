import { AreaModel } from './../../model/AreaModel';
import { BillingService } from './../billing.service';
import { Model } from './../../model/Model';
import { Component, OnInit } from '@angular/core';
import { Product } from 'src/model/Product';
import { ProductService } from '../product.service';


@Component({
  selector: 'app-billing',
  templateUrl: './billing.component.html',
  styleUrls: ['./billing.component.css']
})
export class BillingComponent implements OnInit {

  model = new Model();
  billingEntries: Model[] = [new Model];
  netAmount: number = 0;
  defaultDate = new Date().toISOString().substring(0, 10);
  areas:AreaModel[];
  products:any[];



  constructor(private billingService: BillingService,private productService:ProductService) { }

  ngOnInit(): void {

    this.billingService.getAreas().subscribe(response => {
      let areas :any;
      areas=response;
      this.areas= areas;
      console.log(response);

    });
    this.productService.getProducts().subscribe(response=>{
      let product :any;
      product=response;
      this.products=product;
    });
    
    this.model = new Model();

    this.billingEntries.forEach(billingEntry=>{
      billingEntry.createdDate = this.defaultDate;
    });

    
  }
  save() {
    console.log(this.billingEntries);
    this.billingService.save(this.billingEntries).subscribe(response => {
      console.log(response);

    });
  }

  reset(){
    this.billingEntries.forEach(billingEntry=>{
      
      billingEntry.amount=0;
      billingEntry.customerName="";
    });
    this.netAmount=0;
  }
  addnewEntry(index) {
    this.billingEntries[index + 1] = new Model();
  }
  removeEntry(index) {
    this.billingEntries.length == 1 ? alert('Can you Edit this row Please ') : this.billingEntries.splice(index, 1);

  }
  calculateTotal() {
    this.netAmount = 0;
    this.billingEntries.forEach(billentry => {
      
      this.netAmount += ((+billentry.quantity)*(+billentry.amount));
    });
  }

  settingArea(i,value){
    this.billingEntries.forEach((billingEntry,index)=>{
      if(index==i){
        billingEntry.customerGroup=value;
        billingEntry.productName=value;

      }

    });
  }

}
