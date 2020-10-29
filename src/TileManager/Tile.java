
package TileManager;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public abstract class Tile 
{
	int width;
	int height;
	int x;
	int y;
	JFrame frame;
	Image texture;
	public Tile(Image texture,int x,int y,int width,int height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.texture=texture;
	}
	public abstract void draw(Graphics g);
	public abstract void EntityCollisionHandler();
	
}




