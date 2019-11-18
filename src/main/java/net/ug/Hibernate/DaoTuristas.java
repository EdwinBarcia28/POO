/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoTuristas {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	protected void crear(Turista turista) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(turista);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Turista read(long id) {
		Session s =  sessionFactory.openSession();
		Turista turista = s.get(Turista.class, id);
		s.close();
		return turista;
	}
	
	protected void update(Turista turista) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(turista);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Turista turista = new Turista();
		turista.setId(id);
		s.delete(turista);
		s.getTransaction().commit();
		s.close();
	}

}
