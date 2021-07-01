package finalProject.whoWantsToBeAMillionaire.controllers;

import finalProject.whoWantsToBeAMillionaire.models.Round;
import finalProject.whoWantsToBeAMillionaire.repositories.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoundController {

    @Autowired
    RoundRepository roundRepository;

    @GetMapping("/rounds")
    public ResponseEntity<List<Round>> getAllRounds(){
        List<Round> foundRounds = roundRepository.findAll();
        return new ResponseEntity<>(foundRounds, HttpStatus.OK);
    }
}
