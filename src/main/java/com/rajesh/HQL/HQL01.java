package com.rajesh.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rajesh.Entity.Festival;

public class HQL01 {

    public static void main(String[] args) {

        // 1. Create Configuration object
        Configuration configuration = new Configuration();

        // 2. Load hibernate.cfg.xml
        configuration.configure();

        // 3. Create SessionFactory
        SessionFactory sessionFactory =
                configuration.buildSessionFactory();

        // 4. Open Session
        Session s = sessionFactory.openSession();

        // 5. Write HQL query
        String hql = "FROM Festival WHERE id = :id";

        // 6. Create Query object
        Query<Festival> query =
                s.createQuery(hql, Festival.class);

        // 7. Set value for named parameter
        query.setParameter("id", 1);

        // 8. Execute query
        Festival data = query.uniqueResult();

        // 9. Print result
        System.out.println(data);

        // 10. Close Session
        s.close();

        // 11. Close SessionFactory
        sessionFactory.close();
    }
}