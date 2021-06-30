package finalProject.whoWantsToBeAMillionaire.controllers;

import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import finalProject.whoWantsToBeAMillionaire.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionsController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        List<Question> foundQuestions = questionRepository.findAll();
        return new ResponseEntity<>(foundQuestions, HttpStatus.OK);
    }

    @GetMapping("/questions/{enumOrdinal}")
    public ResponseEntity<List<Question>> getQuestionsByDifficultyNumber(@PathVariable int enumOrdinal){
        Difficulty difficulty = Difficulty.getDifficultyByOrdinal(enumOrdinal);
        List<Question> foundQuestions = questionRepository.findByDifficulty(difficulty);
        return new ResponseEntity<>(foundQuestions, HttpStatus.OK);
    }

}
