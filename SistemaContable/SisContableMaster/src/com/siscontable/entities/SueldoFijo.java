package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sueldo_fijo database table.
 * 
 */
@Entity
@Table(name="sueldo_fijo")
@NamedQuery(name="SueldoFijo.findAll", query="SELECT s FROM SueldoFijo s")
public class SueldoFijo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idSalario;
	private byte aguinaldo;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private String atributo6;
	private String atributo7;
	private String atributo8;
	private int cantAguinaldo;
	private int diasLaborados;
	private int diasVacacionados;
	private Date fechaCreacion;
	private int horasLaboradas;
	private BigDecimal sueldo;
	private byte vacaciones;
	private DeducionesLegale deducionesLegale;
	private Empleado empleado;

	public SueldoFijo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_salario")
	public int getIdSalario() {
		return this.idSalario;
	}

	public void setIdSalario(int idSalario) {
		this.idSalario = idSalario;
	}


	public byte getAguinaldo() {
		return this.aguinaldo;
	}

	public void setAguinaldo(byte aguinaldo) {
		this.aguinaldo = aguinaldo;
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


	@Column(name="cant_aguinaldo")
	public int getCantAguinaldo() {
		return this.cantAguinaldo;
	}

	public void setCantAguinaldo(int cantAguinaldo) {
		this.cantAguinaldo = cantAguinaldo;
	}


	@Column(name="dias_laborados")
	public int getDiasLaborados() {
		return this.diasLaborados;
	}

	public void setDiasLaborados(int diasLaborados) {
		this.diasLaborados = diasLaborados;
	}


	@Column(name="dias_vacacionados")
	public int getDiasVacacionados() {
		return this.diasVacacionados;
	}

	public void setDiasVacacionados(int diasVacacionados) {
		this.diasVacacionados = diasVacacionados;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="horas_laboradas")
	public int getHorasLaboradas() {
		return this.horasLaboradas;
	}

	public void setHorasLaboradas(int horasLaboradas) {
		this.horasLaboradas = horasLaboradas;
	}


	public BigDecimal getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}


	public byte getVacaciones() {
		return this.vacaciones;
	}

	public void setVacaciones(byte vacaciones) {
		this.vacaciones = vacaciones;
	}


	//bi-directional many-to-one association to DeducionesLegale
	@ManyToOne
	@JoinColumn(name="id_impuesto")
	public DeducionesLegale getDeducionesLegale() {
		return this.deducionesLegale;
	}

	public void setDeducionesLegale(DeducionesLegale deducionesLegale) {
		this.deducionesLegale = deducionesLegale;
	}


	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="id_empleado")
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}