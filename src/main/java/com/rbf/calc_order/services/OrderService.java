package com.rbf.calc_order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbf.calc_order.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double totalOrder(Order order) {
        var valueWithDiscount = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
        return valueWithDiscount + shippingService.shipment(order);
    }

}
