/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;

/**
 *
 * @author Usuario
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoHotel {
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
	
	protected void crear(Hotel hotel) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(hotel);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Hotel read(long id) {
		Session s =  sessionFactory.openSession();
		Hotel hotel = s.get(Hotel.class, id);
		s.close();
		return hotel;
	}
	
	protected void update(Hotel hotel) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(hotel);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Hotel hotel = new Hotel();
		hotel.setId(id);
		s.delete(hotel);
		s.getTransaction().commit();
		s.close();
	}

}
