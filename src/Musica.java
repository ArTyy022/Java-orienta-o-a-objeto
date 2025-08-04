public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacaoTotal;
    int numeroAvaliacoes;

    void Exibir(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("avaliacaoTotal: " + avaliacaoTotal);
        System.out.println("numeroAvaliacoes: " + numeroAvaliacoes);
    }
    void avaliar(double nota){
        avaliacaoTotal += nota;
        numeroAvaliacoes++;
    }
    double calcularMedia() {
        if (numeroAvaliacoes == 0) return 0;
        return avaliacaoTotal / numeroAvaliacoes;
    }

}


