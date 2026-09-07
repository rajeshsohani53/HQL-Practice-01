package com.rajesh.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rajesh.Entity.Festival;

public class HQL02 {

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
        //String hql = "name FROM Festival ";//select name,description,month

        
//             Query<Object[]>q=s.createQuery("select name,description from Festival ",Festival.class);
//           List<Festival> data=q.getResultList();
//           for(Festival d:data)
//           {
//        	   System.out.println(d);
//           }
        
        Query<Object[]> q = s.createQuery(
        	    "SELECT name, description FROM Festival",
        	    Object[].class
        	);

        	List<Object[]> data = q.getResultList();

        	for (Object[] d : data) {
        	    System.out.println("Name: " + d[0]);
        	    System.out.println("Description: " + d[1]);
        	}
        
        
        
        // 6. Create Query object
        //Query<Festival> query =
             //   s.createQuery(hql, Festival.class);

        // 7. Set value for named parameter
        //query.setParameter("id", 1);
        
        // 8. Execute query
       // Festival data = (Festival) query.getParameters();

        // 9. Print result
        //System.out.println(data);

        // 10. Close Session
        s.close();

        // 11. Close SessionFactory
        sessionFactory.close();
    }
}