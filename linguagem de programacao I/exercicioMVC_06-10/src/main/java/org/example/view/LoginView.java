package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

public class LoginView {

    private VBox raiz;
    private PasswordField campoSenha;
    private Button botao;
    private Label resultado;

    public LoginView() {
        raiz = Estilo.painel();

        campoSenha = new PasswordField();
        botao = Estilo.botao("Entrar");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("Para acessar o sistema, insira sua senha:"),
                campoSenha, botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public PasswordField getCampoSenha() { return campoSenha; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
