package com.tfs.hackathon.loader.repositories;

import com.tfs.hackathon.loader.entities.Journey;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author viswanath.ck
 */
public interface JourneyRepository extends MongoRepository<Journey, String> {

    Journey findById(Long id);

    List<Journey> findAll();
}
