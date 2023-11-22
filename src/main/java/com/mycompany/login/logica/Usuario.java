package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombreUsuario;
    private String contraseña;
    private boolean esAdmin;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contraseña, boolean esAdmin) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.esAdmin = esAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + '}';
    }
    
}
