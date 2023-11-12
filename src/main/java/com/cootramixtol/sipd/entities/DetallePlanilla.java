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
@Table(name = "detalle_planillas")
public class DetallePlanilla {
    
    @Id
    @Column(name = "numero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    @ManyToOne
    @JoinColumn(name = "id_planilla")
    private Planilla planilla;

    @ManyToOne
    @JoinColumn(name = "id_ruta")
    private Ruta ruta;

    public DetallePlanilla() {
		// Constructor por defecto vacío
	}

}
