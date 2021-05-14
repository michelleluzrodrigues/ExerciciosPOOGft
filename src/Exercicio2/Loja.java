package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	String nome;
	String cnpj;

	List<Livro> livros = new ArrayList<Livro>();
	List<VideoGame> videoGames = new ArrayList<VideoGame>();

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (livros.isEmpty()) {

			System.out.println("A loja não tem livros no estoque");
		} else {
			System.out.println("A Loja " + getNome() + " possui estes livros para venda.");
			for (Livro livro : livros) {
				System.out.println("Titulo: " + livro.getNome() + ", preço: " + livro.getPreco() + ", " + "quantidade: "
						+ livro.getQtd() + " em estoque");
			}

		}
	}

	public void listaVideoGames() {
		if (videoGames.isEmpty()) {

			System.out.println("A loja não tem video games no seu estoque");
		} else {
			System.out.println("A Loja " + getNome() + " possui estes video-games para venda.");
			for (VideoGame videoGame : videoGames) {
				System.out.println("Video-game: " + videoGame.getModelo() + ", preço: " + videoGame.getPreco()
						+ ", quantidade: " + videoGame.getQtd() + " em estoque");
			}

		}
	}

	public double calculaPatrimonio() {

		double soma = 0;

		for (int i = 0; i < livros.size(); i++) {

			soma = soma + livros.get(i).getPreco()*livros.get(i).getQtd();
		}

		for (int i = 0; i < videoGames.size(); i++) {

			soma = soma + videoGames.get(i).getPreco()*videoGames.get(i).getQtd();
		}
		System.out.println("O patrimonio da loja: " + getNome() + " é de R$ " + soma);
		return soma;

	}
}
