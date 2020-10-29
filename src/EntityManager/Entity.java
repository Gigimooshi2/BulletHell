package EntityManager;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Entity {
	double speed;
	Rectangle hitBox;
	Image texture;
	public Entity(double speed, Rectangle hitBox, Image texture) {
		this.speed = speed;
		this.hitBox = hitBox;
		this.texture = texture;
	}
	public void draw(Graphics g){
		g.setColor(Color.GREEN);
		//Hitbox draw, temp.
		g.drawRect(hitBox.x, hitBox.y, hitBox.width, hitBox.height);
		//Actual draw
		g.drawImage(texture, hitBox.x,hitBox.y,hitBox.width,hitBox.height, null);
	}
}
