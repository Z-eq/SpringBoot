package com.zeq.springboot.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository <Status, Integer> {
}
