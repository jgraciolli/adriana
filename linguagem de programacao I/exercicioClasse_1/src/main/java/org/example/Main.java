package org.example;
import java.util.Scanner;

import static org.example.metodos.AluguelCarro.aluguel;
import static org.example.metodos.Camelo.camelo;
import static org.example.metodos.Compra.compra;
import static org.example.metodos.Login.login;
import static org.example.metodos.Multiplo.multiplo;
import static org.example.metodos.Temperatura.temperatura;
import static org.example.metodos.Viagem.viagem;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("        MENU PRINCIPAL");
            System.out.println("==============================");
            System.out.println("Qual você deseja executar?");
            System.out.println("1 - Verificação de Múltiplo");
            System.out.println("2 - Sistema de Login Simplificado");
            System.out.println("3 - Compra com desconto");
            System.out.println("4 - Temperatura");
            System.out.println("5 - Os trinta e cinco camelos");
            System.out.println("6 - Calculadora de viagem");
            System.out.println("7 - Aluguel de carro");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    multiplo();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    compra();
                    break;

                case 4:
                    temperatura();
                    break;

                case 5:
                    camelo();
                    break;

                case 6:
                    viagem();
                    break;

                case 7:
                    aluguel();
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

