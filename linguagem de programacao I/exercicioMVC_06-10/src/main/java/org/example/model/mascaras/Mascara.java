package org.example.model.mascaras;

public class Mascara {

    private String origem;
    private String material;
    private String cor;

    public Mascara(String origem, String material, String cor) {
        this.origem = origem;
        this.material = material;
        this.cor = cor;
    }

    public String pendurar() {
        return "Máscara de " + origem + " pendurada na parede.";
    }

    public void restaurar(String novaCor) {
        cor = novaCor;
    }

    public String descrever() {
        return "Máscara de " + material + ", cor " + cor + ", originária de " + origem + ".";
    }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    @Override
    public String toString() {
        return "Mascara[origem=" + origem + ", material=" + material + ", cor=" + cor + "]";
    }
}
