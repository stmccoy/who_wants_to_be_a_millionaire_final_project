package finalProject.whoWantsToBeAMillionaire.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question")
    private String question;

    @JsonIgnoreProperties({"question"})
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @Enumerated(EnumType.ORDINAL)
    @Column(name= "difficulty")
    private Difficulty difficulty;

    public Question(String question, Difficulty difficulty) {
        this.question = question;
        this.answers = new ArrayList<>();
        this.difficulty = difficulty;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
