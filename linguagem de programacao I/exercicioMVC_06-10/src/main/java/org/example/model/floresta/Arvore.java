package org.example.model.floresta;

public class Arvore {

    private String especie;
    private double altura;
    private int idade;

    public Arvore(String especie, double altura, int idade) {
        this.especie = especie;
        this.altura = altura;
        this.idade = idade;
    }

    public void crescer(double metros) {
        altura += metros;
    }

    public void envelhecer() {
        idade++;
    }

    public String fazerFotossintese() {
        return "A árvore " + especie + " está fazendo fotossíntese.";
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "Arvore[especie=" + especie + ", altura=" + altura + "m, idade=" + idade + " anos]";
    }
}
