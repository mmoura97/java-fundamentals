class Pessoa {
    String nome;
    int idade;

    void fazAniversario() {
        idade++;
    }

}

public class Aniversario {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Maria";
        pessoa1.idade = 20;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos ");
        pessoa1.fazAniversario();
        System.out.println("A idade agora é: " + pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Carlos";
        pessoa2.idade = 33;

        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos ");
        pessoa1.fazAniversario();
        System.out.println("A idade agora é: " + pessoa2.idade);

    }
}
