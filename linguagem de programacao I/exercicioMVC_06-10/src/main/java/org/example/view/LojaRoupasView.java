package org.example.view;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LojaRoupasView {

    private VBox raiz;
    private ClassePainel loja;
    private ClassePainel roupa;
    private ClassePainel manequim;

    public LojaRoupasView() {
        raiz = Estilo.painel();

        loja = new ClassePainel("LojaDeRoupas",
                new String[]{"Nome", "Localização", "Ramo"},
                new String[]{"definirNome()", "definirLocalizacao()", "buscarRamo()"});
        roupa = new ClassePainel("Roupa",
                new String[]{"Tipo", "Tamanho", "Preço"},
                new String[]{"aplicarDesconto()", "trocarTamanho()", "gerarEtiqueta()"});
        manequim = new ClassePainel("Manequim",
                new String[]{"Altura (m)", "Posição", "Roupa vestida"},
                new String[]{"vestir()", "despir()", "mudarPosicao()"});

        HBox classes = new HBox(10, loja.getRaiz(), roupa.getRaiz(), manequim.getRaiz());

        raiz.getChildren().addAll(
                Estilo.rotulo("Imagem 1 - Loja de roupas. Preencha os atributos e crie um objeto de cada classe."),
                classes);
    }

    public VBox getRaiz() { return raiz; }
    public ClassePainel getLoja() { return loja; }
    public ClassePainel getRoupa() { return roupa; }
    public ClassePainel getManequim() { return manequim; }
}
