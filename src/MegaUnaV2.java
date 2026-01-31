import java.util.Scanner;

public class MegaUnaV2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        cumprimentar();
        coletarnome(sc);
        apresentarInformacoes();
        jogar(sc);
        finalizarJogo();
        sc.close();
    }

    public static void cumprimentar(){
        System.out.println("Olá usuário, seja Bem Vindo ao MegaUna!");
    }

    public static void apresentarInformacoes(){
        System.out.println("Nesse jogo você escolhe um número de 0 a 100, e se acertar ganha!");
    }

    public static void coletarnome(Scanner sc){
        System.out.println("Informe seu nome:");
        String jogador = sc.nextLine();
        System.out.println("Olá, " + jogador + "!");
    }

    public static void jogar(Scanner sc){
        String resposta;
        int numeroEscolhido;
        int numeroSorteado = (int) (Math.random() * 101);
        System.out.println(numeroSorteado);
        do {
            System.out.println("Digite um número entre 0 e 100:");
            numeroEscolhido = sc.nextInt();

            if(numeroEscolhido == numeroSorteado){
                System.out.println("Parabéns, você ganhou!");
                break;
            } else {
                System.out.println("Que pena, não foi dessa vez.");
            }

            System.out.println("Gostaria de continuar tentando? (sim/nao)");
            resposta = sc.next();
        } while (resposta.equalsIgnoreCase("sim"));
    }

    public static void finalizarJogo(){
        System.out.println("Obrigado por jogar o MegaUna! Até a próxima.");
    }
}