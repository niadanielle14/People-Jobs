package com.example.peopleandjobs.repositories;

import com.example.peopleandjobs.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}
