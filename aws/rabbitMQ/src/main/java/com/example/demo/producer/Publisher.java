package com.example.demo.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Config;
import com.example.demo.model.Order;
import com.example.demo.model.OrderStatus;

@RestController
@RequestMapping("/user")
public class Publisher {
	@Autowired
	public RabbitTemplate template;
	@PostMapping("/{name}")
	public String bookorder(@RequestBody Order order,@PathVariable String name) {
		order.setOrderid(UUID.randomUUID().toString());
		OrderStatus status=new OrderStatus(order,"Process","On the way");
		template.convertAndSend(Config.Exchange, Config.Routing_Key, status);
		return "Success";
	}

}
