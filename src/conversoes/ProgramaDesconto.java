public class ProgramaDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100.0;
        double percentualDesconto = 20.0;
        double valorDoDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDoDesconto;

        System.out.println("O valor original do produto:R$ " + valorDoDesconto);
        System.out.println("Esse é o valor do Desconto:R$ " + valorDoDesconto);
        System.out.println("Esse é o novo preço:R$ " + novoPreco);

    }
}
