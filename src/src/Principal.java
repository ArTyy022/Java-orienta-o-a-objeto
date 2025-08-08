import br.com.alura.JavaOrientacaoAObjetos.calculos.CalculadoraDeTempo;
import br.com.alura.JavaOrientacaoAObjetos.modelos.Filme;
import br.com.alura.JavaOrientacaoAObjetos.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Exterminador");
        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibir();
        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(7);
        System.out.println("Total das avaliações : " +meuFilme. getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.PegaMedia());

        // antes era assim = meuFilme.somaDasAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println("Média: " + meuFilme.PegaMedia());

        Serie serie = new Serie();
        serie.exibir();
        serie.setNome("Supernatural");
        serie.setAnoDeLancamento(2004);
        serie.setTemporadas(15);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie total: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Exterminador");
        outroFilme.setAnoDeLancamento(2002);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

    }

}
