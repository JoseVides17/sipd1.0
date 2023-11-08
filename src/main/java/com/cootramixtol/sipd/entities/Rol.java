package com.cootramixtol.sipd.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

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
	private String codigo;
	private String descripcion;

}
