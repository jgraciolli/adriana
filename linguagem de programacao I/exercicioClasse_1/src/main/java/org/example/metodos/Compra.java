package org.example.metodos;
import java.util.Scanner;

public class Compra {

    public static void compra() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== CAIXA DO SUPERMERCADO ==========");
        System.out.print("Digite o valor total da compra: R$ ");

        double totalCompra = scanner.nextDouble();

        System.out.println("\n========== LISTAGEM DA COMPRA ==========");

        double arroz = 30.00;
        System.out.println("Item: Arroz");
        System.out.println("Quantidade: 5 kg");
        System.out.printf("Valor parcial: R$ %.2f%n", arroz);

        double feijao = 8.00;
        System.out.println("\nItem: Feijão");
        System.out.println("Quantidade: 1 kg");
        System.out.printf("Valor parcial: R$ %.2f%n", feijao);

        double oleo = 7.00;
        System.out.println("\nItem: Óleo de soja");
        System.out.println("Quantidade: 900 ml");
        System.out.printf("Valor parcial: R$ %.2f%n", oleo);

        double acucar = 5.00;
        System.out.println("\nItem: Açúcar");
        System.out.println("Quantidade: 1 kg");
        System.out.printf("Valor parcial: R$ %.2f%n", acucar);

        double cafe = 12.00;
        System.out.println("\nItem: Café torrado e moído");
        System.out.println("Quantidade: 250 g");
        System.out.printf("Valor parcial: R$ %.2f%n", cafe);

        double macarrao = 6.00;
        System.out.println("\nItem: Macarrão");
        System.out.println("Quantidade: 500 g");
        System.out.printf("Valor parcial: R$ %.2f%n", macarrao);

        double farinha = 7.00;
        System.out.println("\nItem: Farinha de mandioca");
        System.out.println("Quantidade: 1 kg");
        System.out.printf("Valor parcial: R$ %.2f%n", farinha);

        double fuba = 5.00;
        System.out.println("\nItem: Fubá de milho");
        System.out.println("Quantidade: 500 g");
        System.out.printf("Valor parcial: R$ %.2f%n", fuba);

        double molho = 4.00;
        System.out.println("\nItem: Molho de tomate");
        System.out.println("Quantidade: 300 g");
        System.out.printf("Valor parcial: R$ %.2f%n", molho);

        double sal = 3.00;
        System.out.println("\nItem: Sal refinado");
        System.out.println("Quantidade: 1 kg");
        System.out.printf("Valor parcial: R$ %.2f%n", sal);

        System.out.println("\n==========================================");
        System.out.printf("VALOR TOTAL DA COMPRA: R$ %.2f%n", totalCompra);

        if (totalCompra > 100) {

            double desconto = totalCompra * 0.10;
            double valorFinal = totalCompra - desconto;

            System.out.println("\n*** DESCONTO APLICADO ***");
            System.out.printf("Desconto de 10%%: R$ %.2f%n", desconto);
            System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        } else {

            System.out.println("\nA compra não ultrapassou R$ 100,00.");
            System.out.printf("Valor final a pagar: R$ %.2f%n", totalCompra);
        }

        System.out.println("==========================================");
    }
}
