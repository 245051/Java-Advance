package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import  org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;


@Configuration
public class Config {
	public static final String Queue="javatechie_ust";
	public static final String Exchange="javaexchange_ust";
	public static final String Routing_Key="javarouting_key";
	@Bean
	public Queue queue(){
		return new Queue(Queue);
	}
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(Exchange);
		
	}
	@Bean
	public Binding binding(Queue queue,TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(Routing_Key);
	}
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
		
	}
	
	@Bean
	public AmqpTemplate template(ConnectionFactory connection) {
		 final RabbitTemplate rabbit=new RabbitTemplate(connection);
		rabbit.setMessageConverter(converter());
		return rabbit;
		
	}
}
