package Exercicio2;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;

	}

	@Override
	public double calculaImposto() {
		if (isUsado == true) {
			System.out
					.println("Imposto " + getNome() + " " + getModelo() + " usado" + "," + " R$ " + getPreco() * 0.25);
			return getPreco() * 0.25;
		} else {
			System.out.println("Imposto " + getNome() + " " + getModelo() + " R$ " + getPreco() * 0.45);
			return getPreco() * 0.45;
		}
	}

}
