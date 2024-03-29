package com.example.sample.sas.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    public Integer id;
    public String name;
    public Integer age;
}

