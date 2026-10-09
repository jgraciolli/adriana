package org.example.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Estilo {

    public static VBox painel() {
        VBox painel = new VBox(10);
        painel.setPadding(new Insets(20));
        return painel;
    }

    public static Button botao(String texto) {
        return new Button(texto);
    }

    public static Label rotulo(String texto) {
        Label rotulo = new Label(texto);
        rotulo.setWrapText(true);
        return rotulo;
    }
}
