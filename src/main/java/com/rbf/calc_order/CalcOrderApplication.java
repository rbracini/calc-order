package com.rbf.calc_order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rbf.calc_order.entities.Order;
import com.rbf.calc_order.services.OrderService;

@SpringBootApplication
public class CalcOrderApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CalcOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.printf("""
				Pedido código %d
				Valor total: R$ %.2f
				""", order.getCode(), orderService.totalOrder(order));
	}

}
