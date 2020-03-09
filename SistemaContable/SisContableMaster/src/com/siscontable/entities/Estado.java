package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the estado database table.
 * 
 */
@Entity
@NamedQuery(name="Estado.findAll", query="SELECT e FROM Estado e")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idEstado;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private Date fechaCreacion;
	private String nombre;
	private List<DeducionesLegale> deducionesLegales;
	private List<Empresa> empresas;
	private Pais pais;

	public Estado() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estado")
	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
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


	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//bi-directional many-to-one association to DeducionesLegale
	@OneToMany(mappedBy="estado", fetch=FetchType.EAGER)
	public List<DeducionesLegale> getDeducionesLegales() {
		return this.deducionesLegales;
	}

	public void setDeducionesLegales(List<DeducionesLegale> deducionesLegales) {
		this.deducionesLegales = deducionesLegales;
	}

	public DeducionesLegale addDeducionesLegale(DeducionesLegale deducionesLegale) {
		getDeducionesLegales().add(deducionesLegale);
		deducionesLegale.setEstado(this);

		return deducionesLegale;
	}

	public DeducionesLegale removeDeducionesLegale(DeducionesLegale deducionesLegale) {
		getDeducionesLegales().remove(deducionesLegale);
		deducionesLegale.setEstado(null);

		return deducionesLegale;
	}


	//bi-directional many-to-one association to Empresa
	@OneToMany(mappedBy="estado", fetch=FetchType.EAGER)
	public List<Empresa> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public Empresa addEmpresa(Empresa empresa) {
		getEmpresas().add(empresa);
		empresa.setEstado(this);

		return empresa;
	}

	public Empresa removeEmpresa(Empresa empresa) {
		getEmpresas().remove(empresa);
		empresa.setEstado(null);

		return empresa;
	}


	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="id_pais")
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}