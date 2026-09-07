package com.rajesh.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rajesh.Entity.Festival;

public class Application {
  public static void main(String[] args) {
//	Configuration configuration=new Configuration();
//	configuration.configure();
//	 SessionFactory sessionFactory= configuration.buildSessionFactory();
//	 Session session= sessionFactory.openSession();
//	 Transaction transaction= session.beginTransaction();
	  Festival f1 = new Festival();
	  f1.setName("Diwali");
	  f1.setDescription("Festival of lights celebrating victory of good over evil");
	  f1.setMonth("October");
	  f1.setSweet("Kaju Katli");

	  Festival f2 = new Festival();
	  f2.setName("Holi");
	  f2.setDescription("Festival of colors celebrating arrival of spring");
	  f2.setMonth("March");
	  f2.setSweet("Gujiya");

	  Festival f3 = new Festival();
	  f3.setName("Ganesh Chaturthi");
	  f3.setDescription("Birthday celebration of Lord Ganesha");
	  f3.setMonth("September");
	  f3.setSweet("Modak");

	  Festival f4 = new Festival();
	  f4.setName("Makar Sankranti");
	  f4.setDescription("Harvest festival marking sun transition into Capricorn");
	  f4.setMonth("January");
	  f4.setSweet("Tilgul");

	  Festival f5 = new Festival();
	  f5.setName("Raksha Bandhan");
	  f5.setDescription("Celebration of bond between brothers and sisters");
	  f5.setMonth("August");
	  f5.setSweet("Barfi");

	  Festival f6 = new Festival();
	  f6.setName("Janmashtami");
	  f6.setDescription("Birthday celebration of Lord Krishna");
	  f6.setMonth("August");
	  f6.setSweet("Peda");
	  
	  FestivalDao.insert(f1);
	  FestivalDao.insert(f2);
	  FestivalDao.insert(f3);
	  FestivalDao.insert(f4);
	  FestivalDao.insert(f5);
	  FestivalDao.insert(f6);
	 
	 
}
}
