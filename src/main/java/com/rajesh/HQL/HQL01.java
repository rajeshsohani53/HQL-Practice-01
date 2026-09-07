package com.rajesh.HQL;
import java.util.List;
import java.util.Queue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.rajesh.Entity.Festival;
import com.rajesh.Main.GetConnection;

public class HQL01 {
  public static void main(String[] args) {
	  
	  Configuration configuration = new Configuration();
      configuration.configure();
      SessionFactory sessionFactory = configuration.buildSessionFactory();
	  
	   	Session s=sessionFactory.openSession();
	    String sql="From Festival";
	    Query<Festival> query=s.createQuery(sql,Festival.class);
	    List<Festival> data=query.getResultList();
	    for(Festival d:data)
	    {
	    	System.out.println(d);
	    }
}
}
