package br.edu.unifsa.perfumaria.produtos;

/** Categoria Eau de Toilette (EDT): concentração de essência de 5.0% a 15.0% (RN01). */
public class EDT extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 5.0;
    private static final double CONCENTRACAO_MAXIMA = 15.0;
    private static final double FATOR_CUSTO = 1.15; // categorias mais concentradas custam mais

    public EDT(String nome, double concentracao, double custoBase) {
        super(nome, concentracao, custoBase);
    }

    @Override
    public double getConcentracaoMinima() {
        return CONCENTRACAO_MINIMA;
    }

    @Override
    public double getConcentracaoMaxima() {
        return CONCENTRACAO_MAXIMA;
    }

    @Override
    public double calcularCustoProducao() {
        return getCustoBase() * FATOR_CUSTO;
    }

    @Override
    public String toString() {
        return "[EDT] " + super.toString();
    }
}
