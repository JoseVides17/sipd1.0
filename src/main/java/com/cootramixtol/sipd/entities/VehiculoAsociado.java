package com.cootramixtol.sipd.entities;

import java.time.LocalDate;

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
@Table(name = "vehiculosasociados")
public class VehiculoAsociado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private long codigo;

    @Column(name = "placa_vehiculo")
    @ManyToOne
    @JoinColumn(name = "placa_vehiculo", insertable = false, updatable = false)
    private String placaVehiculo;

    @ManyToOne
    @JoinColumn(name = "identificacion", insertable = false, updatable = false)
    @Column(name = "id_asociado")
    private long idAsociado;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;
    
}
