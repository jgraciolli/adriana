package org.example.metodos;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Viagem {
    public static void viagem() {
        double distancia, precoLitro, custoFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular o custo total de combustível da viagem, insira os dados abaixo.");
        System.out.print("Distancia em km: ");
        distancia = scanner.nextDouble();

        System.out.print("Preço do litro de combustível: ");
        precoLitro = scanner.nextDouble();

        custoFinal = (distancia / 12) * precoLitro;
        if (distancia > 500) custoFinal *= 0.95;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("O custo final de combustível foi de: " + df.format(custoFinal));
    }
}
