import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Product } from "./product.model";

@Injectable({
    providedIn: "root"
})
export class ProductService{


    constructor(private http: HttpClient){}

    getProductList(){
        return this.http.get<Product[]>(`http://localhost:3000/products`)
    }

    getProductById(id: number) :Observable<Product>{
        return this.http.get<Product>(`http://localhost:3000/products/${id}`)
    }
}