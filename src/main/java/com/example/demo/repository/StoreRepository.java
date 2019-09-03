package com.example.demo.repository;

import com.example.demo.model.Store;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface StoreRepository extends MongoRepository<Store, ObjectId> {


    Optional<Store> findBy_id(ObjectId objectId);

    Page<Store> findAll(Pageable pageable);

    Store findByUserId(ObjectId objectId);


}
