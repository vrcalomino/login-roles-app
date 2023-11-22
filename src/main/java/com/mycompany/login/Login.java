package com.mycompany.login;

import com.mycompany.login.igu.IniciarSesion;

public class Login {

    public static void main(String[] args) {
        
        IniciarSesion pantalla = new IniciarSesion();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
}
