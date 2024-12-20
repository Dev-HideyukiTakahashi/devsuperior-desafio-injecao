package com.devsuperior.desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class OrderService {

  private ShippingService shippingService;

  public OrderService(ShippingService shippingService) {
    this.shippingService = shippingService;
  }

  public double total(Order order) {
    double valueWithDiscount = order.getBasic() - (order.getBasic() * order.getDiscount() / 100);
    return valueWithDiscount + shippingService.shipment(order);
  }
}
