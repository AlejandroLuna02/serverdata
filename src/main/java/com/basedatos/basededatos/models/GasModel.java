package com.basedatos.basededatos.models;

import jakarta.persistence.*;

@Entity
@Table(schema = "Gas")

public class GasModel {

    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_gas")
    private String name_gas;
    @Column(name = "ubication")
    private String ubication;

    @Column (name = "activa")
    private boolean activa;

    @Column (name = "total_gasolineras")
    private int total_gasolineras;

    @Column (name = "fon")
    private String fon;


    public String getName_gas() {
        return name_gas;
    }

    public void setName_gas(String name_gas) {
        this.name_gas = name_gas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getTotal_gasolineras() {
        return total_gasolineras;
    }

    public void setTotal_gasolineras(int total_gasolineras) {
        this.total_gasolineras = total_gasolineras;
    }

    public String getFon() {
        return fon;
    }

    public void setFon(String fon) {
        this.fon = fon;
    }
}
