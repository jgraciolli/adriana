package org.example.view;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MascarasView {

    private VBox raiz;
    private ClassePainel mascara;
    private ClassePainel artesao;
    private ClassePainel exposicao;

    public MascarasView() {
        raiz = Estilo.painel();

        mascara = new ClassePainel("Mascara",
                new String[]{"Origem", "Material", "Cor"},
                new String[]{"pendurar()", "restaurar()", "descrever()"});
        artesao = new ClassePainel("Artesao",
                new String[]{"Nome", "Etnia", "Anos de experiência"},
                new String[]{"esculpir()", "pintar()", "ganharExperiencia()"});
        exposicao = new ClassePainel("Exposicao",
                new String[]{"Nome", "Local", "Qtd. de máscaras"},
                new String[]{"adicionarMascara()", "removerMascara()", "abrir()"});

        HBox classes = new HBox(10, mascara.getRaiz(), artesao.getRaiz(), exposicao.getRaiz());

        raiz.getChildren().addAll(
                Estilo.rotulo("Imagem 3 - Máscaras africanas. Preencha os atributos e crie um objeto de cada classe."),
                classes);
    }

    public VBox getRaiz() { return raiz; }
    public ClassePainel getMascara() { return mascara; }
    public ClassePainel getArtesao() { return artesao; }
    public ClassePainel getExposicao() { return exposicao; }
}
