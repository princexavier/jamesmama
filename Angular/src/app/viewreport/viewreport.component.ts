import { ViewreportService } from './../viewreport.service';
import { Component, OnInit } from '@angular/core';
import { Model } from 'src/model/Model';

@Component({
  selector: 'app-viewreport',
  templateUrl: './viewreport.component.html',
  styleUrls: ['./viewreport.component.css']
})
export class ViewreportComponent implements OnInit {

  model = { 'dateCreated': '' };
  billingEntries: Model[] = [new Model];
  netAmount: number = 0;
  defaultDate = new Date().toISOString().substring(0, 10);
  constructor(private viewreportService: ViewreportService) { }

  ngOnInit(): void {
    this.netAmount = 0;

  }

  viewbyDate() {
    this.billingEntries = [new Model];
    this.viewreportService.viewbyDate(this.model.dateCreated).subscribe(response => {
      let billings: any;
      billings = response;
      this.billingEntries = billings;
      console.log(response);
      this.netAmount = 0;
      this.billingEntries.forEach(billentry => {
        this.netAmount += +billentry.amount;
      });
      console.log(this.netAmount)
    });

  }

  calculateTotal() {
    // this.netAmount = 0;
    // this.billingEntries.forEach(billentry => {
    //   this.netAmount += +billentry.amount;
    // });
  }

  

}
