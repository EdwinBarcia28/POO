/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Sucursales")
public class Sucursal {
    @Id
    @Column(name = "idSucursal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String direccion;
    private String Telefono;
    private String email;
    private String FechaApertura;

    public Sucursal() {
    }

    public Sucursal(long id, String direccion, String Telefono, String email, String FechaApertura) {
        this.id = id;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.email = email;
        this.FechaApertura = FechaApertura;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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
