package com.model;
import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;

import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HBUtil {

	private static SessionFactory sf1 = null;

	public static StandardServiceRegistry registry =null;

	

	public static SessionFactory getSessionFactory() {

		if(sf1==null) {

			try {

			registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

			MetadataSources mds = new MetadataSources(registry);

			Metadata md = mds.getMetadataBuilder().build();

			sf1 = md.getSessionFactoryBuilder().build();

		}catch(Exception e) {

			e.printStackTrace();

			if(registry!=null) {

				StandardServiceRegistryBuilder.destroy(registry);

			}

		}

		}

		return sf1;

	}

}