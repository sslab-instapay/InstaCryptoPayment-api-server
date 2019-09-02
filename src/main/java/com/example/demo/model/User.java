package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    private ObjectId _id;
    private String name;
    private String email;
    private String password;
    private String walletAddress;


}
