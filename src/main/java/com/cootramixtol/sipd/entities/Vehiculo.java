package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.util.Date;
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
@Table(name = "Vehiculos")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private long codigo;
	@Column(name = "placa", unique = true)
	private String placa;
	@Column(name = "id_conductor")
	private long idConductor;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private Date modelo;
	@Column(name = "capacidad_pasajeros")
	private int capacidadPasajeros;
	@Column(name = "tarjeta_propiedad")
	private String tarjetaPropiedad;
	@Column(name = "codigo_tarifa")
	private int codigoTarifa;
	@Column(name = "activo")
	private int activo;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;
	@Column(name = "vigencia_soat")
	private Date vigenciaSoat;

	@Column(name = "vehiculoAsociado")
	@OneToMany(mappedBy = "vehiculo")
    private List<VehiculoUsuario> vehiculoUsuarios;

	@Column(name = "detalle")
	@OneToMany(mappedBy = "vehiculo")
    private List<VehiculoConductor> vehiculoConductores;

	public Vehiculo() {
		// Constructor por defecto vacío
	}

}
