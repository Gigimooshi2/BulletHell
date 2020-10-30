package EntityManager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Character extends Entity{
	int physicalHealth;
	public Character(int health,double speed, Rectangle hitBox, Image texture) {
		super(speed, hitBox, texture);
		this.physicalHealth = health;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void EntityCollisionHandler() {
		// TODO Auto-generated method stub
		
	}
}
