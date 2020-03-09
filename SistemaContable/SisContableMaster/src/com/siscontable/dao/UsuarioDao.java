package com.siscontable.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.siscontable.entities.Usuario;
import com.siscontable.utils.JPAUtils;

public class UsuarioDao extends AbstractFacade<Usuario> implements Serializable{
	public UsuarioDao() {
		super(Usuario.class);

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
