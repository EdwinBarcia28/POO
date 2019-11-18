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

public class DaoSucursal {
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
	
	protected void crear(Sucursal sucursal) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.save(sucursal);
		s.getTransaction().commit();
		s.close();
	}
	
	protected Sucursal read(long id) {
		Session s =  sessionFactory.openSession();
		Sucursal sucursal = s.get(Sucursal.class, id);
		s.close();
		return sucursal;
	}
	
	protected void update(Sucursal sucursal) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(sucursal);
		s.getTransaction().commit();
		s.close();
	}
	
	
	protected void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Sucursal sucu = new Sucursal();
		sucu.setId(id);
		s.delete(sucu);
		s.getTransaction().commit();
		s.close();
	}

}
