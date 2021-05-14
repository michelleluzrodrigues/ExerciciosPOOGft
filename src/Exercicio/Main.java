package Exercicio;

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Renault", "Clio", "ABC123", "Branco", 74000, true, 50, 40, 24500);
		
		veiculo.abastecer(60);
		veiculo.acelerar();
		veiculo.frear();
		veiculo.pintar("Azul");
		veiculo.ligar();
		veiculo.desligar();
	
		
	}

}
