package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the proyecto database table.
 * 
 */
@Entity
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idProyecto;
	private BigDecimal anticipo;
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
	private BigDecimal avance;
	private String encargado;
	private Date fechaCreacion;
	private Date fechaFinalizacion;
	private Date fechaInicio;
	private BigDecimal montoFinal;
	private String nombreProyecto;
	private List<Movimiento> movimientos;

	public Proyecto() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proyecto")
	public int getIdProyecto() {
		return this.idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}


	public BigDecimal getAnticipo() {
		return this.anticipo;
	}

	public void setAnticipo(BigDecimal anticipo) {
		this.anticipo = anticipo;
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


	public BigDecimal getAvance() {
		return this.avance;
	}

	public void setAvance(BigDecimal avance) {
		this.avance = avance;
	}


	public String getEncargado() {
		return this.encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_finalizacion")
	public Date getFechaFinalizacion() {
		return this.fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	@Column(name="monto_final")
	public BigDecimal getMontoFinal() {
		return this.montoFinal;
	}

	public void setMontoFinal(BigDecimal montoFinal) {
		this.montoFinal = montoFinal;
	}


	@Column(name="nombre_proyecto")
	public String getNombreProyecto() {
		return this.nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}


	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="proyecto", fetch=FetchType.EAGER)
	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setProyecto(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setProyecto(null);

		return movimiento;
	}

}