package org.example;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {
    @Id
    @Column(name = "answer_id")
    private int answerID;

    private String answer;

    public int getAnswerID() {
        return answerID;
    }
    Answers(){

    }
    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answers(int answerID, String answer) {
        this.answerID = answerID;
        this.answer = answer;
    }
}
