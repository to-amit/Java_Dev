package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Questions {

    @Id
    @Column(name = "question_id")
    private int questionID;
    private String question;

    @OneToMany(mappedBy = "questions")
    private List<Answers> answers;
    Questions(){

    }

    public Questions(int questionID, String question, List<Answers> answers) {
        this.questionID = questionID;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}
