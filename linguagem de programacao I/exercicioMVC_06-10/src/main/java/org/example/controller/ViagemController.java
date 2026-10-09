package org.example.controller;

import org.example.model.ViagemModel;
import org.example.view.ViagemView;

public class ViagemController {

    private ViagemModel model;
    private ViagemView view;

    public ViagemController(ViagemModel model, ViagemView view) {
        this.model = model;
        this.view = view;

        view.getBotao().setOnAction(e -> calcular());
    }

    private void calcular() {
        try {
            double distancia = Double.parseDouble(view.getCampoDistancia().getText().trim().replace(",", "."));
            double precoLitro = Double.parseDouble(view.getCampoPrecoLitro().getText().trim().replace(",", "."));

            double custo = model.calcularCusto(distancia, precoLitro);
            view.getResultado().setText(String.format("O custo final de combustível foi de: R$ %.2f", custo));
        } catch (NumberFormatException e) {
            view.getResultado().setText("Digite valores numéricos válidos.");
        }
    }
}
