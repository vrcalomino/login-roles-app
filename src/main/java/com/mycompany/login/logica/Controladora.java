package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarUsuario(String nombreUsuario, String contraseña, boolean esAdmin){
        Usuario usuario = new Usuario();
        usuario.setContraseña(contraseña);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setEsAdmin(esAdmin);
        controlPersis.agregarUsuario(usuario);
    }

    public Usuario obtenerUsuario(String nombreUsuario, String contraseña) {
        List<Usuario> usuarios = controlPersis.traerUsuarios();
        for(Usuario usu: usuarios){
            if(usu.getNombreUsuario().equals(nombreUsuario)){
                if (usu.getContraseña().equals(contraseña)){
                    return usu;
                }
            }
        }
        return null;
    }

    public List<Usuario> obtenerUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
