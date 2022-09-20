package com.example.exercise23.entity;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface StatusRepository extends CrudRepository<Status, Integer> {

      List<Status> findStatusByStatusCode( String getCars);
    }

