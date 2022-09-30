package com.example.peopleandjobs.models;

import javax.persistence.*;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "jobTitle", nullable = false)
    private Persons jobTitle;
    @Column(nullable = false)
    private double salary;

    public Jobs(long id, Persons jobTitle, double salary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Jobs() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Persons getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Persons jobTitle) {
        this.jobTitle = jobTitle;
    }

}
