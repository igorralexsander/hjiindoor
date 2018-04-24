package com.hjiindoor.hjiindoor.controller;

import com.hjiindoor.hjiindoor.model.Usuario;

public class LoginController {

    public Usuario Login(String login, String senha){
        if(login.equals("igor") && senha.equals("123456")){
            Usuario usuario = new Usuario();
            usuario.setId(1);
            usuario.setNome("Igor Alexsander");
            usuario.setLogin(login);
            return usuario;
        }
        return null;
    }
}
