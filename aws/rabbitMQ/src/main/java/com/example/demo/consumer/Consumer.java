package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.config.Config;
import com.example.demo.model.OrderStatus;

@Component
public class Consumer {
	
	@RabbitListener(queues=Config.Queue)
	public void messagefromQueue(OrderStatus ostatus) {
		System.out.println("Message Receiverde"+ostatus);
	}

}
