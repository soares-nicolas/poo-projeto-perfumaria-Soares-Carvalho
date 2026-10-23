package br.edu.unifsa.perfumaria.produtos;

/** Categoria Parfum: concentração de essência de 20.0% a 30.0% (RN01). */
public class Parfum extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 20.0;
    private static final double CONCENTRACAO_MAXIMA = 30.0;

    public Parfum(String nome, double concentracao, double custoProducao) {
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
