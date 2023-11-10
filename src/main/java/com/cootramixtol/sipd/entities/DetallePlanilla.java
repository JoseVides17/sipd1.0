package com.cootramixtol.sipd.entities;

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
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Table(name = "detalleplanillas")
public class DetallePlanilla {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    @Column(name = "numero_planilla")
    private int numeroPlanilla;
    @Column(name = "codigo_ruta")
    private String codigoRuta;

    @Column(name = "codigo_ruta")
    @ManyToOne
    @JoinColumn(name = "codigo_ruta", insertable = false, updatable = false)
    private Ruta ruta;

    @Column(name = "numero_planilla")
    @ManyToOne
    @JoinColumn(name = "numero_planilla", insertable = false, updatable = false)
    private Planilla planilla;

    public DetallePlanilla() {
		// Constructor por defecto vacío
	}

}
