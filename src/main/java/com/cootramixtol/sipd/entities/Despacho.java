package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "Despachos")
public class Despacho { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "ruta")
	private String ruta;
	@Column(name = "placa_vehiculo")
	private String placaVehiculo;
	@Column(name = "hora")
	private LocalDateTime hora;
	@Column(name = "fecha")
	private LocalDate fecha;
	@Column(name = "numero_pasajeros")
	private int numeroPasajeros;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	

}
