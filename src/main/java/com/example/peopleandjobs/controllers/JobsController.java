package com.example.peopleandjobs.controllers;

import com.example.peopleandjobs.repositories.JobRepo;
import com.example.peopleandjobs.repositories.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobsController {

    private final JobRepo jobsDao;
    private final PersonRepo personsDao;


    public JobsController(JobRepo jobsDao, PersonRepo personsDao) {
        this.jobsDao = jobsDao;
        this.personsDao = personsDao;
    }


    @GetMapping("/index-jobs")
    public String index(Model model) {
//        model.addAttribute("jobs", jobsDao.findAll());
        return "jobs/index-jobs";
    }
}
