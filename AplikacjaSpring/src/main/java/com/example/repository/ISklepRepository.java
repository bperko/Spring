package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Sklep;
@Repository
public interface ISklepRepository extends CrudRepository<Sklep, Integer> {

}
