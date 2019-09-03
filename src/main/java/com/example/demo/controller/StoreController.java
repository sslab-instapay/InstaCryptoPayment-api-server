package com.example.demo.controller;

import com.example.demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

    @Autowired
    private StoreService service;

    @GetMapping
    public ResponseEntity storeList(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return ResponseEntity.ok(service.storeListByPage(page, size));
    }



}
