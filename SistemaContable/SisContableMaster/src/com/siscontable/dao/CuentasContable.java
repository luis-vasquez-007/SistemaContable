package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.utils.JPAUtils;

public class CuentasContable extends AbstractFacade<CuentasContable> implements Serializable {
	private static final long serialUID=1L;
	private EntityManager em;
	
	public CuentasContable() {
		super(CuentasContable.class);
		getEntityManager();
	}
	
	protected EntityManager getEntityManager() {
		if(em==null) {
			em = JPAUtils.getEntityManagerFactory().createEntityManager();
		} return em;
	}
}
