package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnswerTest {

    private Answer correctAnswer;
    private Answer incorrectAnswer;

    @Before()
    public void before(){
        correctAnswer = new Answer("Liverpool", true);
        incorrectAnswer = new Answer("Manchester", false);
    }

    @Test
    public void answerHasAnswer(){
        assertEquals("Liverpool", correctAnswer.getAnswer());
        assertEquals("Manchester", incorrectAnswer.getAnswer());
    }

    @Test
    public void answerHasCorrectProperty(){
        assertEquals(true, correctAnswer.isCorrect());
        assertEquals(false, incorrectAnswer.isCorrect());
    }
}
