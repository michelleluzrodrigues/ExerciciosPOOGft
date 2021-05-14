package Exercicio3;

import java.util.Random;

public class Mago extends Personagem {

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		// TODO Auto-generated constructor stub
	}

	public void lvlUp() {
		setMana(getMana()+1);
		setInteligencia(getInteligencia()+1);
	}
	
	public int attack() {
		Random rd = new Random();
		return getInteligencia() * getLevel() + rd.nextInt(300);

	}

	public void aprenderMagia() {
	
		
	}
}
