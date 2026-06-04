import java.util.Scanner;

class Calculo {
    double numero;
    double valorFinal;

    void SolicitaUmNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para o primeiro um numero: ");
        numero = input.nextDouble();
    }

    void EscreveNumero() {
        System.out.println("O numero digitado é: " + numero);
    }

    double multiplicaNumero() {
        valorFinal = numero * 2;
        System.out.println("O valor multiplicado por 2 é igual: " + valorFinal);
        return valorFinal;
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Calculo dobro = new Calculo();
        dobro.SolicitaUmNumero();
        dobro.EscreveNumero();
        dobro.multiplicaNumero();
    }
}
