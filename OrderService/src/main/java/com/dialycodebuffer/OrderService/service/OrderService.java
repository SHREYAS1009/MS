package com.dialycodebuffer.OrderService.service;

import com.dialycodebuffer.OrderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}
