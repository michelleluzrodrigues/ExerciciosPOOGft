package Exercicio;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {

		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		this.velocidade = this.velocidade + 20;
		System.out.println("Você está acelerando " + this.velocidade );
	}

	public void abastecer(int combustivel) {
		this.litrosCombustivel = this.litrosCombustivel + combustivel;

		if (this.litrosCombustivel > 60) {

			this.litrosCombustivel = 60;
			System.out.println("Seu tanque está cheio " + this.litrosCombustivel);

		} else {
			System.out.println("Seu tanque tem " + this.litrosCombustivel);
		}
	}

	public void frear() {
		this.velocidade = this.velocidade - 20;
		System.out.println("Você está freando " + this.velocidade);

	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("O carro foi pintado de " + this.cor);
	}

	public void ligar() {
		if (isLigado()) {
			System.out.println("O carro está ligado");
		} else {
			System.out.println("Ligando o carro");
			this.isLigado = true;
		}
	}

	public void desligar() {
		if (!isLigado()) {
			System.out.println("O carro está desligado");

		} else {
			if (velocidade > 0) {
				System.out.println("Não é possivel desligar o veículo");
			} else {
				System.out.println("Veiculo desligado");
				this.isLigado = false;
			}

		}
	}
}
