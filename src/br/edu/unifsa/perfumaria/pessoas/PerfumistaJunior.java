package br.edu.unifsa.perfumaria.pessoas;

/**
 * Perfumista em início de carreira.
 * RN09: não pode assinar fórmulas da categoria Parfum (regra aplicada
 * quando a fórmula passar a ter um responsável).
 */
public class PerfumistaJunior extends Funcionario {

    public PerfumistaJunior(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public String getCargo() {
        return "Perfumista Júnior";
    }
}
