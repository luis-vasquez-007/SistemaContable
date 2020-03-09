package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Familiar;
import com.siscontable.utils.JPAUtils;

public class FamiliarDao extends AbstractFacade<Familiar> implements Serializable{

	public FamiliarDao() {
		super(Familiar.class);	
	}

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
