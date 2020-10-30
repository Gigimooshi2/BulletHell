
package TileManager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JFrame;

import EntityManager.Entity;

public abstract class Tile extends Entity
{
	int width;
	int height;
	int x;
	int y;
	JFrame frame;
	Image texture;
	public Tile(Image texture,int x,int y,int width,int height)
	{
		super(0, new Rectangle(width,height), texture);
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.texture=texture;
	}
	public abstract void draw(Graphics g);
	public abstract void EntityCollisionHandler();
	
}




