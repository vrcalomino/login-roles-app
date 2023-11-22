package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    
    public void agregarUsuario(Usuario usuario){
        usuarioJpa.create(usuario);
    }
    
    public Usuario encontrarUsuario(int id){
        return usuarioJpa.findUsuario(id);
    }
}
