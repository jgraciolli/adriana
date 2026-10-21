package org.example.model.mascaras;

public class Artesao {

    private String nome;
    private String etnia;
    private int anosExperiencia;

    public Artesao(String nome, String etnia, int anosExperiencia) {
        this.nome = nome;
        this.etnia = etnia;
        this.anosExperiencia = anosExperiencia;
    }

    public String esculpir(String material) {
        return nome + " esculpiu uma máscara de " + material + ".";
    }

    public String pintar(String cor) {
        return nome + " pintou a máscara de " + cor + ".";
    }

    public void ganharExperiencia() {
        anosExperiencia++;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEtnia() { return etnia; }
    public void setEtnia(String etnia) { this.etnia = etnia; }
    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }

    @Override
    public String toString() {
        return "Artesao[nome=" + nome + ", etnia=" + etnia + ", anosExperiencia=" + anosExperiencia + "]";
    }
}
