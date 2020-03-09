package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cargo database table.
 * 
 */
@Entity
@NamedQuery(name="Cargo.findAll", query="SELECT c FROM Cargo c")
public class Cargo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idCargo;
	private String atributo1;
	private String atributo10;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private String atributo6;
	private String atributo7;
	private String atributo8;
	private String atributo9;
	private Date fechaCreacion;
	private String nombre;
	private List<Empleado> empleados;

	public Cargo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cargo")
	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}


	public String getAtributo1() {
		return this.atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}


	public String getAtributo10() {
		return this.atributo10;
	}

	public void setAtributo10(String atributo10) {
		this.atributo10 = atributo10;
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


	public String getAtributo6() {
		return this.atributo6;
	}

	public void setAtributo6(String atributo6) {
		this.atributo6 = atributo6;
	}


	public String getAtributo7() {
		return this.atributo7;
	}

	public void setAtributo7(String atributo7) {
		this.atributo7 = atributo7;
	}


	public String getAtributo8() {
		return this.atributo8;
	}

	public void setAtributo8(String atributo8) {
		this.atributo8 = atributo8;
	}


	public String getAtributo9() {
		return this.atributo9;
	}

	public void setAtributo9(String atributo9) {
		this.atributo9 = atributo9;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="cargo", fetch=FetchType.EAGER)
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setCargo(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setCargo(null);

		return empleado;
	}

}