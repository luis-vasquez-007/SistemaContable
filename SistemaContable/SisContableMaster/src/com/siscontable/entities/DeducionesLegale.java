package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the deduciones_legales database table.
 * 
 */
@Entity
@Table(name="deduciones_legales")
@NamedQuery(name="DeducionesLegale.findAll", query="SELECT d FROM DeducionesLegale d")
public class DeducionesLegale implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idImpuesto;
	private String atributo1;
	private String atributo10;
	private String atributo11;
	private String atributo12;
	private String atributo13;
	private String atributo14;
	private String atributo15;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private String atributo6;
	private String atributo7;
	private String atributo8;
	private String atributo9;
	private Date fechaCreacion;
	private String nombreImpuesto;
	private BigDecimal porcentaje;
	private int sumaResta;
	private List<Configuracion> configuracions;
	private Estado estado;
	private List<SueldoFijo> sueldoFijos;

	public DeducionesLegale() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_impuesto")
	public int getIdImpuesto() {
		return this.idImpuesto;
	}

	public void setIdImpuesto(int idImpuesto) {
		this.idImpuesto = idImpuesto;
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


	public String getAtributo11() {
		return this.atributo11;
	}

	public void setAtributo11(String atributo11) {
		this.atributo11 = atributo11;
	}


	public String getAtributo12() {
		return this.atributo12;
	}

	public void setAtributo12(String atributo12) {
		this.atributo12 = atributo12;
	}


	public String getAtributo13() {
		return this.atributo13;
	}

	public void setAtributo13(String atributo13) {
		this.atributo13 = atributo13;
	}


	public String getAtributo14() {
		return this.atributo14;
	}

	public void setAtributo14(String atributo14) {
		this.atributo14 = atributo14;
	}


	public String getAtributo15() {
		return this.atributo15;
	}

	public void setAtributo15(String atributo15) {
		this.atributo15 = atributo15;
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


	@Column(name="nombre_impuesto")
	public String getNombreImpuesto() {
		return this.nombreImpuesto;
	}

	public void setNombreImpuesto(String nombreImpuesto) {
		this.nombreImpuesto = nombreImpuesto;
	}


	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Column(name="suma_resta")
	public int getSumaResta() {
		return this.sumaResta;
	}

	public void setSumaResta(int sumaResta) {
		this.sumaResta = sumaResta;
	}


	//bi-directional many-to-one association to Configuracion
	@OneToMany(mappedBy="deducionesLegale", fetch=FetchType.EAGER)
	public List<Configuracion> getConfiguracions() {
		return this.configuracions;
	}

	public void setConfiguracions(List<Configuracion> configuracions) {
		this.configuracions = configuracions;
	}

	public Configuracion addConfiguracion(Configuracion configuracion) {
		getConfiguracions().add(configuracion);
		configuracion.setDeducionesLegale(this);

		return configuracion;
	}

	public Configuracion removeConfiguracion(Configuracion configuracion) {
		getConfiguracions().remove(configuracion);
		configuracion.setDeducionesLegale(null);

		return configuracion;
	}


	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="id_estado")
	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	//bi-directional many-to-one association to SueldoFijo
	@OneToMany(mappedBy="deducionesLegale", fetch=FetchType.EAGER)
	public List<SueldoFijo> getSueldoFijos() {
		return this.sueldoFijos;
	}

	public void setSueldoFijos(List<SueldoFijo> sueldoFijos) {
		this.sueldoFijos = sueldoFijos;
	}

	public SueldoFijo addSueldoFijo(SueldoFijo sueldoFijo) {
		getSueldoFijos().add(sueldoFijo);
		sueldoFijo.setDeducionesLegale(this);

		return sueldoFijo;
	}

	public SueldoFijo removeSueldoFijo(SueldoFijo sueldoFijo) {
		getSueldoFijos().remove(sueldoFijo);
		sueldoFijo.setDeducionesLegale(null);

		return sueldoFijo;
	}

}