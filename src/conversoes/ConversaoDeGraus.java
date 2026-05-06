public class ConversaoDeGraus {
    public static void main(String[] args) {
        double celsius = 50;
        double fahrenheit = celsius * 1.8 + 32;

        String mensagem = String.format("A temperatura de %.0f Celsius é equivalente a %.0f Fahrenheit", celsius, fahrenheit);
        System.out.println(mensagem);
        int fahrenheitInteira =  (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenheitInteira);
    }
}
