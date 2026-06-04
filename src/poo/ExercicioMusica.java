class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double SomaDaAvaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("FICHA DE TECNICA");
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("avaliacao: " + SomaDaAvaliacao);
        System.out.println("numAvaliacoes: " + numAvaliacoes);
        System.out.println("A media de avaliação é: " + calculaMedia());    }

    void avaliaMusica(int selo) {
        SomaDaAvaliacao += selo;
        numAvaliacoes++;
    }

    double calculaMedia() {
        return SomaDaAvaliacao / numAvaliacoes;
    }

}


public class ExercicioMusica {
    public static void main(String[] args) {
        Musica faixa = new Musica();
        faixa.titulo = "4TAL";
        faixa.artista = "Matue";
        faixa.anoDeLancamento = 2024;

        faixa.avaliaMusica(10);
        faixa.avaliaMusica(8);
        faixa.avaliaMusica(9);
        faixa.exibeFichaTecnica();
    }
}
