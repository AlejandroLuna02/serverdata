package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Fabricante")

public class FabricanteModel {

    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Fabricante_nombre")
    private String Fabricante_nombre;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFabricante_nombre() {
        return Fabricante_nombre;
    }

    public void setFabricante_nombre(String fabricante_nombre) {
        Fabricante_nombre = fabricante_nombre;
    }
}
