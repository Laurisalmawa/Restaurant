package com.laurisalmawa.restaurant.controller;

import com.laurisalmawa.restaurant.service.model.OrderModel;
import com.laurisalmawa.restaurant.controller.dto.OrderRequestDTO;
import com.laurisalmawa.restaurant.controller.dto.OrderResponseDTO;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;
import com.laurisalmawa.restaurant.service.ManagerService;
import lombok.Builder;

import java.util.List;

@Builder
public class WaitressController {
    private ManagerService managerService;

    public OrderResponseDTO createOrder(List<ProductRequestDTO> productRequestDTOList, int tableNumber) {

        OrderRequestDTO orderRequestDTO = OrderRequestDTO.builder()
                .productRequestDTOList(productRequestDTOList)
                .tableNumber(tableNumber)
                .build();
        OrderModel orderModel = managerService.createOrder(orderRequestDTO);
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setProductList(orderModel.getItemsList());
        orderResponseDTO.setSuggestion("You should drink red wine");
        orderResponseDTO.setTableNumber(orderModel.getTableNumber());

        return orderResponseDTO;
    }

}
