package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Persons;
import org.springframework.data.repository.CrudRepository;

public interface PersonsRepo extends CrudRepository<Persons, Long> {
}
