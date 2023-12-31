package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	@Column(name = "clave")
	private String clave;
	@Column(name = "correo", unique = true)
	private String correo;

	@Column(name = "planillas_registradas")
	@OneToMany(mappedBy = "registradoPor")
    private List<Planilla> planillasRegistradas;

	@OneToOne
	@JoinColumn(name = "rol_id")
	private Rol rol;

	public Usuario() {
		// Constructor por defecto vacío
	}
	
}
