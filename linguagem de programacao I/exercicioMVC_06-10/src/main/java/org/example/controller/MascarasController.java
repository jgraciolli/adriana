package org.example.controller;

import org.example.model.mascaras.Artesao;
import org.example.model.mascaras.Exposicao;
import org.example.model.mascaras.Mascara;
import org.example.view.ClassePainel;
import org.example.view.MascarasView;

public class MascarasController {

    private MascarasView view;

    public MascarasController(MascarasView view) {
        this.view = view;

        view.getMascara().getBotao().setOnAction(e -> criarMascara());
        view.getArtesao().getBotao().setOnAction(e -> criarArtesao());
        view.getExposicao().getBotao().setOnAction(e -> criarExposicao());
    }

    private void criarMascara() {
        ClassePainel p = view.getMascara();
        Mascara mascara = new Mascara(p.getValor(0), p.getValor(1), p.getValor(2));
        String texto = "Objeto criado:\n" + mascara
                + "\n\ndescrever(): " + mascara.descrever()
                + "\npendurar(): " + mascara.pendurar();
        p.getResultado().setText(texto);
    }

    private void criarArtesao() {
        ClassePainel p = view.getArtesao();
        try {
            Artesao artesao = new Artesao(p.getValor(0), p.getValor(1), p.getInt(2));
            String texto = "Objeto criado:\n" + artesao
                    + "\n\nesculpir(\"madeira\"): " + artesao.esculpir("madeira")
                    + "\npintar(\"vermelho\"): " + artesao.pintar("vermelho");
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Anos de experiência inválido.");
        }
    }

    private void criarExposicao() {
        ClassePainel p = view.getExposicao();
        try {
            Exposicao exposicao = new Exposicao(p.getValor(0), p.getValor(1), p.getInt(2));
            String texto = "Objeto criado:\n" + exposicao;
            exposicao.adicionarMascara();
            texto += "\n\nadicionarMascara() e abrir(): " + exposicao.abrir();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Quantidade de máscaras inválida.");
        }
    }
}
