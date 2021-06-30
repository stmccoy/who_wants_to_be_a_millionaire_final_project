package finalProject.whoWantsToBeAMillionaire.controllers;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswersController {

    @Autowired
    AnswerRepository answerRepository;

    @GetMapping("/answers")
    public ResponseEntity<List<Answer>> getAllAnswers(){
        List<Answer> foundAnswers = answerRepository.findAll();
        return new ResponseEntity<>(foundAnswers, HttpStatus.OK);
    }
}
