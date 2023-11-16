package pokemons;

import java.util.Random;

public class Pokemon0 {
	// Une super classe
	
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	Random random = new Random();
	
	public Pokemon0(String nom) {
		this.nom=nom;
		this.niveau = random.nextInt(10);
		this.hp=2*this.niveau;
		this.atk = (this.niveau/2)+1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public boolean isKO() {
		if(hp == 0)
			return true;
		else
			return false;
	}
	
	public void soigner() {
		this.hp = 2*getNiveau();
	}
	
	public void attaquer(Pokemon0 p) {
		
	}

}
