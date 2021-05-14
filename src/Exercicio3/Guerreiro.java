package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	List<String> habilidades = new ArrayList<>();

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		// TODO Auto-generated constructor stub
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public void lvlUp() {
		setVida(getVida() + 1);
		setForca(getForca() + 1);
	}

	public int attack() {
		Random rd = new Random();
		return getForca() * getLevel() + rd.nextInt(300);
	}

	public int aprenderHabilidade() {
		return 0;

	}
}
