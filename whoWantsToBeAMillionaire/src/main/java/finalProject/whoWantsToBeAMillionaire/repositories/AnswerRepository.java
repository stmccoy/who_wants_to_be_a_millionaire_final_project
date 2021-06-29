package finalProject.whoWantsToBeAMillionaire.repositories;

import finalProject.whoWantsToBeAMillionaire.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
