// EXERCÍCIO 2
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        String senhaCorreta = "1234";
        String senhaUsuario = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para acessar o sistema, insira sua senha:");
        senhaUsuario = scanner.nextLine();

        if (senhaUsuario == senhaCorreta)
            System.out.print("Acesso permitido.");
        else
            System.out.print("Acesso negado.");
        
    }
}
