package com.devsuperior.desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.entities.Order;

@Service
public class ShippingService {

  public double shipment(Order order) {
    if (order.getBasic() < 100.0) {
      return 20;
    } else if (order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
      return 12;
    }
    return 0;
  }
}
