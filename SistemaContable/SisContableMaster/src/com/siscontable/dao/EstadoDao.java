package com.siscontable.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.siscontable.entities.Estado;
import com.siscontable.utils.JPAUtils;

public class EstadoDao extends AbstractFacade<Estado> implements Serializable{
	
	public EstadoDao() {
		super(Estado.class);
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
	
	public Estado PaisxDepartamento (Estado idpais) {
		Estado  c = new Estado();
		
		try {
			TypedQuery<Estado> query = em.createQuery("SELECT c FROM Cuenta c WHERE c.numeroCuenta = :numeroCuenta", Estado.class);
			query.setParameter("numeroCuenta", idpais.getPais().getIdPais());
			
			c = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public List<Estado> findPais(int idPais) {
		em.getTransaction().begin();
		String sql = "SELECT * FROM Estado WHERE id_pais =" + idPais +";";
		List<Estado> lista = null; 
		
		try {
			lista = em.createNativeQuery(sql, Estado.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		
		if (lista == null) {
			lista = new ArrayList<Estado>();
		}
		return lista;

		
	}
	
}
