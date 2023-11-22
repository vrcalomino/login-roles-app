package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarUsuario(String nombreUsuario, String contraseña){
        Usuario usuario = new Usuario();
        usuario.setContraseña(contraseña);
        usuario.setNombreUsuario(nombreUsuario);
        controlPersis.agregarUsuario(usuario);
    }
    
    public Usuario encontrarUsuario(int id){
        return controlPersis.encontrarUsuario(id);
    }
}
