package org.example.model;

public class TemperaturaModel {

    public static final double FIM = -999;

    private double soma = 0;
    private int quantidade = 0;

    public boolean ehFim(double temperatura) {
        return temperatura == FIM;
    }

    public String classificar(double temperatura) {
        if (temperatura < 18)
            return "Frio";
        return "Temperatura agradável";
    }

    public void adicionar(double temperatura) {
        soma += temperatura;
        quantidade++;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularMedia() {
        return soma / quantidade;
    }

    public String mensagemMedia() {
        if (calcularMedia() < 18)
            return "Em geral, faz frio em São José dos Campos.";
        return "Em geral, a temperatura é agradável em São José dos Campos.";
    }

    public void reiniciar() {
        soma = 0;
        quantidade = 0;
    }
}
