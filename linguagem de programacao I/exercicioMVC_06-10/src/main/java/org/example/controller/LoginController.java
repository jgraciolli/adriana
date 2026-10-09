package org.example.controller;

import org.example.model.LoginModel;
import org.example.view.LoginView;

public class LoginController {

    private LoginModel model;
    private LoginView view;

    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;

        view.getBotao().setOnAction(e -> entrar());
    }

    private void entrar() {
        String senha = view.getCampoSenha().getText();

        if (model.senhaValida(senha))
            view.getResultado().setText("Acesso permitido.");
        else
            view.getResultado().setText("Acesso negado.");
    }
}
