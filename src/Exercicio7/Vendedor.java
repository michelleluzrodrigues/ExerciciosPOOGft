package Exercicio7;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, float salario) {
		super(nome, idade, salario);

	}

	public Double bonificacao() {

		return getSalario() + 3000.00;
	}

}
