/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ug.Hibernate;


import javax.persistence.*;

@Entity
@Table(name = "Turistas")
public class Turista {
     @Id
    @Column(name = "idTurista")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String identificacion;
    private String Nombres;
    private String Apellidos;
    private String direccion;
    private String Telefono;
    private String email;

    public Turista() {
    }

    public Turista(long id, String identificacion, String Nombres, String Apellidos, String direccion, String Telefono, String email) {
        this.id = id;
        this.identificacion = identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
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
    
    
}
