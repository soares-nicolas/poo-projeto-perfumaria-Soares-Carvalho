package br.edu.unifsa.perfumaria.produtos;

/** Categoria Colônia: concentração de essência de 2.0% a 5.0% (RN01). */
public class Colonia extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 2.0;
    private static final double CONCENTRACAO_MAXIMA = 5.0;
    private static final double FATOR_CUSTO = 1.00; // categorias mais concentradas custam mais

    public Colonia(String nome, double concentracao, double custoBase) {
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
        return "[Colonia] " + super.toString();
    }
}
