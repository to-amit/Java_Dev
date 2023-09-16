package org.example;

import javax.persistence.*;

@Entity
public class Questions {

    @Id
    @Column(name = "question_id")
    private int questionID;
    private String question;

    @OneToOne
    //to rename
    @JoinColumn
    private Answers answer;
    Questions(){

    }

    public Questions(int questionID, String question, Answers answer) {
        this.questionID = questionID;
        this.question = question;
        this.answer = answer;
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

    public Answers getAnswer() {
        return answer;
    }

    public void setAnswer(Answers answer) {
        this.answer = answer;
    }
}
