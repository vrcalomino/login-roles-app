package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public Usuario encontrarUsuario(int id){
        return controlPersis.encontrarUsuario(id);
    }
}
