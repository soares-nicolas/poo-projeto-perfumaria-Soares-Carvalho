package br.edu.unifsa.perfumaria.produtos;

/** Categoria Parfum: concentração de essência de 20.0% a 30.0% (RN01). */
public class Parfum extends Perfume {

    private static final double CONCENTRACAO_MINIMA = 20.0;
    private static final double CONCENTRACAO_MAXIMA = 30.0;
    private static final double FATOR_CUSTO = 1.50; // categorias mais concentradas custam mais

    public Parfum(String nome, double concentracao, double custoBase) {
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
        return "[Parfum] " + super.toString();
    }
}
