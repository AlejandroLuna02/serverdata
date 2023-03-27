package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Producto")

public class ProductoModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Producto_nombre")
    private String Producto_nombre;
    @Column(name = "Producto_precio")
    private float Producto_precio;

    @ManyToOne
    private FabricanteModel fabricanteModel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProducto_nombre() {
        return Producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        Producto_nombre = producto_nombre;
    }

    public float getProducto_precio() {
        return Producto_precio;
    }

    public void setProducto_precio(float producto_precio) {
        Producto_precio = producto_precio;
    }

    public FabricanteModel getFabricanteModel() {
        return fabricanteModel;
    }

    public void setFabricanteModel(FabricanteModel fabricanteModel) {
        this.fabricanteModel = fabricanteModel;
    }
}
