package org.example.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

// Bloco de tela que representa uma classe: mostra seus atributos e métodos
// e permite preencher os atributos para criar um objeto.
public class ClassePainel {

    private VBox raiz;
    private TextField[] campos;
    private Button botao;
    private Label resultado;

    public ClassePainel(String nomeClasse, String[] atributos, String[] metodos) {
        raiz = new VBox(6);
        raiz.setPadding(new Insets(10));
        raiz.setPrefWidth(300);
        raiz.setStyle("-fx-border-color: black; -fx-border-width: 1;");

        Label titulo = Estilo.rotulo("Classe " + nomeClasse);
        titulo.setStyle("-fx-font-weight: bold;");

        Label listaMetodos = Estilo.rotulo("Métodos: " + String.join(", ", metodos));

        GridPane grade = new GridPane();
        grade.setHgap(8);
        grade.setVgap(4);
        campos = new TextField[atributos.length];
        for (int i = 0; i < atributos.length; i++) {
            campos[i] = new TextField();
            grade.add(new Label(atributos[i] + ":"), 0, i);
            grade.add(campos[i], 1, i);
        }

        botao = Estilo.botao("Criar objeto " + nomeClasse);
        resultado = Estilo.rotulo("");

        raiz.getChildren().addAll(titulo, listaMetodos, grade, botao, resultado);
    }

    public VBox getRaiz() { return raiz; }
    public Button getBotao() { return botao; }
    public Label getResultado() { return resultado; }

    public String getValor(int indice) {
        return campos[indice].getText().trim();
    }

    public double getDouble(int indice) {
        return Double.parseDouble(getValor(indice).replace(",", "."));
    }

    public int getInt(int indice) {
        return Integer.parseInt(getValor(indice));
    }
}
