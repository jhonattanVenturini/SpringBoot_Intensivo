package br.com.senai.s042;

import java.util.Random;
import java.util.Scanner;

public class MegaUnaV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jogo j1 = new Jogo();
        cumprimentar();
        String gamer = coletarNome(scan);
        configurarJogo();
        apresentarInformacoes();
        jogar(scan, gamer, j1.numSorteado, j1.tentativas);
        finalizarJogo(gamer);
    }
    public static void cumprimentar() {
        System.out.println("Seja bem vindo ao MegaUna!");
    }
    public static String coletarNome(Scanner sc) {
        String jogador;
        System.out.println("Informe seu nome:");
        jogador = sc.next();
        sc.nextLine();
        System.out.println("Olá,"+jogador+ "!");
        return jogador;
    }
    public static void configurarJogo() {

    }
    public static void apresentarInformacoes() {
        System.out.println("Nesse jogo você escolhe um numero inteiro de 1 a 100, se acertar, ganha!");
    }
    public static void jogar(Scanner sc , String jogador, int numSorteado, int tentativas) {
        String resposta;
        int numEscolhido;
        do {
            System.out.println("Digite um numero: ");
            numEscolhido = sc.nextInt();
            tentativas--;
            if (numEscolhido == numSorteado) {
                System.out.println("Parabéns," + jogador +"! Você ganhou!");
                break;
            } else {
                System.out.println("Que pena," + jogador + "! Não foi dessa vez! Espero que tenha mais sorte na próxima!");
            }
            System.out.println("Gostaria de continuar tentando? (Responda: sim / não)");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("sim") && tentativas > 0);
    }
    public static void finalizarJogo(String gamer) {
        System.out.println("Ok, obrigado pela participação. Espero que retorne em breve!");
    }
}