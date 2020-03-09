package com.siscontable.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idEmpleado;
	private String apellidos;
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
	private String dui;
	private Date fechaFin;
	private Date fechaInicio;
	private Date fechaNacimiento;
	private Date fechaRegistro;
	private String isss;
	private String nombres;
	private String nup;
	private String sexo;
	private Cargo cargo;
	private Departamento departamento;
	private Empresa empresa;
	private Familiar familiar;
	private Usuario usuario;
	private List<SueldoFijo> sueldoFijos;

	public Empleado() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empleado")
	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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


	public String getDui() {
		return this.dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin")
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="fecha_registro")
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public String getIsss() {
		return this.isss;
	}

	public void setIsss(String isss) {
		this.isss = isss;
	}


	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getNup() {
		return this.nup;
	}

	public void setNup(String nup) {
		this.nup = nup;
	}


	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	//bi-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="id_cargo")
	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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


	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	//bi-directional many-to-one association to Familiar
	@ManyToOne
	@JoinColumn(name="id_familia")
	public Familiar getFamiliar() {
		return this.familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}


	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_user")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	//bi-directional many-to-one association to SueldoFijo
	@OneToMany(mappedBy="empleado", fetch=FetchType.EAGER)
	public List<SueldoFijo> getSueldoFijos() {
		return this.sueldoFijos;
	}

	public void setSueldoFijos(List<SueldoFijo> sueldoFijos) {
		this.sueldoFijos = sueldoFijos;
	}

	public SueldoFijo addSueldoFijo(SueldoFijo sueldoFijo) {
		getSueldoFijos().add(sueldoFijo);
		sueldoFijo.setEmpleado(this);

		return sueldoFijo;
	}

	public SueldoFijo removeSueldoFijo(SueldoFijo sueldoFijo) {
		getSueldoFijos().remove(sueldoFijo);
		sueldoFijo.setEmpleado(null);

		return sueldoFijo;
	}

}