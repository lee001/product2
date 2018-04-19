package com.example.product.service;

import com.example.product.dataobject.ProductInfo;
import com.example.product.dto.CartDTO;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param carDTOList
     */
    void decreaseStock(List<CartDTO> carDTOList);
}
