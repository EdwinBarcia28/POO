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

public class DaoVuelos {
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
	
	protected void crear(Vuelos vuelos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(vuelos);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Vuelos read(long id) {
		Session s =  sessionFactory.openSession();
		Vuelos vuelos = s.get(Vuelos.class, id);
		s.close();
		return vuelos;
	}
	
	protected void update(Vuelos vuelos) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(vuelos);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Vuelos vue = new Vuelos();
		vue.setId(id);
		s.delete(vue);
		s.getTransaction().commit();
		s.close();
	}

}
