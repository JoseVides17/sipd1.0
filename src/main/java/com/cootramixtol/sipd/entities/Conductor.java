package com.cootramixtol.sipd.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private int identificacion;
	private String nombres;
	private String apellidos;
	private boolean activo;
	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	private String licencia;
	@Column(name = "categoria_liencia")
	private String categoriaLicencia;
	@Column(name = "vigencia_licencia")
	private LocalDate vigenciaLicencia;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;

}
