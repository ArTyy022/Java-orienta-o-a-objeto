public class Carro {
    String modelo;
    String cor;
    int anoDeLancamento;

    void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2025 - anoDeLancamento;
    }
}
