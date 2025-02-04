package com.laurisalmawa.restaurant.controller.dto;

import com.laurisalmawa.restaurant.service.model.ProductTypeModel;
import lombok.Data;

@Data
public class ProductRequestDTO {
    private int amount;
    private String product;
    private String special;
    private ProductTypeModel type;
}
