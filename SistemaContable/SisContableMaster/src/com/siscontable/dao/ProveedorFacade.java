package com.siscontable.dao;

import java.io.Serializable;


import javax.persistence.EntityManager;

import com.siscontable.entities.Proveedor;
import com.siscontable.utils.JPAUtils;

public class ProveedorFacade extends AbstractFacade<Proveedor> implements Serializable{
	
	private static final long serialVersionUID=1L;
	private EntityManager em;
	
	public ProveedorFacade() {
		super(Proveedor.class);
		getEntityManager();
	}
	
	protected EntityManager getEntityManager() {
		if(em==null) {
			em = JPAUtils.getEntityManagerFactory().createEntityManager();
		} return em;
	}
	
}
