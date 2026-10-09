package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TemperaturaView {

    private VBox raiz;
    private TextField campoTemperatura;
    private Button botaoAdicionar;
    private Button botaoReiniciar;
    private TextArea historico;
    private Label resultado;

    public TemperaturaView() {
        raiz = Estilo.painel();

        campoTemperatura = new TextField();
        botaoAdicionar = Estilo.botao("Adicionar");
        botaoReiniciar = Estilo.botao("Reiniciar");
        historico = new TextArea();
        historico.setEditable(false);
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("Digite as temperaturas de São José dos Campos.\nDigite -999 para encerrar."),
                Estilo.rotulo("Temperatura em °C:"),
                campoTemperatura, botaoAdicionar, historico, resultado, botaoReiniciar);
    }

    public VBox getRaiz() { return raiz; }
    public TextField getCampoTemperatura() { return campoTemperatura; }
    public Button getBotaoAdicionar() { return botaoAdicionar; }
    public Button getBotaoReiniciar() { return botaoReiniciar; }
    public TextArea getHistorico() { return historico; }
    public Label getResultado() { return resultado; }
}
