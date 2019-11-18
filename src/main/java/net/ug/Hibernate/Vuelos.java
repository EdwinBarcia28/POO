/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Vuelos")
public class Vuelos {
    @Id
    @Column(name = "NumVuelos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String FechaVuelo;
    private String HoraVuelo;
    private String OrigenVuelo;
    private String DestinoVuelo;
    private int PlazasTotales;
    private int PlazasTuristas;

    public Vuelos() {
    }
    
    
    
    public Vuelos(long id, String FechaVuelo, String HoraVuelo, String OrigenVuelo, String DestinoVuelo, int PlazasTotales, int PlazasTuristas) {
        this.id = id;
        this.FechaVuelo = FechaVuelo;
        this.HoraVuelo = HoraVuelo;
        this.OrigenVuelo = OrigenVuelo;
        this.DestinoVuelo = DestinoVuelo;
        this.PlazasTotales = PlazasTotales;
        this.PlazasTuristas = PlazasTuristas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getHoraVuelo() {
        return HoraVuelo;
    }

    public void setHoraVuelo(String HoraVuelo) {
        this.HoraVuelo = HoraVuelo;
    }

    public String getOrigenVuelo() {
        return OrigenVuelo;
    }

    public void setOrigenVuelo(String OrigenVuelo) {
        this.OrigenVuelo = OrigenVuelo;
    }

    public String getDestinoVuelo() {
        return DestinoVuelo;
    }

    public void setDestinoVuelo(String DestinoVuelo) {
        this.DestinoVuelo = DestinoVuelo;
    }

    public int getPlazasTotales() {
        return PlazasTotales;
    }

    public void setPlazasTotales(int PlazasTotales) {
        this.PlazasTotales = PlazasTotales;
    }

    public int getPlazasTuristas() {
        return PlazasTuristas;
    }

    public void setPlazasTuristas(int PlazasTuristas) {
        this.PlazasTuristas = PlazasTuristas;
    }
    
    
    
    
    
}
