package com.meongnyang.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryProductList {
    private Long id;
    private Long categoryId;
    private String productName;
    private Long productPrice;
    private String productBrand;
}