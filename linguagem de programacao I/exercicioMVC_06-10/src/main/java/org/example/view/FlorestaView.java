package org.example.view;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FlorestaView {

    private VBox raiz;
    private ClassePainel ciclista;
    private ClassePainel bicicleta;
    private ClassePainel arvore;

    public FlorestaView() {
        raiz = Estilo.painel();

        ciclista = new ClassePainel("Ciclista",
                new String[]{"Nome", "Idade", "Velocidade (km/h)"},
                new String[]{"pedalar()", "frear()", "descansar()"});
        bicicleta = new ClassePainel("Bicicleta",
                new String[]{"Marca", "Cor", "Marcha"},
                new String[]{"trocarMarcha()", "buzinar()", "calibrarPneus()"});
        arvore = new ClassePainel("Arvore",
                new String[]{"Espécie", "Altura (m)", "Idade"},
                new String[]{"crescer()", "envelhecer()", "fazerFotossintese()"});

        HBox classes = new HBox(10, ciclista.getRaiz(), bicicleta.getRaiz(), arvore.getRaiz());

        raiz.getChildren().addAll(
                Estilo.rotulo("Imagem 2 - Caminho na floresta. Preencha os atributos e crie um objeto de cada classe."),
                classes);
    }

    public VBox getRaiz() { return raiz; }
    public ClassePainel getCiclista() { return ciclista; }
    public ClassePainel getBicicleta() { return bicicleta; }
    public ClassePainel getArvore() { return arvore; }
}
