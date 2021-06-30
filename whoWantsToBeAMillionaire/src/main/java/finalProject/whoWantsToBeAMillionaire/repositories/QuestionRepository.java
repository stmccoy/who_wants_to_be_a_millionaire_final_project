package finalProject.whoWantsToBeAMillionaire.repositories;

import finalProject.whoWantsToBeAMillionaire.models.Difficulty;
import finalProject.whoWantsToBeAMillionaire.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByDifficulty(Difficulty difficulty);

}
