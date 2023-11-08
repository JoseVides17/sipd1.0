package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "Planillas")
public class Planilla { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero;
	private LocalDate fecha;
	private LocalDateTime hora;
	@Column(name = "registrado_por")
	private long registrdoPor;
	@Column(name = "id_conductor")
	private long idConductor;
	@Column(name = "placa_vehiculo")
	private String placaVehiculo;
	@Column(name = "codigo_tarifa")
	private int codigoTarifa;
	private int estado;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;

}
