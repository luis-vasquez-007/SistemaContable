package com.siscontable.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.siscontable.dao.PaisDao;
import com.siscontable.entities.Pais;

@ManagedBean
@RequestScoped
public class PaisController {
	private Pais pais;
	private PaisDao paisdao;
	public List<Pais> listaPais;
	
	@PostConstruct
	public void init() {
		pais = new Pais();
		paisdao = new PaisDao();
		mostrar();
	}
	
	public void mostrar() {
		listaPais = new ArrayList<Pais>();
		listaPais = paisdao.mostrar();
	}
	
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public PaisDao getPaisdao() {
		return paisdao;
	}
	public void setPaisdao(PaisDao paisdao) {
		this.paisdao = paisdao;
	}
	public List<Pais> getListaPais() {
		return listaPais;
	}
	public void setListaPais(List<Pais> listaPais) {
		this.listaPais = listaPais;
	}
	
	
	
}
