package com.siscontable.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.siscontable.dao.UsuarioDao;
import com.siscontable.entities.Empleado;
import com.siscontable.entities.Empresa;
import com.siscontable.entities.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioController {
	private Usuario user;
	private UsuarioDao userDao;
	public List<Usuario> listUser;
	int idEmp;
	
	
	@PostConstruct
	public void init() {
		user = new Usuario();
		userDao = new UsuarioDao();
		
		idEmp=0;
		mostrar();
	}
	
	public void mostrar() {
		listUser = new ArrayList<Usuario>();
		listUser = userDao.mostrar();
	}
	
	public void guardar() {
		try {
			Empresa idEmpl = new Empresa();
			idEmpl.setIdEmpresa(idEmp);
			user.setEmpresa(idEmpl);
			
			userDao.guardar(user);
			mensaje("Exito");
		} catch (Exception e) {
			mensaje("Falso");
		}
	}
	
	public void modificar() {
		try {
			userDao.modificar(user);
			mensaje("Exito");
		} catch (Exception e) {
			mensaje("Falso");
		}
	}
	
	public void eliminar(Usuario idUser) {
		try {
			userDao.eliminar(idUser);
			mensaje("exito");
		} catch (Exception e) {
			mensaje("falso");
		}	
	}
	
	
	public void mensaje(String respuesta) {
		FacesMessage mensaje = new  FacesMessage(respuesta);
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
	}
	
	public String ira() {
		return "registro_usuario.xhtml";
	}

	
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public UsuarioDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UsuarioDao userDao) {
		this.userDao = userDao;
	}
	public List<Usuario> getListuser() {
		return listUser;
	}
	public void setListuser(List<Usuario> listUser) {
		this.listUser = listUser;
	}

	public int getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}
	
	
}
