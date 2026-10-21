package br.edu.unifsa.perfumaria.pessoas;

/** Perfumista experiente, habilitado a assinar fórmulas de qualquer categoria. */
public class PerfumistaSenior extends Funcionario {

    private int anosExperiencia;

    public PerfumistaSenior(String nome, String matricula, double salarioBase, int anosExperiencia) {
        super(nome, matricula, salarioBase);
        setAnosExperiencia(anosExperiencia);
    }

    @Override
    public String getCargo() {
        return "Perfumista Sênior";
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia < 0) {
            throw new IllegalArgumentException("Os anos de experiência não podem ser negativos");
        }
        this.anosExperiencia = anosExperiencia;
    }
}
