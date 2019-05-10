package com.io.hibernatemaven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		user.setId(1);
		user.setName("first user");
		user.setJoinedDate(new Date());
		user.setUserDescription("user description");

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();

		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
	}

}
