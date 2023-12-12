package projeto;

public class Carro extends Veiculo {
    private int numeroPortas;
    private int capacidadePassageiros;

    public Carro(String placa, String marca, String modelo, int ano, double valor,
                 int quantidadeRodas, int numeroPortas, int capacidadePassageiros) {
        super(placa, marca, modelo, ano, valor, quantidadeRodas);
        this.numeroPortas = numeroPortas;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public double calcularDepreciacao() {
        double depreciacaoBase = super.calcularDepreciacao();
        double depreciacaoPorPorta = numeroPortas * 100;
        double depreciacaoPorPassageiro = capacidadePassageiros * 50;
        return depreciacaoBase + depreciacaoPorPorta + depreciacaoPorPassageiro;
    }

}