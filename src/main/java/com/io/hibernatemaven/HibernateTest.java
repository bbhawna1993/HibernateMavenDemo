package com.io.hibernatemaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

		Session session=sessionFactory.openSession();
		session.beginTransaction();

		Address address=new Address();
		address.setCity("Faridabad");
		address.setState("Haryana");
		address.setPin(121002);
		address.setStreet("friends enclave");

		UserDetails user=new UserDetails();
		user.setName("first user");
		user.setAddress(address);
		session.save(user);

		session.getTransaction().commit();
		session.close();
	}

}
