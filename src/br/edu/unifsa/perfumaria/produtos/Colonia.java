package br.edu.unifsa.perfumaria.produtos;

/** Categoria Colônia: concentração de essência de 2.0% a 5.0% (RN01). */
public class Colonia extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 2.0;
    private static final double CONCENTRACAO_MAXIMA = 5.0;

    public Colonia(String nome, double concentracao, double custoProducao) {
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
