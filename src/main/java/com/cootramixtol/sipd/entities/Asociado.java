package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

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
@Table(name = "Asociados")
public class Asociado {

	@Id
	@Column(name = "id_asociado")
	private Long idAsociado;
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
    @OneToMany(mappedBy = "idAsociado")
    private List<Asociado> vehiculos;

	public Asociado() {
		// Constructor por defecto vacío
	}
	
}
