package projeto;

import projeto.Veiculo;

public class Moto extends Veiculo {
    private String tipoFreio;
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor,
                int quantidadeRodas, String tipoFreio, int cilindradas) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.tipoFreio = tipoFreio;
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDepreciacao() {
        double depreciacaoBase = super.calcularDepreciacao();
        double depreciacaoPorCilindrada = cilindradas * 20;
        return depreciacaoBase + depreciacaoPorCilindrada;
    }

}