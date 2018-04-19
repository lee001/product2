package com.example.product.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DecreaseStockInput {

    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
