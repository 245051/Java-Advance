package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.DrEntity;

@RestController
@RequestMapping("/dr")
public class Controller {
	@Autowired
	RestTemplate template;
	@GetMapping("/search")
	public List<DrEntity> fetch(){
		String url="http://localhost:8094/doctor/retrieve";
		List output1=template.getForObject(url, List.class);
		return output1;
		
	}

}
