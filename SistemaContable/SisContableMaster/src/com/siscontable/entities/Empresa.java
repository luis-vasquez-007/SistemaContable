package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the empresa database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idEmpresa;
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
	private String clasificacion;
	private String correo;
	private String direccion;
	private Date fechaCreacion;
	private String nombreEmpresa;
	private String numeroTributario;
	private String rubro;
	private String sector;
	private String telefono;
	private List<Configuracion> configuracions;
	private List<Empleado> empleados;
	private Estado estado;
	private List<Usuario> usuarios;

	public Empresa() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa")
	public int getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
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


	public String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}


	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_creacion")
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	@Column(name="nombre_empresa")
	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	@Column(name="numero_tributario")
	public String getNumeroTributario() {
		return this.numeroTributario;
	}

	public void setNumeroTributario(String numeroTributario) {
		this.numeroTributario = numeroTributario;
	}


	public String getRubro() {
		return this.rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}


	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	//bi-directional many-to-one association to Configuracion
	@OneToMany(mappedBy="empresa", fetch=FetchType.EAGER)
	public List<Configuracion> getConfiguracions() {
		return this.configuracions;
	}

	public void setConfiguracions(List<Configuracion> configuracions) {
		this.configuracions = configuracions;
	}

	public Configuracion addConfiguracion(Configuracion configuracion) {
		getConfiguracions().add(configuracion);
		configuracion.setEmpresa(this);

		return configuracion;
	}

	public Configuracion removeConfiguracion(Configuracion configuracion) {
		getConfiguracions().remove(configuracion);
		configuracion.setEmpresa(null);

		return configuracion;
	}


	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="empresa", fetch=FetchType.EAGER)
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setEmpresa(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setEmpresa(null);

		return empleado;
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


	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="empresa", fetch=FetchType.EAGER)
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setEmpresa(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setEmpresa(null);

		return usuario;
	}

}