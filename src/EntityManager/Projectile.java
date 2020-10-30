package EntityManager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Projectile extends Entity{
	int damage;
	int range;
	public Projectile(int damage,int range,double speed, Rectangle hitBox, Image texture) {
		super(speed, hitBox, texture);
		this.damage = damage;
		this.range = range;
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
