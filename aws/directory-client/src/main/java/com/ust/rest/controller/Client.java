package com.ust.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.ust.rest.entity.EntityC;

public class Client {
	@Autowired
	RestTemplate template;
	@GetMapping("/enter")
	public List<EntityC> retrieve(){
		String url="http:localhost/8090/create";
		List ot=template.getForObject(url, List.class);
		return ot;
	}

}
