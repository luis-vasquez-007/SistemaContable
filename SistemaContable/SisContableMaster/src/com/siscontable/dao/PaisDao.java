package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Pais;
import com.siscontable.utils.JPAUtils;

public class PaisDao extends AbstractFacade<Pais> implements Serializable {
	public PaisDao() {
		super(Pais.class);
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EntityManager em;
	
	
	@Override
	protected EntityManager getEntityManager() {
		if(em == null) {
			em = JPAUtils.getEntityManagerFactory().createEntityManager();
		}
		return em;
	}
}
