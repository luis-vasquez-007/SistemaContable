package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Departamento;
import com.siscontable.utils.JPAUtils;

public class DepartamentoDao extends AbstractFacade<Departamento> implements Serializable{
	
	public DepartamentoDao() {
		super(Departamento.class);

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
