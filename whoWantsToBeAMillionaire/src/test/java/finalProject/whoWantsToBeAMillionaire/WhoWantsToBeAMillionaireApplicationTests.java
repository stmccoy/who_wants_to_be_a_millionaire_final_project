package finalProject.whoWantsToBeAMillionaire;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import finalProject.whoWantsToBeAMillionaire.repositories.AnswerRepository;
import finalProject.whoWantsToBeAMillionaire.repositories.QuestionRepository;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhoWantsToBeAMillionaireApplicationTests {

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	AnswerRepository answerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindQuestionsByDifficulty(){
		int ordinal = 0;
		Difficulty difficulty = Difficulty.getDifficultyByOrdinal(ordinal);
		List<Question> found = questionRepository.findByDifficulty(difficulty);
		assertEquals(20, found.size());
	}

	@Test
	public void canFindAnswersByQuestionID(){
		Long questionId = new Long(1);
		List<Answer> found = answerRepository.findByQuestionId(questionId);
		assertEquals(4, found.size());
	}

}
