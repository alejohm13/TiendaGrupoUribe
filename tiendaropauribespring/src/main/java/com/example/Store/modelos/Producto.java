package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreProducto",nullable = true, length = 50)
    private String nombreProducto;
    @Column(name = "referencia",nullable = true, length = 50)
    private String referencia;
    @Column(name = "talla",nullable = false, length = 50)
    private String talla;
    @Column(name = "cantidadBogeda",nullable = false)
    private Integer cantidadBodega;
    @Column(name = "preciounitario",nullable = true)
    private Integer precioUnitario;
    @Column(name = "despcripcion",nullable = true, length = 50)
    private String descripcion;
    @Column(name = "fotografia",nullable = false, length = 50)
    private String fotografia;

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }
}
