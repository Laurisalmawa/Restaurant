package com.laurisalmawa.restaurant.repository;

import com.laurisalmawa.restaurant.service.model.ProductModel;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;

import java.util.ArrayList;
import java.util.List;

public class PastryChefRepository {

    public List<ProductModel> cookDessertList(ProductRequestDTO productRequestDTO) {
        List<ProductModel> productModelList = new ArrayList<>();
        for (int dishAmount = 0; dishAmount < productRequestDTO.getAmount(); dishAmount++) {
            ProductModel dessert = new ProductModel();
            dessert.setProductName(productRequestDTO.getProduct());
            dessert.setSpecial(productRequestDTO.getSpecial());
            productModelList.add(dessert);
        }
        return productModelList;
    }
}
