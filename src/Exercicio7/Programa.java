package Exercicio7;

public class Programa {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Maria", 35, 6800);
		Supervisor supervisor = new Supervisor("Leandro", 35, 3000);
		Vendedor vendedor = new Vendedor("Laura", 24, 1200);

		System.out.println("A bonificação do Gerente e: " + gerente.bonificacao());
		System.out.println("A bonificação do Supervisor e: " + supervisor.bonificacao());
		System.out.println("A bonificação do Vendedor e: " + vendedor.bonificacao());

	}
}
