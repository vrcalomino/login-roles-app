package com.mycompany.login;

import com.mycompany.login.igu.IniciarSesion;
import com.mycompany.login.logica.Controladora;

public class Login {

    public static void main(String[] args) {     
        Controladora control = new Controladora();
        control.agregarUsuario("admin", "123", true);
        IniciarSesion pantalla = new IniciarSesion();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
