package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Naprawa;
@Repository
public interface INaprawaRepository extends CrudRepository<Naprawa, Integer> {

}
