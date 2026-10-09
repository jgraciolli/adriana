package org.example.model;

public class AluguelCarroModel {

    private double precoDiaria = 120;

    public double calcularPreco(int quantidadeDias, double kmPercorridos) {
        double limiteKm = (quantidadeDias * 100) * 1.25;

        double precoAluguel = quantidadeDias * precoDiaria;
        int kmAdicional = (int) (kmPercorridos - limiteKm);

        if (kmAdicional > 0)
            precoAluguel += kmAdicional * 0.80;

        return precoAluguel;
    }
}
