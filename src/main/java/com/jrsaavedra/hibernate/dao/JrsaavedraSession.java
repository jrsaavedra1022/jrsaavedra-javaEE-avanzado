package com.jrsaavedra.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JrsaavedraSession {
	// attributes
	private Session session;
	
	public JrsaavedraSession() {
		super();
		// Crear session para la base de datos
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		this.session = sessionFactory.openSession();
		this.session.beginTransaction();
	}

	public Session getSession() {

		return this.session;
	}

}
