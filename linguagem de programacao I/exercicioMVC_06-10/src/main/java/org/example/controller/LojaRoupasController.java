package org.example.controller;

import org.example.model.loja.LojaDeRoupas;
import org.example.model.loja.Manequim;
import org.example.model.loja.Roupa;
import org.example.view.ClassePainel;
import org.example.view.LojaRoupasView;

public class LojaRoupasController {

    private LojaRoupasView view;

    public LojaRoupasController(LojaRoupasView view) {
        this.view = view;

        view.getLoja().getBotao().setOnAction(e -> criarLoja());
        view.getRoupa().getBotao().setOnAction(e -> criarRoupa());
        view.getManequim().getBotao().setOnAction(e -> criarManequim());
    }

    private void criarLoja() {
        ClassePainel p = view.getLoja();
        LojaDeRoupas loja = new LojaDeRoupas(p.getValor(0), p.getValor(1), p.getValor(2));
        p.getResultado().setText("Objeto criado:\n" + loja
                + "\n\nbuscarRamo(): " + loja.buscarRamo());
    }

    private void criarRoupa() {
        ClassePainel p = view.getRoupa();
        try {
            Roupa roupa = new Roupa(p.getValor(0), p.getValor(1), p.getDouble(2));
            String texto = "Objeto criado:\n" + roupa
                    + "\n\ngerarEtiqueta(): " + roupa.gerarEtiqueta();
            roupa.aplicarDesconto(10);
            texto += "\naplicarDesconto(10): " + roupa.gerarEtiqueta();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Preço inválido.");
        }
    }

    private void criarManequim() {
        ClassePainel p = view.getManequim();
        try {
            Manequim manequim = new Manequim(p.getDouble(0), p.getValor(1), p.getValor(2));
            String texto = "Objeto criado:\n" + manequim;
            manequim.despir();
            texto += "\n\ndespir(): roupa = " + manequim.getRoupaVestida();
            manequim.mudarPosicao("vitrine");
            texto += "\nmudarPosicao(\"vitrine\"): posição = " + manequim.getPosicao();
            p.getResultado().setText(texto);
        } catch (NumberFormatException ex) {
            p.getResultado().setText("Altura inválida.");
        }
    }
}
