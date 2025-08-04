public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.anoDeLancamento = 1990;
        musica.artista = "Linkin Park";
        musica.titulo = "The Emptiness Machine\n";
        musica.numeroAvaliacoes = 0;
        musica.avaliacaoTotal = 0;

 musica.avaliar(6);
 musica.avaliar(6);
 musica.Exibir();
    }

}
