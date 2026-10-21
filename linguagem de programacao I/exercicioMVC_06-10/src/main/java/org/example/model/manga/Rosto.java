package org.example.model.manga;

public class Rosto {

    private String formato;
    private String expressao;
    private int tamanhoOlhos;

    public Rosto(String formato, String expressao, int tamanhoOlhos) {
        this.formato = formato;
        this.expressao = expressao;
        this.tamanhoOlhos = tamanhoOlhos;
    }

    public void mudarExpressao(String novaExpressao) {
        expressao = novaExpressao;
    }

    public void aumentarOlhos() {
        tamanhoOlhos++;
    }

    public String descrever() {
        return "Rosto " + formato + ", expressão " + expressao + ", olhos tamanho " + tamanhoOlhos + ".";
    }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    public String getExpressao() { return expressao; }
    public void setExpressao(String expressao) { this.expressao = expressao; }
    public int getTamanhoOlhos() { return tamanhoOlhos; }
    public void setTamanhoOlhos(int tamanhoOlhos) { this.tamanhoOlhos = tamanhoOlhos; }

    @Override
    public String toString() {
        return "Rosto[formato=" + formato + ", expressao=" + expressao + ", tamanhoOlhos=" + tamanhoOlhos + "]";
    }
}
