package org.example.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CompraView {

    private VBox raiz;
    private TextArea listaItens;
    private TextField campoTotal;
    private Button botao;
    private Label resultado;

    public CompraView() {
        raiz = Estilo.painel();

        listaItens = new TextArea();
        listaItens.setEditable(false);
        campoTotal = new TextField();
        botao = Estilo.botao("Calcular");
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(
                Estilo.rotulo("CAIXA DO SUPERMERCADO - Listagem da compra:"),
                listaItens,
                Estilo.rotulo("Digite o valor total da compra (R$):"),
                campoTotal, botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public TextArea getListaItens() { return listaItens; }
    public TextField getCampoTotal() { return campoTotal; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }
}
