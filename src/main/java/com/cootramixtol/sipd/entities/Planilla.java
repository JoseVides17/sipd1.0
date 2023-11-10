package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
@Table(name = "Planillas")
public class Planilla { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero")
	private long numero;
	@Column(name = "fecha")
	private LocalDate fecha;
	@Column(name = "hora")
	private LocalDateTime hora;
	@Column(name = "registrado_por")
	private long registrdoPor;
	@Column(name = "id_conductor")
	private long idConductor;
	@Column(name = "placa_vehiculo")
	private String placaVehiculo;
	@Column(name = "codigo_tarifa")
	private int codigoTarifa;
	@Column(name = "estado")
	private int estado;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;
	@Column(name = "ultima_fecha_actualizacion")
	private LocalDate ultimaFechaActualizacion;

	@Column(name = "codigo_ruta")
	@ManyToOne
    @JoinColumn(name = "codigo_ruta")
    private String ruta;

	@Column(name = "detalle_planilla")
    @OneToMany(mappedBy = "numero_detalle_planilla")
    private List<Long> detallesPlanilla;

	public Planilla() {
		// Constructor por defecto vacío
	}

}
