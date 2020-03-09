package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Empresa;
import com.siscontable.utils.JPAUtils;

public class EmpresaDao extends AbstractFacade<Empresa> implements Serializable{
	
	public EmpresaDao() {
		super(Empresa.class);
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
