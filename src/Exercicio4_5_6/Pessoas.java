package Exercicio4_5_6;

public class Pessoas implements Comparable<Pessoas> {

	private String nome;
	private int idade;

	public Pessoas() {
	}

	public Pessoas(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoas o) {
		if (o.getIdade() > this.idade) {
			return -1;
		} else if (o.getIdade() < this.idade) {
			return 1;
		} else {
			return 0;
		}
	}
}
