package Exercicio2;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qtdPag;

	public Livro() {
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		if (this.tema == "educativo") {
			System.out.println("Livro educativo n?o tem imposto : " + getNome());
			return 0;
		} else {
			System.out.println("R$ " + getPreco() * 0.1 + " de impostos sobre o livro " + getNome());
			return getPreco() * 0.1;

		}
	}
}
