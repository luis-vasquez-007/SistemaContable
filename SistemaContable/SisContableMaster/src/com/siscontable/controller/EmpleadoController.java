package com.siscontable.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.siscontable.dao.EmpleadoDao;
import com.siscontable.entities.Empleado;

@ManagedBean
@RequestScoped
public class EmpleadoController {
	
	private Empleado empleado;
	private EmpleadoDao empleadoDao;
	public List<Empleado> ListEmpleado;
	
	public void mostrar() {
		ListEmpleado = new ArrayList<Empleado>();
		ListEmpleado = empleadoDao.mostrar();
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public EmpleadoDao getEmpleadoDao() {
		return empleadoDao;
	}
	public void setEmpleadoDao(EmpleadoDao empleadoDao) {
		this.empleadoDao = empleadoDao;
	}
	public List<Empleado> getListEmpleado() {
		return ListEmpleado;
	}
	public void setListEmpleado(List<Empleado> listEmpleado) {
		ListEmpleado = listEmpleado;
	}
	
	
	
}
