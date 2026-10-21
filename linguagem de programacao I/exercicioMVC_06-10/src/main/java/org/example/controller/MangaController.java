package org.example.controller;

import org.example.model.manga.Cabelo;
import org.example.model.manga.Desenhista;
import org.example.model.manga.Rosto;
import org.example.view.ClassePainel;
import org.example.view.MangaView;

public class MangaController {

    private MangaView view;

    public MangaController(MangaView view) {
        this.view = view;

        view.getCabelo().getBotao().setOnAction(e -> criarCabelo());
        view.getRosto().getBotao().setOnAction(e -> criarRosto());
        view.getDesenhista().getBotao().setOnAction(e -> criarDesenhista());
    }

    private void criarCabelo() {
        ClassePainel p = view.getCabelo();
        Cabelo cabelo = new Cabelo(p.getValor(0), p.getValor(1), p.getValor(2));
        String texto = "Objeto criado:\n" + cabelo
                + "\n\npentear(): " + cabelo.pentear();
        cabelo.cortar();
        cabelo.tingir("azul");
        texto += "\ncortar() e tingir(\"azul\"): " + cabelo;
        p.getResultado().setText(texto);
    }

    private void criarRosto() {
        ClassePainel p = view.getRosto();
        try {
            Rosto rosto = new Rosto(p.getValor(0), p.getValor(1), p.getInt(2));
            String texto = "Objeto criado:\n" + rosto;
            rosto.mudarExpressao("surpresa");
            rosto.aumentarOlhos();
            texto += "\n\nmudarExpressao(\"surpresa\") e aumentarOlhos(): " + rosto.descrever();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Tamanho dos olhos inválido.");
        }
    }

    private void criarDesenhista() {
        ClassePainel p = view.getDesenhista();
        try {
            Desenhista desenhista = new Desenhista(p.getValor(0), p.getValor(1), p.getInt(2));
            String texto = "Objeto criado:\n" + desenhista
                    + "\n\nesbocar(): " + desenhista.esbocar();
            desenhista.finalizarDesenho();
            texto += "\nfinalizarDesenho() e publicar(): " + desenhista.publicar();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Desenhos feitos inválido.");
        }
    }
}
