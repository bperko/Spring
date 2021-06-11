package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.SerwisantNaprawa;

@Repository
public interface ISerwisantNaprawa extends CrudRepository<SerwisantNaprawa, Integer> {

}
