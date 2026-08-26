import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double soma = 0;
        int quantidade = 0;

        System.out.println("Digite as temperaturas de São José dos Campos.");
        System.out.println("Digite -999 para encerrar.");

        while (true) {
            System.out.print("Digite uma temperatura em °C: ");
            temperatura = scanner.nextDouble();

            if (temperatura == -999) {
                break;
            }

            if (temperatura < 18) {
                System.out.println("Frio");
            } else {
                System.out.println("Temperatura agradável");
            }

            soma += temperatura;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;

            System.out.println("\nMédia das temperaturas: " + String.format("%.2f", media) + " °C");

            if (media < 18) {
                System.out.println("Em geral, faz frio em São José dos Campos.");
            } else {
                System.out.println("Em geral, a temperatura é agradável em São José dos Campos.");
            }
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }

        scanner.close();
    }
}
