package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Proyecto;
import com.siscontable.utils.JPAUtils;

public class ProyectoFacade extends AbstractFacade<Proyecto> implements Serializable{
	
	private static final long serialVersionUID=1L;
	private EntityManager em;
	
	public ProyectoFacade() {
		super(Proyecto.class);
		getEntityManager();
	}
	
	protected EntityManager getEntityManager() {
		if(em == null) {
			em = JPAUtils.getEntityManagerFactory().createEntityManager();
		} return em;
	}
	
}
