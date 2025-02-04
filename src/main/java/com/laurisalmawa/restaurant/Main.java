package com.laurisalmawa.restaurant;

import com.laurisalmawa.restaurant.controller.WaitressController;
import com.laurisalmawa.restaurant.controller.dto.OrderResponseDTO;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;
import com.laurisalmawa.restaurant.service.ManagerService;
import com.laurisalmawa.restaurant.service.model.ProductTypeModel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();
        WaitressController waitressController = WaitressController.builder()
                .managerService(managerService).build();

        List<ProductRequestDTO> productRequestDTOList = Main.orderRequest();
        OrderResponseDTO orderResponseDTO = waitressController.createOrder(productRequestDTOList, 25);

    }

    public static List<ProductRequestDTO> orderRequest() {
        ProductRequestDTO productRequestDTO = new ProductRequestDTO();
        ProductRequestDTO productRequestDTO2 = new ProductRequestDTO();
        List<ProductRequestDTO> orderRequestList = new ArrayList<>();

        productRequestDTO.setProduct("Meat");
        productRequestDTO.setType(ProductTypeModel.DISHES);
        productRequestDTO.setAmount(2);
        productRequestDTO.setSpecial("With onion");
        orderRequestList.add(productRequestDTO);

        productRequestDTO2.setProduct("Apple juice");
        productRequestDTO2.setType(ProductTypeModel.DRINKS);
        productRequestDTO2.setAmount(3);
        productRequestDTO2.setSpecial("Without suggar");
        orderRequestList.add(productRequestDTO2);

        return orderRequestList;
    }
}