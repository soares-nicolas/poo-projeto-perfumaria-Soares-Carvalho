package br.edu.unifsa.perfumaria.pessoas;

/**
 * Superclasse abstrata dos funcionários da perfumaria.
 * Não existe "funcionário genérico" no negócio: cada pessoa tem um cargo
 * concreto (perfumista júnior, perfumista sênior, etc.).
 */
public abstract class Funcionario {

    private final String matricula; // definida só no construtor, sem setter
    private String nome;
    private double salarioBase;     // em reais

    public Funcionario(String nome, String matricula, double salarioBase) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("A matrícula do funcionário não pode ser vazia");
        }
        this.matricula = matricula.trim();
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    // Cada cargo informa o próprio nome (implementação diferente em cada subclasse)
    public abstract String getCargo();

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarTextoObrigatorio(nome, "O nome do funcionário");
        this.nome = nome.trim();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("O salário base deve ser maior que zero");
        }
        this.salarioBase = salarioBase;
    }

    // Método auxiliar privado de validação
    private void validarTextoObrigatorio(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " não pode ser vazio");
        }
    }
}
