package br.edu.unifsa.perfumaria.produtos;

/** Categoria Eau de Toilette (EDT): concentração de essência de 5.0% a 15.0% (RN01). */
public class EDT extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 5.0;
    private static final double CONCENTRACAO_MAXIMA = 15.0;

    public EDT(String nome, double concentracao, double custoProducao) {
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
