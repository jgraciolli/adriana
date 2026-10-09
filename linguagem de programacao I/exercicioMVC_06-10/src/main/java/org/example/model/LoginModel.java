package org.example.model;

public class LoginModel {

    private String senhaCorreta = "1234";

    public boolean senhaValida(String senhaUsuario) {
        return senhaCorreta.equals(senhaUsuario);
    }
}
