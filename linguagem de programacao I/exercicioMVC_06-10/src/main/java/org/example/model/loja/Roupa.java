package org.example.model.loja;

public class Roupa {

    private String tipo;
    private String tamanho;
    private double preco;

    public Roupa(String tipo, String tamanho, double preco) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - preco * percentual / 100;
    }

    public void trocarTamanho(String novoTamanho) {
        tamanho = novoTamanho;
    }

    public String gerarEtiqueta() {
        return tipo + " | Tam. " + tamanho + " | R$ " + String.format("%.2f", preco);
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Roupa[tipo=" + tipo + ", tamanho=" + tamanho + ", preco=" + String.format("%.2f", preco) + "]";
    }
}
