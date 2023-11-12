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
@Table(name = "vehiculosAsociados")
public class VehiculoUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

}
