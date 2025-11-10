package com.jpahiberanet.example.hospital_management_db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="doctor")
public class Doctor {

    @Id
    @Column(name="id",nullable = false, unique = true)
    private int id;

    @Column  (name="name",nullable = false)
    private String name;

    @Column (name="email",nullable = false,unique = true)
    private String email;

    @Column (name="specialization",nullable = false)
    private String specialization;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
