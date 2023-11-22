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
        return controlPersis.traerUsuarios();
    }

    public void eliminarUsuario(int id) {
        controlPersis.eliminarUsuario(id);
    }

    public Usuario obtenerUsuarioPorId(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(int id, String nombreUsuario, String contraseña, boolean esAdmin) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombreUsuario(nombreUsuario);
        usuario.setContraseña(contraseña);
        usuario.setEsAdmin(esAdmin);
        controlPersis.editarUsuario(usuario);
    }
}
