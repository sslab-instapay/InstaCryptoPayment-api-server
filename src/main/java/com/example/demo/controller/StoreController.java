package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity storeList(){
        return null;
    }

}
