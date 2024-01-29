import { Component, Input, OnInit, Output,EventEmitter } from '@angular/core';
import { Product } from '../product.model';

@Component({
  selector: 'product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css']
})
export class ProductCardComponent implements OnInit{

  @Input() product?: Product;
  @Output() openDetailsEvent = new EventEmitter<number>();
  ngOnInit(): void {}

  openProductDetails(id: number) {
    this.openDetailsEvent.emit(id);
  }
}
