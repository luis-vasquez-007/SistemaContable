package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contacto_prov database table.
 * 
 */
@Entity
@Table(name="contacto_prov")
@NamedQuery(name="ContactoProv.findAll", query="SELECT c FROM ContactoProv c")
public class ContactoProv implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idContacto;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	private String cargo;
	private String celular;
	private String dui;
	private String fax;
	private Date fechaCreacion;
	private String nit;
	private String nombrePro;
	private String telefono;
	private Proveedor proveedor;

	public ContactoProv() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contacto")
	public int getIdContacto() {
		return this.idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
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


	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getDui() {
		return this.dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}


	@Column(name="nombre_pro")
	public String getNombrePro() {
		return this.nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}


	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

}