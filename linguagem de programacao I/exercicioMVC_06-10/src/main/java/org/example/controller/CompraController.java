package org.example.controller;

import org.example.model.CompraModel;
import org.example.view.CompraView;

public class CompraController {

    private CompraModel model;
    private CompraView view;

    public CompraController(CompraModel model, CompraView view) {
        this.model = model;
        this.view = view;

        view.getListaItens().setText(model.listarItens());

        view.getBotao().setOnAction(e -> calcular());
    }

    private void calcular() {
        try {
            double total = Double.parseDouble(view.getCampoTotal().getText().trim().replace(",", "."));
            String texto = String.format("VALOR TOTAL DA COMPRA: R$ %.2f%n", total);

            if (model.temDesconto(total)) {
                texto += "*** DESCONTO APLICADO ***\n";
                texto += String.format("Desconto de 10%%: R$ %.2f%n", model.calcularDesconto(total));
            } else {
                texto += "A compra não ultrapassou R$ 100,00.\n";
            }
            texto += String.format("Valor final a pagar: R$ %.2f", model.calcularValorFinal(total));

            view.getResultado().setText(texto);
        } catch (NumberFormatException e) {
            view.getResultado().setText("Digite um valor numérico válido.");
        }
    }
}
