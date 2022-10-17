package com.example.peopleandjobs.controllers;

import com.example.peopleandjobs.repositories.JobsRepo;
import com.example.peopleandjobs.repositories.PersonsRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobsController {

    private final JobsRepo jobsDao;
    private final PersonsRepo personsDao;


    public JobsController(JobsRepo jobsDao, PersonsRepo personsDao) {
        this.jobsDao = jobsDao;
        this.personsDao = personsDao;
    }


    @GetMapping("/index-jobs")
    public String index(Model model) {
        model.addAttribute("jobs", jobsDao.findAll());
        model.addAttribute("persons", personsDao.findAll());
        return "jobs/index-jobs";
    }
}
