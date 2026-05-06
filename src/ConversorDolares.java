public class ConversorDolares {
    public static void main(String[] args) {
        double valorEmDolares = 30.00;
        double cotacao = 4.94;
        double conversao = valorEmDolares * cotacao;

        System.out.printf("Hoje $%.2f é equivalente as R$%.2f ", valorEmDolares, conversao);
    }
}
