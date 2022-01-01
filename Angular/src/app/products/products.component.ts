import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from 'src/model/Product';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private productService :ProductService) { }
  model=new Product();
  products: any;
   
  ngOnInit() {
    this.productService.getProducts().subscribe(response=>{
      console.log(response);
      let res=response;
      this.products = res;
    })

  }

  save(){
    this.productService.save(this.model).subscribe(response=>{
      console.log(response);
     
    });
  }
}
