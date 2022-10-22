package com.example.peopleandjobs.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String img;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private int age;
    @OneToOne
    @JoinColumn(name = "job_title", referencedColumnName="jobTitle")
    private Jobs jobTitle;
    @Column(columnDefinition = "date")
    private Date dateJoined;
    @Column(columnDefinition = "date")
    private Date dateUpdated;

    public Persons(long id, String firstName, String lastName, int age, Date dateJoined, Date dateUpdated, Jobs jobTitle, String img) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateJoined = dateJoined;
        this.dateUpdated = dateUpdated;
        this.jobTitle =  jobTitle;
        this.img = img;
    }

    public Persons() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    public Jobs getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Jobs jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", dateJoined=" + dateJoined +
                ", dateUpdated=" + dateUpdated +
                '}';
    }


}

