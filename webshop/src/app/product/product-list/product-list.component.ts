import { Component, OnInit } from '@angular/core';
import { Product } from "../product.model";
import { ProductService } from '../product.service';
import { Observable, tap } from 'rxjs';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit{
  productList: Product[] = [];
  productList$ = new Observable<Product[]>; 
  constructor(private productService: ProductService){}

  ngOnInit(): void {
      this.productService.getProductList().subscribe(products => {
        this.productList = products;
      })
      //reactive
      this.productList$ = this.productService.getProductList();
  }

  openDetails(productId: number){
    console.log(productId);
  }
}
