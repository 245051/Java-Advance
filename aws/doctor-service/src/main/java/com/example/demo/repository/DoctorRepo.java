package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DoctorEntity;
@Repository
public interface DoctorRepo extends JpaRepository<DoctorEntity,Long> {
	

}
