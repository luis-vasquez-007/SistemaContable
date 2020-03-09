package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the movimiento database table.
 * 
 */
@Entity
@NamedQuery(name="Movimiento.findAll", query="SELECT m FROM Movimiento m")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idMovimiento;
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
	private int estadoMovimiento;
	private Date fechaCreacion;
	private String nombreMovimiento;
	private String observaciones;
	private BigDecimal total;
	private CuentasContable cuentasContable;
	private Departamento departamento;
	private Proveedor proveedor;
	private Proyecto proyecto;

	public Movimiento() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_movimiento")
	public int getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
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


	@Column(name="estado_movimiento")
	public int getEstadoMovimiento() {
		return this.estadoMovimiento;
	}

	public void setEstadoMovimiento(int estadoMovimiento) {
		this.estadoMovimiento = estadoMovimiento;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="nombre_movimiento")
	public String getNombreMovimiento() {
		return this.nombreMovimiento;
	}

	public void setNombreMovimiento(String nombreMovimiento) {
		this.nombreMovimiento = nombreMovimiento;
	}


	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	//bi-directional many-to-one association to CuentasContable
	@ManyToOne
	@JoinColumn(name="id_cuenta")
	public CuentasContable getCuentasContable() {
		return this.cuentasContable;
	}

	public void setCuentasContable(CuentasContable cuentasContable) {
		this.cuentasContable = cuentasContable;
	}


	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="id_departamento")
	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="id_proyecto")
	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}