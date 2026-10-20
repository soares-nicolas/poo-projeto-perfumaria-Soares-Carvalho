package br.edu.unifsa.perfumaria.produtos;


public abstract class Perfume {

    private String nome;
    private double concentracao;   
    private double custoProducao;  

    public Perfume(String nome, double concentracao, double custoProducao) {
        setNome(nome);
        setConcentracao(concentracao);
        setCustoProducao(custoProducao);
    }

    // Faixa de concentração da categoria 
    public abstract double getConcentracaoMinima();
    public abstract double getConcentracaoMaxima();

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

    public double getCustoProducao() {
        return custoProducao;
    }

    public void setCustoProducao(double custoProducao) {
        if (custoProducao <= 0) {
            throw new IllegalArgumentException("O custo de produção deve ser maior que zero");
        }
        this.custoProducao = custoProducao;
    }

   
    private void validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do perfume não pode ser vazio");
        }
    }
}
