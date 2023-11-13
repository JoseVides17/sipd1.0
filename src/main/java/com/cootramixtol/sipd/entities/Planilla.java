package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "planillas")
public class Planilla { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "fecha")
	private LocalDate fecha;

	@Column(name = "estado")
	private int estado;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;

	@Column(name = "detalles")
	@OneToMany(mappedBy = "planilla", cascade = CascadeType.ALL)
    private List<DetallePlanilla> detalles;

	@ManyToOne
	@JoinColumn(name = "tarifa_id")
	private Tarifa tarifa;

	@ManyToOne
	@JoinColumn(name = "conductor_id")
	private Conductor conductor;

	@ManyToOne
	@JoinColumn(name = "vehiculo_id")
	private Vehiculo vehiculo;

	@ManyToOne
	@JoinColumn(name = "registrado_por")
	private Usuario registradoPor;

}
