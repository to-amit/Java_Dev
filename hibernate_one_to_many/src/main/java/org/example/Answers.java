package org.example;


import javax.persistence.*;

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
    @ManyToOne
    private Questions questions;

    public Answers(int answerID, String answer, Questions questions) {
        this.answerID = answerID;
        this.answer = answer;
        this.questions = questions;
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

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }
}
