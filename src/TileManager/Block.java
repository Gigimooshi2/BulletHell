package TileManager;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
public class Block extends Tile{

	public Block(Image texture,int x,int y,int width,int height) {
		super(texture,x,y,width,height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawRect(super.x, super.y, super.width, super.height);
		g.drawImage(texture, super.x,super.y,super.width,super.height, null);
		
	}

	@Override
	public void EntityCollisionHandler() {

		
	}

}
