package org.example.metodos;
import java.util.Scanner;

public class Multiplo {
    public static void multiplo() {
        int n1 = 0;
        int n2 = 0;
        boolean multiplo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números inteiros: ");
        System.out.print("Número 1: ");
        n1 = scanner.nextInt();

        System.out.print("Número 2: ");
        n2 = scanner.nextInt();

        if (n2 == 0)
            multiplo = false;
        else
            multiplo = (n1 % n2 == 0);

        if (multiplo)
            System.out.println("O primeiro número é múltiplo do segundo.");
        else
            System.out.println("O primeiro número não é múltiplo do segundo.");

    }
}
