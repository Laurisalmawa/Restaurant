package com.laurisalmawa.restaurant.controller.dto;

import com.laurisalmawa.restaurant.service.model.ProductModel;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponseDTO {
        private List<List<ProductModel>> productList;
        private String suggestion;
        private int tableNumber;
}
