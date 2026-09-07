package com.rajesh.Main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajesh.Entity.Festival;

public class FestivalDao {

    public static Festival getFestival(Integer id) {
        Session session = GetConnection.getSession();
        Festival festival = session.get(Festival.class, id);
        session.close();
        return festival;
    }

    public static void insert(Festival festival) {
        Session session = GetConnection.getSession();
        Transaction tx = session.beginTransaction();
        session.persist(festival);
        tx.commit();
        session.close();
    }
}