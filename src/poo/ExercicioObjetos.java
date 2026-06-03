class Venda {
    String produto;
    int quantidade;
    double valorUnitario;
    double valorTotal;
}


public class ExercicioObjetos {
    public static void main(String[] args) {
        Venda venda1 = new Venda();

        venda1.produto = "Camiseta";
        venda1.quantidade = 3;
        venda1.valorUnitario = 25.50;
        venda1.valorTotal = venda1.quantidade * venda1.valorUnitario;
        System.out.println("Valor total da venda: " + venda1.valorTotal);

    }
}
