package org.example.model;

public class CompraModel {

    private String[] nomes = {"Arroz", "Feijão", "Óleo de soja", "Açúcar", "Café torrado e moído",
            "Macarrão", "Farinha de mandioca", "Fubá de milho", "Molho de tomate", "Sal refinado"};
    private String[] quantidades = {"5 kg", "1 kg", "900 ml", "1 kg", "250 g",
            "500 g", "1 kg", "500 g", "300 g", "1 kg"};
    private double[] valores = {30.00, 8.00, 7.00, 5.00, 12.00, 6.00, 7.00, 5.00, 4.00, 3.00};

    public String listarItens() {
        String lista = "";
        for (int i = 0; i < nomes.length; i++) {
            lista += "Item: " + nomes[i] + "\n";
            lista += "Quantidade: " + quantidades[i] + "\n";
            lista += String.format("Valor parcial: R$ %.2f%n%n", valores[i]);
        }
        return lista;
    }

    public boolean temDesconto(double totalCompra) {
        return totalCompra > 100;
    }

    public double calcularDesconto(double totalCompra) {
        if (temDesconto(totalCompra))
            return totalCompra * 0.10;
        return 0;
    }

    public double calcularValorFinal(double totalCompra) {
        return totalCompra - calcularDesconto(totalCompra);
    }
}
