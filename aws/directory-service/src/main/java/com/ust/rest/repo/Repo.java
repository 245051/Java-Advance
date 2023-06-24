package com.ust.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.rest.entity.EntityB;
@Repository
public interface Repo extends JpaRepository<EntityB, Long> {

}
