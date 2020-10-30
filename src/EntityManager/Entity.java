package EntityManager;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Entity {
	double speed;
	Rectangle hitBox;
	Image texture;
	public Entity(double speed, Rectangle hitBox, Image texture) {
		this.speed = speed;
		this.hitBox = hitBox;
		this.texture = texture;
	}
	public abstract void draw(Graphics g);
	public abstract void EntityCollisionHandler();
}
