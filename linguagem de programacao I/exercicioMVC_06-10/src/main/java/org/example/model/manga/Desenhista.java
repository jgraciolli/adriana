package org.example.model.manga;

public class Desenhista {

    private String nome;
    private String estiloPreferido;
    private int desenhosFeitos;

    public Desenhista(String nome, String estiloPreferido, int desenhosFeitos) {
        this.nome = nome;
        this.estiloPreferido = estiloPreferido;
        this.desenhosFeitos = desenhosFeitos;
    }

    public String esbocar() {
        return nome + " fez um esboço no estilo " + estiloPreferido + ".";
    }

    public void finalizarDesenho() {
        desenhosFeitos++;
    }

    public String publicar() {
        return nome + " publicou seu portfólio com " + desenhosFeitos + " desenhos.";
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(String estiloPreferido) { this.estiloPreferido = estiloPreferido; }
    public int getDesenhosFeitos() { return desenhosFeitos; }
    public void setDesenhosFeitos(int desenhosFeitos) { this.desenhosFeitos = desenhosFeitos; }

    @Override
    public String toString() {
        return "Desenhista[nome=" + nome + ", estiloPreferido=" + estiloPreferido + ", desenhosFeitos=" + desenhosFeitos + "]";
    }
}
