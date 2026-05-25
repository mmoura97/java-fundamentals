import java.util.Scanner;

public class NumeroParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int parouimpar = input.nextInt();

        if (parouimpar % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
