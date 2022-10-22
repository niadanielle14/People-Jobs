package com.example.peopleandjobs.controllers;

import com.example.peopleandjobs.repositories.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class personsController {

    private final PersonRepo personsDao;


    public personsController(PersonRepo personsDao) {
        this.personsDao = personsDao;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("persons", personsDao.findAll());
        return "persons/index";
    }

}
