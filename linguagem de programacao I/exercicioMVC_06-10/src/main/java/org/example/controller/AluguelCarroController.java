package org.example.controller;

import org.example.model.AluguelCarroModel;
import org.example.view.AluguelCarroView;

public class AluguelCarroController {

    private AluguelCarroModel model;
    private AluguelCarroView view;

    public AluguelCarroController(AluguelCarroModel model, AluguelCarroView view) {
        this.model = model;
        this.view = view;

        view.getBotao().setOnAction(e -> calcular());
    }

    private void calcular() {
        try {
            int dias = Integer.parseInt(view.getCampoDias().getText().trim());
            double km = Double.parseDouble(view.getCampoKm().getText().trim().replace(",", "."));

            double preco = model.calcularPreco(dias, km);
            view.getResultado().setText(String.format("O preço final de aluguel do carro resulta em: R$ %.2f", preco));
        } catch (NumberFormatException e) {
            view.getResultado().setText("Digite números válidos (dias deve ser inteiro).");
        }
    }
}
