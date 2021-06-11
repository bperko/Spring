package com.example.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryGwarancja extends CrudRepository<Gwarancja, Integer> {

}
