package com.siscontable.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	public static final String Unidad_Persistencia ="SisContable";
	public static EntityManagerFactory emf;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory(Unidad_Persistencia);
		}
		return emf;
		
	}
	
}
