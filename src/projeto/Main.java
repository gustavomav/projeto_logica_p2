package projeto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC123", "Toyota", "Corolla", 2019, 30000.0, 4, 4, 5);
        Moto moto = new Moto("XYZ789", "Honda", "CBR", 2021, 15000.0, 2, "ABS", 600);
        Caminhao caminhao = new Caminhao("DEF456", "Volvo", "FH16", 2020, 80000.0, 18, 20000);

        System.out.println("Depreciação do Carro: $" + carro.calcularDepreciacao());
        System.out.println("Depreciação da Moto: $" + moto.calcularDepreciacao());
        System.out.println("Depreciação do Caminhão: $" + caminhao.calcularDepreciacao());
    }
}