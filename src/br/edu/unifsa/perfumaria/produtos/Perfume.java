package br.edu.unifsa.perfumaria.produtos;

/**
 * Superclasse abstrata dos perfumes (Parfum, EDP, EDT e Colônia).
 * Não representa um produto concreto: cada categoria define sua faixa
 * de concentração (RN01) e seu custo de produção nas subclasses.
 */
public abstract class Perfume {

    private String nome;
    private double concentracao; // percentual de essência (ex.: 18.0 = 18%)
    private double custoBase;    // custo dos ingredientes, em reais

    public Perfume(String nome, double concentracao, double custoBase) {
        setNome(nome);
        setConcentracao(concentracao);
        setCustoBase(custoBase);
    }

    // Faixa de concentração da categoria (RN01), definida em cada subclasse.
    // As subclasses devem retornar valores constantes, pois estes métodos
    // são chamados dentro do construtor.
    public abstract double getConcentracaoMinima();
    public abstract double getConcentracaoMaxima();

    // Custo final de produção, calculado de forma diferente em cada categoria
    public abstract double calcularCustoProducao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarNome(nome);
        this.nome = nome.trim();
    }

    public double getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(double concentracao) {
        if (concentracao < getConcentracaoMinima() || concentracao > getConcentracaoMaxima()) {
            throw new IllegalArgumentException(
                "Concentração " + concentracao + "% fora da faixa da categoria ("
                + getConcentracaoMinima() + "% a " + getConcentracaoMaxima() + "%)");
        }
        this.concentracao = concentracao;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(double custoBase) {
        if (custoBase <= 0) {
            throw new IllegalArgumentException("O custo base deve ser maior que zero");
        }
        this.custoBase = custoBase;
    }

    // Método auxiliar privado de validação
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do perfume não pode ser vazio");
        }
    }

    @Override
    public String toString() {
        return String.format("%s | %.1f%% de essência | custo R$ %.2f",
            nome, concentracao, calcularCustoProducao());
    }
}
