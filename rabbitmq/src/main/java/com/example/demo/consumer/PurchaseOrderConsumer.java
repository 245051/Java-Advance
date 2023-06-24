package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.config.MessagingConfig;
import com.example.demo.model.OrderStatus;

@Component

public class PurchaseOrderConsumer {
	@Value("${ust.rabbitmq.queue}")
	 String queueName;
		@Value("${ust.rabbitmq.exchange}")
		 String exchange;
		@Value("${ust.rabbitmq.routingkey}")
		 String routingkey ;
	@RabbitListener(queues = "ust_queue") // Which ever information we need the QUEUE obtains that message 
	//When a message arrives it is immediately called into this methods
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		//System.out.println("Message Received from queue:" + orderStatus);
		System.out.println("hello");
	}

}
