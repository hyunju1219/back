package com.meongnyang.shop.dto.response;

import com.meongnyang.shop.entity.Product;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RespGetProductsAllDto {
    private List<Product> products;
    private int productsCount;
}
