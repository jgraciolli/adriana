package org.example.controller;

import org.example.model.CameloModel;
import org.example.view.CameloView;

public class CameloController {

    private CameloModel model;
    private CameloView view;

    public CameloController(CameloModel model, CameloView view) {
        this.model = model;
        this.view = view;

        view.getBotao().setOnAction(e -> dividir());
    }

    private void dividir() {
        view.getResultado().setText(
                "Irmão 1: " + model.getIrmao1() + " camelos\n"
                + "Irmão 2: " + model.getIrmao2() + " camelos\n"
                + "Irmão 3: " + model.getIrmao3() + " camelos");
    }
}
