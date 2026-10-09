package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ViagemView {

    private VBox raiz;
    private TextField campoDistancia;
    private TextField campoPrecoLitro;
    private Button botao;
    private Label resultado;

    public ViagemView() {
        raiz = Estilo.painel();

        campoDistancia = new TextField();
        campoPrecoLitro = new TextField();
        botao = Estilo.botao("Calcular");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("Para calcular o custo total de combustível da viagem, insira os dados abaixo."),
                Estilo.rotulo("Distância em km:"), campoDistancia,
                Estilo.rotulo("Preço do litro de combustível:"), campoPrecoLitro,
                botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public TextField getCampoDistancia() { return campoDistancia; }
    public TextField getCampoPrecoLitro() { return campoPrecoLitro; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
