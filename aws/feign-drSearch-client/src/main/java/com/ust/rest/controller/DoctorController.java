package com.ust.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.entity.Doctor;
import com.ust.rest.iface.DrSearchiface;

@RestController
@RequestMapping("/feign")
public class DoctorController {
	@Autowired
	private DrSearchiface searchInterface;
	
	@GetMapping("/get")
	public List<Doctor> getdoctor(){
		return searchInterface.getdoc();
	}
	
}
