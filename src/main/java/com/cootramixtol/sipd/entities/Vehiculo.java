package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vehiculos")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "placa", unique = true)
	private String placa;
	@Column(name = "conductor_id")
	private long conductorId;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private LocalDate modelo;
	@Column(name = "capacidad_pasajeros")
	private int capacidadPasajeros;
	@Column(name = "tarjeta_propiedad")
	private String tarjetaPropiedad;
	@Column(name = "tarifa_id")
	private int tarifaId;
	@Column(name = "activo")
	private int activo;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;
	@Column(name = "vigencia_soat")
	private Date vigenciaSoat;
	@Column(name = "vigencia_rtm")
	private Date vigenciaRtm;

	@Column(name = "vehiculoAsociado")
	@OneToMany(mappedBy = "vehiculo")
    private List<VehiculoUsuario> vehiculoUsuarios;

	@Column(name = "planillas")
	@OneToMany(mappedBy = "vehiculo")
    private List<Planilla> planillas;

	@OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
    private List<Despacho> despachos;



}
