package EntityManager;

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
}
