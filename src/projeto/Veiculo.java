package projeto;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private int quantidadeRodas;

    public Veiculo(String placa, String marca, String modelo, int ano, double valor, int quantidadeRodas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.quantidadeRodas = quantidadeRodas;
    }

    public double calcularDepreciacao() {
        int anosAntigos = 2023 - ano;
        double depreciacao = valor * 0.02 * anosAntigos;
        return depreciacao;
    }
}