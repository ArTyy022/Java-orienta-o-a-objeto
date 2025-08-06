import br.com.alura.JavaOrientacaoAObjetos.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Exterminador");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos(190);



        meuFilme.exibir();
        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(7);
        System.out.println("Total das avaliações : " +meuFilme. getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.PegaMedia());

        // antes era assim = meuFilme.somaDasAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println("Média: " + meuFilme.PegaMedia());
    }
}
