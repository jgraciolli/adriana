package org.example.model.loja;

public class Manequim {

    private double altura;
    private String posicao;
    private String roupaVestida;

    public Manequim(double altura, String posicao, String roupaVestida) {
        this.altura = altura;
        this.posicao = posicao;
        this.roupaVestida = roupaVestida;
    }

    public void vestir(String roupa) {
        roupaVestida = roupa;
    }

    public void despir() {
        roupaVestida = "nenhuma";
    }

    public void mudarPosicao(String novaPosicao) {
        posicao = novaPosicao;
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }
    public String getRoupaVestida() { return roupaVestida; }
    public void setRoupaVestida(String roupaVestida) { this.roupaVestida = roupaVestida; }

    @Override
    public String toString() {
        return "Manequim[altura=" + altura + "m, posicao=" + posicao + ", roupaVestida=" + roupaVestida + "]";
    }
}
