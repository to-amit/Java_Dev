package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        Questions q2 = new Questions();
        q1.setQuestionID(101);
        q1.setQuestion("What is collection framework ?");


        //creating answer

        Answers ans1 = new Answers();
        ans1.setAnswerID(200);
        ans1.setAnswer("Java is programming language");

        Answers ans2 = new Answers();
        ans1.setAnswerID(201);
        ans1.setAnswer("It is api to work with objects in java");

        q1.setAnswer(ans1);
        q2.setAnswer(ans2);


        //session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        //save
        session.save(q1);
        session.save(ans1);
        session.save(q2);
        session.save(ans2);

        tx.commit();


        session.close();
        factory.close();


    }
}