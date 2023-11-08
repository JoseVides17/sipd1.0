package com.cootramixtol.sipd.entities;




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
@Table(name = "Tarifas")
public class Tarifa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private double gastosAdministracion;
	private double aporteSocial;
	private double fondoReposicion;
	private double aportesGastosVarios;
	private double total;
	private double aporteParqueadero;

}
