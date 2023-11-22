package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    
    public Usuario encontrarUsuario(int id){
        return usuarioJpa.findUsuario(id);
    }
}
