public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Exterminador";
        meuFilme.anoDeLancamento = 2002;
        meuFilme.duracaoEmMinutos = 190;



        meuFilme.exibir();
        meuFilme.avalia(8);
        meuFilme.avalia(2);
        meuFilme.avalia(7);
        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total das avaliações : " +meuFilme.totalDeAvaliacoes);
        System.out.println("Média: " + meuFilme.PegaMedia());

    }
}
