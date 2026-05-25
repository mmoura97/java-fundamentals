import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;
        while(escolha != 3){
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            escolha = sc.nextInt();


            if (escolha == 1){
                System.out.println("Digite o valor do lado do quadrado");
                double lado = sc.nextDouble();
                double area = lado * lado;
                System.out.println("A aréa do quadrado é: " + area);
            } else if (escolha == 2) {
                System.out.println("Digite o valor do raio do circulo");
                double pi = 3.14;
                double raio = sc.nextDouble();
                double areac = pi * raio * raio;
                System.out.println("A área do circulo é: " + areac);
            } else if (escolha == 3) {
                System.out.println("Fim do programa");
            } else
                System.out.println("Opção invalida");
        }
    }
}
