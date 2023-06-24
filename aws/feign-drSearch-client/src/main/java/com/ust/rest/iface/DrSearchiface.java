package com.ust.rest.iface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.rest.entity.Doctor;
@FeignClient(value="feign-drSearch-client", url="http://localhost:8090/doctor")
public interface DrSearchiface {
	@RequestMapping(method=RequestMethod.GET,value="/get")
	public List<Doctor> getdoc();
}
