package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CameloView {

    private VBox raiz;
    private Button botao;
    private Label resultado;

    public CameloView() {
        raiz = Estilo.painel();

        botao = Estilo.botao("Dividir os camelos");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("No capítulo 5 de 'O homem que calculava', "
                        + "a divisão de camelos entre os três irmãos fica como segue abaixo."),
                botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
