package org.example.model.mascaras;

public class Exposicao {

    private String nome;
    private String local;
    private int quantidadeMascaras;

    public Exposicao(String nome, String local, int quantidadeMascaras) {
        this.nome = nome;
        this.local = local;
        this.quantidadeMascaras = quantidadeMascaras;
    }

    public void adicionarMascara() {
        quantidadeMascaras++;
    }

    public void removerMascara() {
        if (quantidadeMascaras > 0) {
            quantidadeMascaras--;
        }
    }

    public String abrir() {
        return "Exposição \"" + nome + "\" aberta em " + local + " com " + quantidadeMascaras + " máscaras.";
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public int getQuantidadeMascaras() { return quantidadeMascaras; }
    public void setQuantidadeMascaras(int quantidadeMascaras) { this.quantidadeMascaras = quantidadeMascaras; }

    @Override
    public String toString() {
        return "Exposicao[nome=" + nome + ", local=" + local + ", quantidadeMascaras=" + quantidadeMascaras + "]";
    }
}
