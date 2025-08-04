public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibir(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }
    double PegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;

    }
}
