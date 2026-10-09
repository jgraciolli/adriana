// EXERCÍCIO 5

public class exercicio5 {
    public static void main(String[] args) {
        int quantidadeCamelos = 36;
        int qtdIrmao1, qtdIrmao2, qtdIrmao3;

        System.out.println("No capítulo 5 de 'O homem que calculava', " +
                "a divisão de camelos entre os três irmãos fica como segue abaixo.");

        qtdIrmao1 = quantidadeCamelos / 2;
        qtdIrmao2 = quantidadeCamelos / 3;
        qtdIrmao3 = quantidadeCamelos / 9;

        System.out.println("Irmão 1: " + qtdIrmao1 + " camelos");
        System.out.println("Irmão 2: " + qtdIrmao2 + " camelos");
        System.out.println("Irmão 3: " + qtdIrmao3 + " camelos");

    }
}
