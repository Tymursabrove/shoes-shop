package com.shoeshop.dto;

import com.shoeshop.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private String name;
    private String description;
    private String categoryName;
    private Double price;

    public static ProductDto from(Product product) {
        return ProductDto.builder() //
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .categoryName(product.getCategory().getName())
                .build();
    }

}
