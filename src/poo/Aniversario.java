

class Pessoas {
    String nome;
    int idade;

    void fazAniversario() {
        idade++;
    }

}

public class Aniversario {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas();

        pessoa1.nome = "Maria";
        pessoa1.idade = 20;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos ");
        pessoa1.fazAniversario();
        System.out.println("A idade agora é: " + pessoa1.idade);

        Pessoas pessoa2 = new Pessoas();
        pessoa2.nome = "Carlos";
        pessoa2.idade = 33;

        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos ");
        pessoa1.fazAniversario();
        System.out.println("A idade agora é: " + pessoa2.idade);

    }
}
