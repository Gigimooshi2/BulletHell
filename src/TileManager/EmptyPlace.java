package TileManager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import EntityManager.Entity;

public class EmptyPlace extends Tile
{
	 Image texture;
	
	public EmptyPlace(Image texture,int x,int y,int width,int height)
	{
		super(texture,x,y,width,height);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(super.texture, super.x,super.y,super.width,super.height, null);
		
	}

	@Override
	public void EntityCollisionHandler() {
		// TODO Auto-generated method stub
		
	}

}
