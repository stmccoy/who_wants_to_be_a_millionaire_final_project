package finalProject.whoWantsToBeAMillionaire.models;

import java.util.List;

public class Question {

    private Long id;
    private String question;
    private List<Answer> answers;
    private Difficulty difficulty;

    public Question(String question, List<Answer> answers, Difficulty difficulty) {
        this.question = question;
        this.answers = answers;
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
