import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';
import { CategoryStore } from '../../../../core/store/category.store';
import { tap } from 'rxjs';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.scss']
})
export class CategoryListComponent implements OnInit {

  categories$ = this.categoryStore.select(state => state.categories);

  constructor(private httpClient: HttpClient, private categoryStore: CategoryStore) { }

  ngOnInit(): void {

    this.httpClient.get(`${environment.productService}/api/categories/hierarchical`).subscribe((data) => {
      this.categoryStore.setCategories((data as any)['data'])
    })
  }
}
