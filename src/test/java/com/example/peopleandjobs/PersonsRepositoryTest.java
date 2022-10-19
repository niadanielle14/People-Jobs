package com.example.peopleandjobs;

import com.example.peopleandjobs.models.Persons;
import com.example.peopleandjobs.repositories.PersonsRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class PersonsRepositoryTest {
    @Autowired private PersonsRepo repo;

    @Test //TESTING ADD NEW PERSON
    public void testAddNewPersons() {
        Persons persons = new Persons();
        persons.setAge(73);
        persons.setFirstName("Nia");
        persons.setLastName("Watson");
        persons.setImg("filestack");
        persons.setJobTitle("SWE");

        Persons savedPersons = repo.save(persons);

        Assertions.assertThat(savedPersons).isNotNull();
        Assertions.assertThat(savedPersons.getId()).isGreaterThan(0);
    }

    @Test
    public void testFindAllPersons() {
        List<Persons> person = repo.findAll();
        Assertions.assertThat(person).hasSizeGreaterThan(0);

        for (Persons persons : person) {
            System.out.println(person);
        }
    }

}
