import { Component, OnInit } from '@angular/core';
import { tap } from 'rxjs';
import { CartStore } from 'src/app/core/store/cart.store';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  cartItemCount$ = this.cartStore.select(state => state.count);

  constructor(private cartStore: CartStore) { }

  ngOnInit(): void {
  }
}