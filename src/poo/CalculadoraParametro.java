class AluraDobro {
    double CalculaDobro(double numero) {
        return numero * 2;
    }
}

public class CalculadoraParametro {
    public static void main(String[] args) {

        AluraDobro calcula = new AluraDobro();
        double resultado = calcula.CalculaDobro(50);
        System.out.println(resultado);
    }
}
