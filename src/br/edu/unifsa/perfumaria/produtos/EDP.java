package br.edu.unifsa.perfumaria.produtos;

/** Categoria Eau de Parfum (EDP): concentração de essência de 15.0% a 20.0% (RN01). */
public class EDP extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 15.0;
    private static final double CONCENTRACAO_MAXIMA = 20.0;
    private static final double FATOR_CUSTO = 1.30; // categorias mais concentradas custam mais

    public EDP(String nome, double concentracao, double custoBase) {
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
        return "[EDP] " + super.toString();
    }
}
