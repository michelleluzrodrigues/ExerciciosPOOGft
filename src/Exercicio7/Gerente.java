package Exercicio7;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, float salario) {
		super(nome, idade, salario);

	}

	@Override
	public Double bonificacao() {

		return getSalario() + 100000.00;
	}
}
