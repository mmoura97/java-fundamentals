class Carro{
    String modelo;
    int anoFabricacao;
    String cor;

    void exibirFichaTecnicaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + anoFabricacao);
        System.out.println("A idade do carro é: " + calculaIdadeCarro());
    }

    int calculaIdadeCarro(){
        return 2026 - anoFabricacao;
    }
}


public class ExercicioCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Yaris";
        carro.cor = "Cinza";
        carro.anoFabricacao = 2026;
        carro.exibirFichaTecnicaCarro();
    }
}
