package com.io.hibernatemaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		user.setId(5);
		user.setName("bhawna5");

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
	}

}
