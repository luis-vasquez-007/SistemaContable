package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the familiar database table.
 * 
 */
@Entity
@NamedQuery(name="Familiar.findAll", query="SELECT f FROM Familiar f")
public class Familiar implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idFamilia;
	private String area;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private Date fechaCreacion;
	private String nombreFami;
	private String parentesco;
	private List<Empleado> empleados;

	public Familiar() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_familia")
	public int getIdFamilia() {
		return this.idFamilia;
	}

	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}


	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}


	public String getAtributo1() {
		return this.atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}


	public String getAtributo2() {
		return this.atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}


	public String getAtributo3() {
		return this.atributo3;
	}

	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}


	public String getAtributo4() {
		return this.atributo4;
	}

	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}


	public String getAtributo5() {
		return this.atributo5;
	}

	public void setAtributo5(String atributo5) {
		this.atributo5 = atributo5;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="nombre_fami")
	public String getNombreFami() {
		return this.nombreFami;
	}

	public void setNombreFami(String nombreFami) {
		this.nombreFami = nombreFami;
	}


	public String getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}


	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="familiar", fetch=FetchType.EAGER)
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setFamiliar(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setFamiliar(null);

		return empleado;
	}

}