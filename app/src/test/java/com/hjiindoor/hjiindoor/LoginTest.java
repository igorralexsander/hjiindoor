package com.hjiindoor.hjiindoor;

import com.hjiindoor.hjiindoor.controller.LoginController;
import com.hjiindoor.hjiindoor.model.Usuario;

import org.junit.Assert;
import org.junit.Test;

public class LoginTest {

    @Test
    public void efetuarLoginTest(){
        String login = "igorr";
        String senha = "123456";
        LoginController loginController = new LoginController();
        Usuario usuario = loginController.Login(login, senha);
        Assert.assertNotNull(usuario);
        Assert.assertEquals(login, usuario.getLogin());
    }
}
