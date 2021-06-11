package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Moder;
@Repository
public interface IModerRepository extends CrudRepository<Moder, Integer> {

}
