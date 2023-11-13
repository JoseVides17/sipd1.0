package com.cootramixtol.sipd.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Despachos")
public class Despacho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@ManyToOne
	@JoinColumn(name = "ruta_id")
	private Ruta ruta;
	@ManyToOne
	@JoinColumn(name = "vehiculo_id")
	private Vehiculo vehiculo;
	@Column(name = "hora")
	private LocalDateTime hora;
	@Column(name = "fecha")
	private LocalDate fecha;
	@Column(name = "numero_pasajeros")
	private int numeroPasajeros;
	@Column(name = "fecha_registro")
	private LocalDate fechaRegistro;

}
