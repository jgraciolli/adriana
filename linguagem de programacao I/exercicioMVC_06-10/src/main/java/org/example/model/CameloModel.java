package org.example.model;

public class CameloModel {

    private int quantidadeCamelos = 36;

    public int getIrmao1() {
        return quantidadeCamelos / 2;
    }

    public int getIrmao2() {
        return quantidadeCamelos / 3;
    }

    public int getIrmao3() {
        return quantidadeCamelos / 9;
    }
}
