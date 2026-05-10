import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o valor que pretende investir esse mês: ");
        double valorInvestimento = scanner.nextDouble();

        System.out.println(nome + "que tem " + idade + "anos,irá investir R$" + valorInvestimento + " esse mẽs.");

        scanner.close();
    }
}
