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
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "planillas")
    @OneToMany(mappedBy = "planillas")
    private List<Planilla> planillas;

    @Column(name = "detalle_planilla")
    @OneToMany(mappedBy = "detalle_planilla")
    private List<DetallePlanilla> detallesPlanilla;

    public Ruta() {
		// Constructor por defecto vacío
	}
    
}
