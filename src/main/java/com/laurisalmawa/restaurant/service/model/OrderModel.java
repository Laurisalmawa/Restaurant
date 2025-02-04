package com.laurisalmawa.restaurant.service.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

// Modelo o entidad

@Data
public class OrderModel {
    private Date date;
    private List<List<ProductModel>> itemsList;
    private int tableNumber;
}

