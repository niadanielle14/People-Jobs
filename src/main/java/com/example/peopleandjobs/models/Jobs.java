package com.example.peopleandjobs.models;

import javax.persistence.*;

@Entity
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String jobTitle;
    @Column(nullable = false)
    private double salary;

    public Jobs(long id, String jobsTitle, double salary) {
        this.id = id;
        this.jobTitle = jobsTitle;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

}
