package com.tfs.hackathon.loader.controllers;

import com.tfs.hackathon.loader.entities.Journey;
import com.tfs.hackathon.loader.repositories.JourneyRepository;
import com.tfs.hackathon.loader.services.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author viswanath.ck
 */
@RestController
@RequestMapping("/journey")
public class JourneyController {

    @Autowired
    private JourneyRepository journeyRepository;

    @Autowired
    private JourneyService journeyService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Journey> getAllJourneys() {
        return journeyRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Journey getJourneyById(@PathVariable("id") Long id) {
        return journeyRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyJourneyById(@PathVariable("id") Long id, @Valid @RequestBody Journey journey) {
        //journey.set_id(id);
        journeyRepository.save(journey);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Journey createJourney(@Valid @RequestBody Journey journey) {
        //journey.set_id(id);
        journeyRepository.save(journey);
        return journey;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteJourney(@PathVariable Long id) {
        journeyRepository.delete(journeyRepository.findById(id));
    }
}
