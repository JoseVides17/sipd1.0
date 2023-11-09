package com.cootramixtol.sipd.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor 
@Table(name = "Tarifas")
public class Tarifa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "gastos_administracion")
	private double gastosAdministracion;
	@Column(name = "aporte_social")
	private double aporteSocial;
	@Column(name = "fondo_reposicion")
	private double fondoReposicion;
	@Column(name = "aportes_gastos_varios")
	private double aportesGastosVarios;
	@Column(name = "total")
	private double total;
	@Column(name = "aporte_parqueadero")
	private double aporteParqueadero;

}
