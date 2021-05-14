package Exercicio3;

public class Main {

	public static void main(String[] args) {

		Mago mago = new Mago("Gandalf", 250, 480, 0, 28, 10, 1);
		Mago mago1 = new Mago("Sauron", 200, 400, 0, 25, 8, 1);

		Guerreiro guerreiro = new Guerreiro("Concan", 450, 15, 0, 5, 30, 1);
		Guerreiro guerreiro1 = new Guerreiro("Boromir", 390, 0, 0, 15, 27, 1);

		System.out.println("Quantidade de persongaens criados: " + Personagem.quantidadePersonagem);
		
		

	}
}
