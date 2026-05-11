public class CorrecaoWhile {
    public static void main(String[] args) {
        //Código original com erro de loop infinito:
        /*
        int contador = 1;

        while(contador <=10) {
            System.out.println(contador);
        }
         */

        int contador = 1;
        while (contador < 10) {
            contador++;
            System.out.println("Contador: " + contador );
        }
    }
}
