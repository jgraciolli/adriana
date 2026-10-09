package org.example.controller;

import org.example.model.MultiploModel;
import org.example.view.MultiploView;

public class MultiploController {

    private MultiploModel model;
    private MultiploView view;

    public MultiploController(MultiploModel model, MultiploView view) {
        this.model = model;
        this.view = view;

        view.getBotao().setOnAction(e -> verificar());
    }

    private void verificar() {
        try {
            int n1 = Integer.parseInt(view.getCampoN1().getText().trim());
            int n2 = Integer.parseInt(view.getCampoN2().getText().trim());

            if (model.ehMultiplo(n1, n2))
                view.getResultado().setText("O primeiro número é múltiplo do segundo.");
            else
                view.getResultado().setText("O primeiro número não é múltiplo do segundo.");
        } catch (NumberFormatException e) {
            view.getResultado().setText("Digite apenas números inteiros.");
        }
    }
}
