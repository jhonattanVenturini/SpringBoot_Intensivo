import java.util.Scanner;
public class MegaUna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "sim";

        System.out.println("----------------------------");
        System.out.println("Bem-vindo ao megaUna: ");
        System.out.println("----------------------------");
        System.out.println("Esse e um jogo aonde você escolhe um número de 1 a 100 e se tiver sorte, Ganha!");

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("----------------------------");
            System.out.print("Digite um número: ");
            int numEscolhido = sc.nextInt();
            int numSorteado = 49;

            if (numEscolhido == numSorteado) {
                System.out.println("Parabéns, você Ganhou! 🥳🥳🥳🥳🥳");
            } else {
                System.out.println("Que pena não foi dessa vez, perdeu paizão...... 😒😒😒");
            }

            System.out.println("----------------------------");
            System.out.println("Gostaria de continuar tentando? (sim/nao)");
            resposta = sc.next();
        }

        System.out.println("----------------------------");
        System.out.println("OK. Obrigado pela participação! Espero que retorne em breve 😁😁");
        System.out.println("----------------------------");

        sc.close();
    }
}