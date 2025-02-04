package com.laurisalmawa.restaurant.service;

import com.laurisalmawa.restaurant.service.model.OrderModel;
import com.laurisalmawa.restaurant.controller.dto.OrderRequestDTO;
import com.laurisalmawa.restaurant.controller.dto.ProductRequestDTO;
import com.laurisalmawa.restaurant.repository.BarManRepository;
import com.laurisalmawa.restaurant.repository.ChefRepository;
import com.laurisalmawa.restaurant.repository.PastryChefRepository;
import com.laurisalmawa.restaurant.service.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ManagerService {
    private final ChefRepository chefRepository = new ChefRepository();
    private final PastryChefRepository pastryChefRepository = new PastryChefRepository();
    private final BarManRepository barManRepository = new BarManRepository();

    public OrderModel createOrder(OrderRequestDTO orderRequestDTO) {
        OrderModel orderModel = new OrderModel();
        List<List<ProductModel>> itemsList = new ArrayList<>();
        for (ProductRequestDTO productRequestDTO : orderRequestDTO.getProductRequestDTOList()) {
            List<ProductModel> productModelList = new ArrayList<>();
            switch (productRequestDTO.getType()) {
                case DISHES:
                    productModelList = chefRepository.cookDishList(productRequestDTO);
                    break;
                case DESSERTS:
                    productModelList = pastryChefRepository.cookDessertList(productRequestDTO);
                    break;
                case DRINKS:
                    productModelList = barManRepository.serveDrinkList(productRequestDTO);
                    break;
            }
            itemsList.add(productModelList);
        }
        orderModel.setTableNumber(orderRequestDTO.getTableNumber());
        orderModel.setItemsList(itemsList);
        return orderModel;
    }
}
