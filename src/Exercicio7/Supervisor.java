package Exercicio7;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, float salario) {
		super(nome, idade, salario);

	}
	
	public Double bonificacao() {
		
		return getSalario() + 5000.00;

	}
}
