package com.example.demo.repositorytest;

import com.example.demo.model.Store;
import com.example.demo.repository.StoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreRepositoryTests {

    @Autowired
    StoreRepository repository;

    @Test
    public void readingStoresAllCorrectly() {
        System.out.println(repository.findAll().get(0).getDescription());
    }
}
