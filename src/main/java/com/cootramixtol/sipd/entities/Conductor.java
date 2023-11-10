package com.cootramixtol.sipd.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "Conductores" )
public class Conductor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private long codigo;
	@Column(name = "identificacion")
	private int identificacion;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "activo")
	private boolean activo;
	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	@Column(name = "licencia")
	private String licencia;
	@Column(name = "categoria_liencia")
	private String categoriaLicencia;
	@Column(name = "vigencia_licencia")
	private LocalDate vigenciaLicencia;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;

	public Conductor() {
		// Constructor por defecto vacío
	}

}
