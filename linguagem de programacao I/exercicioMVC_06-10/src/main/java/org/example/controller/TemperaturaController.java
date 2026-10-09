package org.example.controller;

import org.example.model.TemperaturaModel;
import org.example.view.TemperaturaView;

public class TemperaturaController {

    private TemperaturaModel model;
    private TemperaturaView view;

    public TemperaturaController(TemperaturaModel model, TemperaturaView view) {
        this.model = model;
        this.view = view;

        view.getBotaoAdicionar().setOnAction(e -> adicionar());
        view.getBotaoReiniciar().setOnAction(e -> reiniciar());
    }

    private void adicionar() {
        try {
            double temperatura = Double.parseDouble(view.getCampoTemperatura().getText().trim().replace(",", "."));

            if (model.ehFim(temperatura)) {
                encerrar();
            } else {
                model.adicionar(temperatura);
                view.getHistorico().appendText(temperatura + " °C - " + model.classificar(temperatura) + "\n");
                view.getResultado().setText("");
            }
            view.getCampoTemperatura().clear();
        } catch (NumberFormatException e) {
            view.getResultado().setText("Digite um valor numérico válido.");
        }
    }

    private void encerrar() {
        if (model.getQuantidade() > 0) {
            view.getResultado().setText(
                    String.format("Média das temperaturas: %.2f °C%n", model.calcularMedia())
                    + model.mensagemMedia());
        } else {
            view.getResultado().setText("Nenhuma temperatura foi informada.");
        }
        view.getCampoTemperatura().setDisable(true);
        view.getBotaoAdicionar().setDisable(true);
    }

    private void reiniciar() {
        model.reiniciar();
        view.getHistorico().clear();
        view.getResultado().setText("");
        view.getCampoTemperatura().clear();
        view.getCampoTemperatura().setDisable(false);
        view.getBotaoAdicionar().setDisable(false);
    }
}
