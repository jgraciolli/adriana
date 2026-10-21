package org.example.controller;

import org.example.model.floresta.Arvore;
import org.example.model.floresta.Bicicleta;
import org.example.model.floresta.Ciclista;
import org.example.view.ClassePainel;
import org.example.view.FlorestaView;

public class FlorestaController {

    private FlorestaView view;

    public FlorestaController(FlorestaView view) {
        this.view = view;

        view.getCiclista().getBotao().setOnAction(e -> criarCiclista());
        view.getBicicleta().getBotao().setOnAction(e -> criarBicicleta());
        view.getArvore().getBotao().setOnAction(e -> criarArvore());
    }

    private void criarCiclista() {
        ClassePainel p = view.getCiclista();
        try {
            Ciclista ciclista = new Ciclista(p.getValor(0), p.getInt(1), p.getDouble(2));
            String texto = "Objeto criado:\n" + ciclista;
            ciclista.pedalar(5);
            texto += "\n\npedalar(5): velocidade = " + ciclista.getVelocidade() + " km/h";
            texto += "\ndescansar(): " + ciclista.descansar();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Idade ou velocidade inválida.");
        }
    }

    private void criarBicicleta() {
        ClassePainel p = view.getBicicleta();
        try {
            Bicicleta bicicleta = new Bicicleta(p.getValor(0), p.getValor(1), p.getInt(2));
            String texto = "Objeto criado:\n" + bicicleta
                    + "\n\nbuzinar(): " + bicicleta.buzinar()
                    + "\ncalibrarPneus(): " + bicicleta.calibrarPneus();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Marcha inválida.");
        }
    }

    private void criarArvore() {
        ClassePainel p = view.getArvore();
        try {
            Arvore arvore = new Arvore(p.getValor(0), p.getDouble(1), p.getInt(2));
            String texto = "Objeto criado:\n" + arvore
                    + "\n\nfazerFotossintese(): " + arvore.fazerFotossintese();
            arvore.crescer(1.5);
            arvore.envelhecer();
            texto += "\ncrescer(1.5) e envelhecer(): " + arvore;
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Altura ou idade inválida.");
        }
    }
}
