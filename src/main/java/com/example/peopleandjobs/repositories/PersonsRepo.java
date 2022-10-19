package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepo extends JpaRepository<Persons, Long> {
}
