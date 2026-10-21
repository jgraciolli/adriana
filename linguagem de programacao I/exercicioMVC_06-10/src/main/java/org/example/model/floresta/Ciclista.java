package org.example.model.floresta;

public class Ciclista {

    private String nome;
    private int idade;
    private double velocidade;

    public Ciclista(String nome, int idade, double velocidade) {
        this.nome = nome;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public void pedalar(double aumento) {
        velocidade += aumento;
    }

    public void frear() {
        velocidade = 0;
    }

    public String descansar() {
        frear();
        return nome + " parou para descansar na trilha.";
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public double getVelocidade() { return velocidade; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }

    @Override
    public String toString() {
        return "Ciclista[nome=" + nome + ", idade=" + idade + ", velocidade=" + velocidade + " km/h]";
    }
}
