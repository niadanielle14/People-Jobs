package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persons {

    private long id;
    private String name;
    private int age;
    private int dateJoined;
    private int dateUpdated;

    public Persons(long id, String name, int age, int dateJoined, int dateUpdated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateJoined = dateJoined;
        this.dateUpdated = dateUpdated;
    }

    public Persons() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(int dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(int dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

}
