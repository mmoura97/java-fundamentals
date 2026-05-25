import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comparador de números");
        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros iguais!");
        } else if (num1 > num2) {
            System.out.println("O primeiro nuemro é maior!");
        } else {
            System.out.println("O segundo número é maior!");
        }
        scanner.close();
    }
}