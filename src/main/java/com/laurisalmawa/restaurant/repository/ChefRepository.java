package com.laurisalmawa.restaurant.repository;

import com.laurisalmawa.restaurant.service.model.ProductModel;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;

import java.util.ArrayList;
import java.util.List;

public class ChefRepository {

    public List<ProductModel> cookDishList(ProductRequestDTO productRequestDTO) {
        List<ProductModel> productModelList = new ArrayList<>();
        for (int dishAmount = 0; dishAmount < productRequestDTO.getAmount(); dishAmount++) {
            ProductModel dish = new ProductModel();
            dish.setProductName(productRequestDTO.getProduct());
            dish.setSpecial(productRequestDTO.getSpecial());
            productModelList.add(dish);
        }
        return productModelList;
    }
}
