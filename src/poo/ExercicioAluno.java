class Aluno {
    String nome;
    int idade;

    void ExibirAluno() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do Aluno: " + idade);
    }
}

public class ExercicioAluno {
    public static void main(String[] args) {

        Aluno ficha = new Aluno();

        ficha.nome = "Maria";
        ficha.idade = 24;

        ficha.ExibirAluno();
    }
}
