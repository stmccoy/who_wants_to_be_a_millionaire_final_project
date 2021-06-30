package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnswerTest {

    private Question question;
    private Question questionTwo;
    private Answer correctAnswer;
    private Answer incorrectAnswer;

    @Before()
    public void before(){
        question = new Question("What is the capital of england", Difficulty.ZERO);
        correctAnswer = new Answer("Liverpool", question, true);
        incorrectAnswer = new Answer("Manchester", question, false);
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

    @Test
    public void answerHasQuestion(){
        assertEquals(question, correctAnswer.getQuestion());
    }

    @Test
    public void canSetAnswer(){
        correctAnswer.setAnswer("Stockport");
        assertEquals("Stockport", correctAnswer.getAnswer());
    }

    @Test
    public void canSetCorrectProperty(){
        correctAnswer.setCorrect(false);
        assertEquals(false, correctAnswer.isCorrect());
    }

    @Test
    public void answerCanSetQuestion(){
        correctAnswer.setQuestion(questionTwo);
        assertEquals(questionTwo, correctAnswer.getQuestion());
    }

}
