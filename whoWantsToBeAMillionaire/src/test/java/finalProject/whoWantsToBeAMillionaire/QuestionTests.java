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

    private  Question question;
    private List<Answer> answers;
    private Answer answerOne;
    private Answer answerTwo;
    private Answer answerThree;
    private Answer answerFour;

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

    @Test
    public void canSetQuestionAnswersArray(){
        //arrange
        answerOne = new Answer("London", true);
        answerTwo = new Answer("Manchester", false);
        answerThree = new Answer("Bristol", false);
        answerFour = new Answer("Edinburgh", false);
        answers = new ArrayList<>();
        answers.add(answerOne);
        answers.add(answerTwo);
        answers.add(answerThree);
        answers.add(answerFour);

        //act
        question.setAnswers(answers);

        //assert
        assertEquals(4, question.getAnswers().size());
        assertEquals(true, question.getAnswers().contains(answerOne));
        assertEquals(true, question.getAnswers().contains(answerTwo));
        assertEquals(true, question.getAnswers().contains(answerThree));
        assertEquals(true, question.getAnswers().contains(answerFour));
    }

    @Test
    public void canSetQuestion(){
        question.setQuestion("What is the distance between India and Nepal");
        assertEquals("What is the distance between India and Nepal", question.getQuestion());
    }

    @Test
    public void canSetDifficulty(){
        question.setDifficulty(Difficulty.TWO);
        assertEquals(Difficulty.TWO, question.getDifficulty());
    }
}
