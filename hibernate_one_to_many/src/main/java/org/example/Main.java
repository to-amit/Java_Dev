package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // creating question
        Questions q1 = new Questions();
        q1.setQuestionID(100);
        q1.setQuestion("What is java ?");

        //creating answer

        Answers ans1 = new Answers();
        ans1.setAnswerID(500);
        ans1.setAnswer("Java is programming language");
        ans1.setQuestions(q1);

        Answers ans2 = new Answers();
        ans2.setAnswerID(501);
        ans2.setAnswer("It is api to work with objects in java");
        ans2.setQuestions(q1);

        Answers ans3 = new Answers();
        ans3.setAnswerID(502);
        ans3.setAnswer("It is api to work with objects in java");
        ans3.setQuestions(q1);

        List<Answers> list = new ArrayList<Answers>();
        list.add(ans1);
        list.add(ans2);
        list.add(ans3);

        q1.setAnswers(list);



        //session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        //save
        session.save(q1);
//        session.save(list);
        session.save(ans1);
        session.save(ans2);
        session.save(ans3);

        tx.commit();


        session.close();
        factory.close();


    }
}