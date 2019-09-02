package com.example.demo.repository;

import com.example.demo.model.Store;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends MongoRepository<Store, ObjectId> {

    @Override
    Optional<Store> findById(ObjectId objectId);

    @Override
    List<Store> findAll();
}
