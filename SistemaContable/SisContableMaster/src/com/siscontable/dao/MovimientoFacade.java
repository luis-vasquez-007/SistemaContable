package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Movimiento;
import com.siscontable.utils.JPAUtils;

public class MovimientoFacade extends AbstractFacade<Movimiento> implements Serializable{
	
	private static final long serialVersionUID=1L;
	private EntityManager em;
	
	public MovimientoFacade() {
		super(Movimiento.class);
		getEntityManager();
	}
	
	protected EntityManager getEntityManager() {
		if(em==null) {
			em = JPAUtils.getEntityManagerFactory().createEntityManager();
		} return em;
	}
	
}
