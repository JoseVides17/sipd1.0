package com.cootramixtol.sipd.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rutas")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "detalles")
    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL)
    private List<DetallePlanilla> detalles;

    @Column(name = "despachos")
    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL)
    private List<Despacho> despachos;
   
}
