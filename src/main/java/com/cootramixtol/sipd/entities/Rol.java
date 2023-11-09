package com.cootramixtol.sipd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "Roles")
public class Rol {
	
	@Id 
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "descripcion")
	private String descripcion;

}
