package com.laurisalmawa.restaurant.repository;

import com.laurisalmawa.restaurant.service.model.ProductModel;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;

import java.util.ArrayList;
import java.util.List;

public class BarManRepository extends ChefRepository {

    public List<ProductModel> serveDrinkList(ProductRequestDTO productRequestDTO) {
        List<ProductModel> productModelList = new ArrayList<>();
        for (int dishAmount = 0; dishAmount < productRequestDTO.getAmount(); dishAmount++) {
            ProductModel drink = new ProductModel();
            drink.setProductName(productRequestDTO.getProduct());
            drink.setSpecial(productRequestDTO.getSpecial());
            productModelList.add(drink);
        }
        return productModelList;
    }
}
