package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Selller {

    @Id
    public ObjectId _id;
    public String name;
    public String email;
    public String password;
    public String bankAccount;
    public String[] stores;
}
