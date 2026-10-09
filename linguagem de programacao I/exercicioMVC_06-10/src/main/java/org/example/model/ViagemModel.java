package org.example.model;

public class ViagemModel {

    public double calcularCusto(double distancia, double precoLitro) {
        double custoFinal = (distancia / 12) * precoLitro;

        if (distancia > 500)
            custoFinal *= 0.95;

        return custoFinal;
    }
}
