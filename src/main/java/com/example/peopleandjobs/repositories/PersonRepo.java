package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
