package projeto;

import projeto.Veiculo;

public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String placa, String marca, String modelo, int ano, double valor,
                    int quantidadeRodas, double cargaMaxima) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularDepreciacao() {
        double depreciacaoBase = super.calcularDepreciacao();
        double depreciacaoPorCargaMaxima = cargaMaxima * 0.05;
        return depreciacaoBase + depreciacaoPorCargaMaxima;
    }

}
