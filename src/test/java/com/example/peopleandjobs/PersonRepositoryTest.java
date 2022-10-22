package com.example.peopleandjobs;

import com.example.peopleandjobs.models.Person;
import com.example.peopleandjobs.repositories.PersonRepo;
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
public class PersonRepositoryTest {
    @Autowired private PersonRepo repo;

    @Test //TESTING ADD NEW PERSON
    public void testAddNewPerson() {
        Person person = new Person();
        person.setAge(73);
        person.setFirstName("Nia");
        person.setLastName("Watson");
        person.setImg("filestack");
        person.setJobTitle("SWE");

        Person savedPerson = repo.save(person);

        Assertions.assertThat(savedPerson).isNotNull();
        Assertions.assertThat(savedPerson.getId()).isGreaterThan(0);
    }

    @Test
    public void testFindAllPerson() {
        List<Person> people = repo.findAll();
        Assertions.assertThat(people).hasSizeGreaterThan(0);

        for (Person person : people) {
            System.out.println(people);
        }
    }

    @Test
    public long testUpdatePerson() {
        Person person = repo.getReferenceById();
        int personId = 1;
        repo.getReferenceById((long) personId);

        return 0;
    }



}
