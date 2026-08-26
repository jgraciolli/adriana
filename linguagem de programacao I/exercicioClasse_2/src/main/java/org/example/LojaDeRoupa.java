package org.example;

import java.util.Scanner;

public class LojaDeRoupa {
    String nome;
    String localizacao;
    String ramo;

    public void definirNome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da loja");
        nome = scan.next();
    }

    public void definirLocalizacao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a localizacao da loja");
        localizacao = scan.next();
    }

    public void buscarRamo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ramo da loja");
        ramo = scan.next();
        System.out.printf("O ramo da loja é: " + ramo);
    }
}

