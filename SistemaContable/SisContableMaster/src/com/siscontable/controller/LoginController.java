package com.siscontable.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@RequestScoped
public class LoginController {
	
	public String ira() {
		return "registro_empresa.xhtml";
	}

	public String ira2() {
		return "registrar_usuario.xhtml";
	}
}
