package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombres",nullable = true, length = 50)
    private String nombre;

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
