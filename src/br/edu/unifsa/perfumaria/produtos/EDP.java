package br.edu.unifsa.perfumaria.produtos;

/** Categoria Eau de Parfum (EDP): concentração de essência de 15.0% a 20.0% (RN01). */
public class EDP extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 15.0;
    private static final double CONCENTRACAO_MAXIMA = 20.0;

    public EDP(String nome, double concentracao, double custoProducao) {
        super(nome, concentracao, custoProducao);
    }

    @Override
    public double getConcentracaoMinima() {
        return CONCENTRACAO_MINIMA;
    }

    @Override
    public double getConcentracaoMaxima() {
        return CONCENTRACAO_MAXIMA;
    }
}
