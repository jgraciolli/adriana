package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MultiploView {

    private VBox raiz;
    private TextField campoN1;
    private TextField campoN2;
    private Button botao;
    private Label resultado;

    public MultiploView() {
        raiz = Estilo.painel();

        campoN1 = new TextField();
        campoN2 = new TextField();
        botao = Estilo.botao("Verificar");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("Informe dois números inteiros:"),
                Estilo.rotulo("Número 1:"), campoN1,
                Estilo.rotulo("Número 2:"), campoN2,
                botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public TextField getCampoN1() { return campoN1; }
    public TextField getCampoN2() { return campoN2; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
