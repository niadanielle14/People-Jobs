package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Jobs;
import org.springframework.data.repository.CrudRepository;

public interface JobsRepo extends CrudRepository<Jobs, Long> {
}
