package org.example.model.floresta;

public class Bicicleta {

    private String marca;
    private String cor;
    private int marcha;

    public Bicicleta(String marca, String cor, int marcha) {
        this.marca = marca;
        this.cor = cor;
        this.marcha = marcha;
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha >= 1 && novaMarcha <= 21) {
            marcha = novaMarcha;
        }
    }

    public String buzinar() {
        return "Trim trim! (bicicleta " + marca + ")";
    }

    public String calibrarPneus() {
        return "Pneus da bicicleta " + cor + " calibrados.";
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public int getMarcha() { return marcha; }
    public void setMarcha(int marcha) { this.marcha = marcha; }

    @Override
    public String toString() {
        return "Bicicleta[marca=" + marca + ", cor=" + cor + ", marcha=" + marcha + "]";
    }
}
