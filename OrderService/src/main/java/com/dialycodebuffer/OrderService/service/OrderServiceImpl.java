package com.dialycodebuffer.OrderService.service;

import com.dialycodebuffer.OrderService.entity.Order;
import com.dialycodebuffer.OrderService.model.OrderRequest;
import com.dialycodebuffer.OrderService.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Log4j2
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public long placeOrder(OrderRequest orderRequest)
    {
         //use order entity and save data created
        //call product-service to reduce the quantity of product
        //payment service -> payments->successfull else ->cancelled

        log.info("Placing order request",orderRequest);
        Order order = Order.builder().amount(orderRequest.getTotalAmount())
                        .orderStatus("CREATED")
                        .productId(orderRequest.getProductId())
                        .orderDate(Instant.now())
                        .quantity(orderRequest.getQuantity())
                        .build();

        order = orderRepository.save(order);
        log.info("Order placed successfull",order.getId());
        return order.getId();

    }
}
