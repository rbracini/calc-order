package com.rbf.calc_order.services;

import org.springframework.stereotype.Service;

import com.rbf.calc_order.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {

        double taxShipping = 0.0;

        if (order.getBasic() < 100.0) {
            taxShipping = 20.0;
        } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
            taxShipping = 12.0;
        }

        return taxShipping;
    }

}
