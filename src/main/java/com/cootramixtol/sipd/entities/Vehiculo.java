package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "Vehiculos")
public class Vehiculo {
	 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	@Id
	private String placa;
	@Column(name = "id_conductor")
	private long idConductor;
	private String tipo;
	private String marca;
	private Date modelo;
	@Column(name = "capacidad_pasajeros")
	private int capacidadPasajeros;
	@Column(name = "tarjeta_propiedad")
	private String tarjetaPropiedad;
	@Column(name = "codigo_tarifa")
	private int codigoTarifa;
	private int activo;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;
	@Column(name = "vigencia_soat")
	private Date vigenciaSoat;

}
