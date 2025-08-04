public class CarroPrincupal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Mitsubishi";
        carro.cor = "Preto";
        carro.anoDeLancamento = 2021;

        carro.exibir();
        System.out.println("Idade do carro: " + carro.calculaIdade() + " anos");
    }
}
