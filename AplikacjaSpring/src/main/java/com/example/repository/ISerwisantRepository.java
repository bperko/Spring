package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Serwisant;

@Repository
public interface ISerwisantRepository extends CrudRepository<Serwisant, Integer> {

}
