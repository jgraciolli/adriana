package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AluguelCarroView {

    private VBox raiz;
    private TextField campoDias;
    private TextField campoKm;
    private Button botao;
    private Label resultado;

    public AluguelCarroView() {
        raiz = Estilo.painel();

        campoDias = new TextField();
        campoKm = new TextField();
        botao = Estilo.botao("Calcular");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("Para calcular o custo total do aluguel de seu carro, insira os dados abaixo."),
                Estilo.rotulo("Quantidade de dias alugados:"), campoDias,
                Estilo.rotulo("Quantidade de quilômetros percorridos:"), campoKm,
                botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public TextField getCampoDias() { return campoDias; }
    public TextField getCampoKm() { return campoKm; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
