package org.example.model.loja;

public class LojaDeRoupas {

    private String nome;
    private String localizacao;
    private String ramo;

    public LojaDeRoupas(String nome, String localizacao, String ramo) {
        definirNome(nome);
        definirLocalizacao(localizacao);
        this.ramo = ramo;
    }

    public void definirNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            this.nome = "Loja sem nome";
        } else {
            this.nome = nome;
        }
    }

    public void definirLocalizacao(String localizacao) {
        if (localizacao == null || localizacao.isEmpty()) {
            this.localizacao = "Endereço não informado";
        } else {
            this.localizacao = localizacao;
        }
    }

    public String buscarRamo() {
        return "A loja " + nome + " atua no ramo de " + ramo + ".";
    }

    public String getNome() { return nome; }
    public String getLocalizacao() { return localizacao; }
    public String getRamo() { return ramo; }
    public void setRamo(String ramo) { this.ramo = ramo; }

    @Override
    public String toString() {
        return "LojaDeRoupas[nome=" + nome + ", localizacao=" + localizacao + ", ramo=" + ramo + "]";
    }
}
