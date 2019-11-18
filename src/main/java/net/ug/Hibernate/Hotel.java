/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;


import javax.persistence.*;

@Entity
@Table(name = "Hoteles")
public class Hotel {
    @Id
    @Column(name = "idHotel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;
    private String CiudadHotel;
    private String Telefono;
    private String PlazasHostal;
    private String email;
    private String FechaApertura;

    public Hotel() {
    }

    public Hotel(long id, String nombre, String direccion, String CiudadHotel, String Telefono, String PlazasHostal, String email, String FechaApertura) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.CiudadHotel = CiudadHotel;
        this.Telefono = Telefono;
        this.PlazasHostal = PlazasHostal;
        this.email = email;
        this.FechaApertura = FechaApertura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadHotel() {
        return CiudadHotel;
    }

    public void setCiudadHotel(String CiudadHotel) {
        this.CiudadHotel = CiudadHotel;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPlazasHostal() {
        return PlazasHostal;
    }

    public void setPlazasHostal(String PlazasHostal) {
        this.PlazasHostal = PlazasHostal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(String FechaApertura) {
        this.FechaApertura = FechaApertura;
    }
    
    
}
