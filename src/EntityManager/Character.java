package EntityManager;

import java.awt.Image;
import java.awt.Rectangle;

public class Character extends Entity{
	int physicalHealth;
	public Character(int health,double speed, Rectangle hitBox, Image texture) {
		super(speed, hitBox, texture);
		this.physicalHealth = health;
		// TODO Auto-generated constructor stub
	}
}
