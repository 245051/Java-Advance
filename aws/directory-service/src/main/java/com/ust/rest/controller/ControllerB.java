package com.ust.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ust.rest.entity.EntityB;
import com.ust.rest.repo.Repo;

@RestController
public class ControllerB {
	@Autowired
	private Repo repo;
	
	@PostMapping("/reg")
	public ResponseEntity<EntityB>register(@RequestBody EntityB ent ){
		return  new ResponseEntity<>(repo.save(ent),HttpStatus.CREATED);
	}
	@GetMapping("/retrieve")
	public ResponseEntity<List<EntityB>> fetch(){
		
			return new ResponseEntity<>(repo.findAll(),HttpStatus.FOUND);
		
		
	}

}
