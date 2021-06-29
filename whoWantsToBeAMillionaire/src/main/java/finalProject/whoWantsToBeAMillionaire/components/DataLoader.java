package finalProject.whoWantsToBeAMillionaire.components;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import finalProject.whoWantsToBeAMillionaire.repositories.AnswerRepository;
import finalProject.whoWantsToBeAMillionaire.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Question questionOne = new Question("What is the capital of the UK", Difficulty.ONE);
        questionRepository.save(questionOne);

        Answer q1AnswerOne = new Answer("London", questionOne, true);
        answerRepository.save(q1AnswerOne);

        Answer q1AnswerTwo = new Answer("New York", questionOne, false);
        answerRepository.save(q1AnswerTwo);

        Answer q1AnswerThree = new Answer("Dublin", questionOne, false);
        answerRepository.save(q1AnswerThree);

        Answer q1AnswerFour = new Answer("Edinburgh", questionOne, false);
        answerRepository.save(q1AnswerFour);
    }
}
