package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the proveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idProveedor;
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
	private String departamento;
	private int estado;
	private Date fechaCreacion;
	private String formaPago;
	private String giro;
	private String municipio;
	private String nit;
	private String nombreLegal;
	private String nombreProv;
	private String tamañoContribuyente;
	private List<ContactoProv> contactoProvs;
	private List<Movimiento> movimientos;

	public Proveedor() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_proveedor")
	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
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


	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="forma_pago")
	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}


	public String getGiro() {
		return this.giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}


	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}


	@Column(name="nombre_legal")
	public String getNombreLegal() {
		return this.nombreLegal;
	}

	public void setNombreLegal(String nombreLegal) {
		this.nombreLegal = nombreLegal;
	}


	@Column(name="nombre_prov")
	public String getNombreProv() {
		return this.nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}


	@Column(name="tamaño_contribuyente")
	public String getTamañoContribuyente() {
		return this.tamañoContribuyente;
	}

	public void setTamañoContribuyente(String tamañoContribuyente) {
		this.tamañoContribuyente = tamañoContribuyente;
	}


	//bi-directional many-to-one association to ContactoProv
	@OneToMany(mappedBy="proveedor", fetch=FetchType.EAGER)
	public List<ContactoProv> getContactoProvs() {
		return this.contactoProvs;
	}

	public void setContactoProvs(List<ContactoProv> contactoProvs) {
		this.contactoProvs = contactoProvs;
	}

	public ContactoProv addContactoProv(ContactoProv contactoProv) {
		getContactoProvs().add(contactoProv);
		contactoProv.setProveedor(this);

		return contactoProv;
	}

	public ContactoProv removeContactoProv(ContactoProv contactoProv) {
		getContactoProvs().remove(contactoProv);
		contactoProv.setProveedor(null);

		return contactoProv;
	}


	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="proveedor", fetch=FetchType.EAGER)
	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setProveedor(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setProveedor(null);

		return movimiento;
	}

}