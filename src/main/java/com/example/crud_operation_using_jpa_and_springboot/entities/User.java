package com.example.crud_operation_using_jpa_and_springboot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CRUD_JPA")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String city;

    private String status;

    public User(int id, String name, String city, String status) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public User() {

    }

    public String toString() {
//        return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status]"
        return "id=" + id + "name=" + name + "city=" + city + "status=" + status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
