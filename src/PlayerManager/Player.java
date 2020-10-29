package PlayerManager;

import java.awt.Image;
import java.awt.Rectangle;

import EntityManager.Character;

public class Player extends Character{
	int mana;
	int spiritHealth;
	int stamina;
	int cash;
	public Player(int mana, int spiritHealth, int stamina, int cash, int health, double speed, Rectangle hitBox, Image texture) {
		super(health, speed, hitBox, texture);
		this.mana = mana;
		this.spiritHealth = spiritHealth;
		this.stamina = stamina;
		this.cash = cash;
		// TODO Auto-generated constructor stub
	}	
}
