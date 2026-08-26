package org.example.metodos;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AluguelCarro {
    public static void aluguel() {
        int quantidadeDias, kmAdicional;
        double kmPercorridos, limiteKm, precoAluguel;
        double precoDiaria = 120;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para calcular o custo total do aluguel de seu carro, insira os dados abaixo.");
        System.out.print("Quantiade de dias alugados: ");
        quantidadeDias = scanner.nextInt();

        //limite definido seguindo um pensamento de 100km por dia mais uma folga (multiplicação por 1.25)
        limiteKm = (quantidadeDias * 100) * 1.25;

        System.out.print("Quantidade de quilômetros percorridos: ");
        kmPercorridos = scanner.nextDouble();

        precoAluguel = quantidadeDias * precoDiaria;
        kmAdicional = (int) (kmPercorridos - limiteKm);

        if (kmAdicional > 0)
            precoAluguel += kmAdicional * 0.80;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("O preço final de aluguel do carro resulta em: R$" + df.format(precoAluguel));

    }
}
