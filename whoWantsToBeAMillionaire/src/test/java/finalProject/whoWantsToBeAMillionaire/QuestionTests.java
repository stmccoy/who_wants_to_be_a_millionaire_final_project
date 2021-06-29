package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QuestionTests {

    public  Question question;

    @Before
    public void before(){
        question = new Question("What is the capital of the UK", Difficulty.ONE);
    }

    @Test
    public void questionHasQuestionProperty(){
        assertEquals("What is the capital of the UK", question.getQuestion());
    }

    @Test
    public void questionHasDifficulty(){
        assertEquals(Difficulty.ONE, question.getDifficulty());
    }

    @Test
    public void questionHasAnswersArray(){
        assertEquals(0, question.getAnswers().size());
    }
}
