package com.example.demo.service;

import com.example.demo.model.Store;
import com.example.demo.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class StoreService {

    @Autowired
    private StoreRepository repository;

    public Page<Store> storeListByPage(int pageNum, int pageSize){
        Pageable pageable = PageRequest.of(pageNum,pageSize);
        return repository.findAll(pageable);
    }




}
