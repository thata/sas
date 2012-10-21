package com.example.sample.sas.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User implements Serializable {
    @Id
    public Integer id;
    public String name;
    public Integer age;
}

