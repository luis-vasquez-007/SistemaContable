package com.siscontable.dao;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractFacade<T> {
	
	private Class<T> entity;
	protected abstract EntityManager getEntityManager();
	
	public AbstractFacade(Class<T> entity) {
		this.entity = entity;
	}
	
	public void guardar(T entity) {
		EntityManager em = getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.getTransaction() == null && em.isOpen()) {
				em.getTransaction().rollback();
			}
		} finally {
			if(em.getTransaction() == null && em.isOpen()) {
				em.close();
			}
		}
		
	}
	
	public void modificar(T entity) {
		EntityManager em = getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.getTransaction() == null && em.isOpen()) {
				em.getTransaction().rollback();
			}
		} finally {
			if(em.getTransaction() == null && em.isOpen()) {
				em.close();
			}
		}
		
	}
	
	public void eliminar(T entity) {
		EntityManager em = getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if(em.getTransaction() == null && em.isOpen()) {
				em.getTransaction().rollback();
			}
		} finally {
			if(em.getTransaction() == null && em.isOpen()) {
				em.close();
			}
		}
		
	}
	
	public List<T> mostrar(){
		CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder().createQuery(entity);
		return getEntityManager().createQuery(cq).getResultList();
	}
	
	public T findById(Object id) {
		return getEntityManager().find(entity, id);
	}

}
