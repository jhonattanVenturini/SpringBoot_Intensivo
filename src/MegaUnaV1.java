import java.util.Random;
import java.util.Scanner;

public class MegaUnaV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String jogador;
        String resposta;
        int numeroEscolhido;
        int numeroSorteado = rd.nextInt(100) + 1;

        System.out.println();
        System.out.println("-------------------");
        System.out.println(numeroSorteado);
        System.out.println("-------------------");

        System.out.println("Olá usuário, seja Bem Vindo ao MegaUna");
        System.out.print("Informe seu nome: ");
        jogador = sc.next();

        System.out.println("Olá, " + jogador + "!");

        do {
            System.out.println(jogador + ", digite um número de 1 a 100:");
            numeroEscolhido = sc.nextInt();

            if (numeroEscolhido == numeroSorteado) {
                System.out.println("Parabéns " + jogador + ", você ganhou!");
                break;
            } else {
                System.out.println("Que pena, " + jogador + ", não foi dessa vez.");
            }

            System.out.print("Gostaria de continuar tentando? (sim/não): ");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Ok, obrigada pela participação, espero que retorne em breve!");
        sc.close();
    }
}
