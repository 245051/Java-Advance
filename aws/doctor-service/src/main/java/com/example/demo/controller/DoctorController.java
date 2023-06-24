package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DoctorEntity;
import com.example.demo.repository.DoctorRepo;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorRepo repo;
	@PostMapping("/reg")
	public ResponseEntity<DoctorEntity>register(@RequestBody DoctorEntity ent ){
		return  new ResponseEntity<>(repo.save(ent),HttpStatus.CREATED);
	}
	@GetMapping("/retrieve")
	public ResponseEntity<List<DoctorEntity>> fetch(){
		
			return new ResponseEntity<>(repo.findAll(),HttpStatus.FOUND);
		
		
	}
	
	
}
