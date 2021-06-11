package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Pracownik;
@Repository
public interface IPracownikRepository extends CrudRepository<Pracownik, Integer> {

}
