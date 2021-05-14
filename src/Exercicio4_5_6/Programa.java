package Exercicio4_5_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		Pessoas p1 = new Pessoas("João", 15);
		Pessoas p2 = new Pessoas("Leandro", 21);
		Pessoas p3 = new Pessoas("Paulo", 17);
		Pessoas p4 = new Pessoas("Jessica", 18);

		List<Pessoas> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		Pessoas busca = Collections.max(pessoas);
		System.out.println("Essa é a pessoa mais velha da lista: " + busca.getNome());
		System.out.println("-------------------------------------------------------");
		System.out.println("O tamanho da lista é: " + pessoas.size());
		
		for (int i = pessoas.size()-1; i>= 0 ; i--) {
		
			if(pessoas.get(i).getIdade() < 18) {
			
			System.out.println("São menores de 18 anos: "+ pessoas.remove(i).getNome());
			}
		}
		System.out.println("O tamanho da lista depois da exclusão: " + pessoas.size());
		System.out.println("-------------------------------------------------------");
		if (pessoas.contains(p4));
			System.out.println("Essa pessoa contem na lista e seu nome é: " + p4.getNome());
		
	}
}
