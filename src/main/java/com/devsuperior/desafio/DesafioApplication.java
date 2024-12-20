package com.devsuperior.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Criando o pedido
		int code = Integer.parseInt(scan.nextLine());
		double basic = Double.parseDouble(scan.nextLine());
		double discount = Double.parseDouble(scan.nextLine());
		Order order = new Order(code, basic, discount);

		// valor total com desconto e frete
		double total = orderService.total(order);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", total));
		scan.close();
	}

}
