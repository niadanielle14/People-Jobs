package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepo extends JpaRepository<Jobs, Long> {
}
