package org.example.view;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MangaView {

    private VBox raiz;
    private ClassePainel cabelo;
    private ClassePainel rosto;
    private ClassePainel desenhista;

    public MangaView() {
        raiz = Estilo.painel();

        cabelo = new ClassePainel("Cabelo",
                new String[]{"Estilo", "Comprimento", "Cor"},
                new String[]{"cortar()", "pentear()", "tingir()"});
        rosto = new ClassePainel("Rosto",
                new String[]{"Formato", "Expressão", "Tamanho dos olhos"},
                new String[]{"mudarExpressao()", "aumentarOlhos()", "descrever()"});
        desenhista = new ClassePainel("Desenhista",
                new String[]{"Nome", "Estilo preferido", "Desenhos feitos"},
                new String[]{"esbocar()", "finalizarDesenho()", "publicar()"});

        HBox classes = new HBox(10, cabelo.getRaiz(), rosto.getRaiz(), desenhista.getRaiz());

        raiz.getChildren().addAll(
                Estilo.rotulo("Imagem 4 - Desenhos de mangá. Preencha os atributos e crie um objeto de cada classe."),
                classes);
    }

    public VBox getRaiz() { return raiz; }
    public ClassePainel getCabelo() { return cabelo; }
    public ClassePainel getRosto() { return rosto; }
    public ClassePainel getDesenhista() { return desenhista; }
}
