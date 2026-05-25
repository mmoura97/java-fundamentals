import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        int contarTentativas = 0;
        boolean acertou = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo de adivinhacao!");
        while (contarTentativas < 5) {
            System.out.println("Adivinhe o numero gerado voce tem 5 tentativas:");
            int tentativa = input.nextInt();
            contarTentativas++;

            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns você acertou!");
                break;

            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número secreto é maior!");

            } else {
                System.out.println("O número secreto é menor!");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram!");
            System.out.println("O numero era: " + numeroAleatorio);
        }
        input.close();
    }
}