package com.cootramixtol.sipd.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "rutas")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_ruta")
    private String codigoRuta;
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "planillas")
    @OneToMany(mappedBy = "numero_planilla")
    private List<Long> planillas;

    @Column(name = "detalles_planilla")
    @OneToMany(mappedBy = "numero_detalle_planilla")
    private List<Long> detallesPlanilla;

    public Ruta() {
		// Constructor por defecto vacío
	}
    
}
