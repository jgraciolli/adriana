package org.example.model.manga;

public class Cabelo {

    private String estilo;
    private String comprimento;
    private String cor;

    public Cabelo(String estilo, String comprimento, String cor) {
        this.estilo = estilo;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public void cortar() {
        comprimento = "curto";
    }

    public String pentear() {
        return "Cabelo " + estilo + " penteado.";
    }

    public void tingir(String novaCor) {
        cor = novaCor;
    }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
    public String getComprimento() { return comprimento; }
    public void setComprimento(String comprimento) { this.comprimento = comprimento; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    @Override
    public String toString() {
        return "Cabelo[estilo=" + estilo + ", comprimento=" + comprimento + ", cor=" + cor + "]";
    }
}
