package com.laurisalmawa.restaurant.controller.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderRequestDTO {
    private List<ProductRequestDTO> productRequestDTOList;
    private int tableNumber;
}
