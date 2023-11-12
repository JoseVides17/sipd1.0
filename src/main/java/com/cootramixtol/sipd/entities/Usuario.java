package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor 
@Table(name = "usuarios")
public class Usuario {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "identificacion", unique = true)
	private long identificacion;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "activo")
	private boolean activo;
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;
	@Column(name = "rol")
	private String rol;
	@Column(name = "clave")
	private String clave;
	@Column(name = "correo", unique = true)
	private String correo;

	@Column(name = "vehiculos")
	@OneToMany(mappedBy = "usuario")
    private List<VehiculoUsuario> vehiculoUsuarios;

	public Usuario() {
		// Constructor por defecto vacío
	}
	
}
