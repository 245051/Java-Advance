package com.example.demo.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.MessagingConfig;
import com.example.demo.model.OrderStatus;
import com.example.demo.model.PurchaseOrder;

@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {
@Autowired
private RabbitTemplate template;
@Value("${ust.rabbitmq.queue}")
String queueName;
	@Value("${ust.rabbitmq.exchange}")
	 String exchange;
	@Value("${ust.rabbitmq.routingkey}")
	 String routingkey ;
@PostMapping("/{customerName}")


public String bookOrder(@RequestBody PurchaseOrder order,@PathVariable String customerName) {
	order.setOrderId(UUID.randomUUID().toString());
	OrderStatus orderStatus =new OrderStatus(order,"ACCEPTED","order placed successfully by"+customerName);
	template.convertAndSend("ust_exchange","ust_routingkey",orderStatus);
	return "Success";
}

}
