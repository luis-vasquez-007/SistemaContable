package com.siscontable.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.siscontable.dao.EstadoDao;
import com.siscontable.entities.Estado;

@ManagedBean
@RequestScoped
public class EstadoController {
	
	private Estado estado;
	private EstadoDao estadodao;
	public List<Estado> listaEstado;
	
	@PostConstruct
	public void init() {
		estado = new Estado();
		estadodao = new EstadoDao();
		
		mostrar();
	}
	
	public void mostrar() {
		listaEstado = new ArrayList<Estado>();
		listaEstado = estadodao.mostrar();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public EstadoDao getEstadodao() {
		return estadodao;
	}

	public void setEstadodao(EstadoDao estadodao) {
		this.estadodao = estadodao;
	}

	public List<Estado> getListaEstado() {
		return listaEstado;
	}

	public void setListaEstado(List<Estado> listaEstado) {
		this.listaEstado = listaEstado;
	}
	
	
	
}
