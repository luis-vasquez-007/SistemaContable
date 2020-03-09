package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Cargo;
import com.siscontable.utils.JPAUtils;

public class CargoDao extends AbstractFacade<Cargo> implements Serializable{
	
	public CargoDao() {
		super(Cargo.class);
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
