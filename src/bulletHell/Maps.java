package bulletHell;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import EntityManager.Entity;
import TileManager.EmptyPlace;
import TileManager.Platform;

public class Maps {
	Entity [][][] firstlevelmap;
	Entity [][][] seclevelmap;
	int width;
	int height;
	public Maps()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		firstlevelmap=new Entity[5][20][20];
		seclevelmap=new Entity[5][20][20];
		this.width=screenSize.width/40;
		this.height=screenSize.height/40;
	}
	public void initfirstmap() throws IOException
	{
		
		
		
//		final BufferedImage source = ImageIO.read(new File("background.jpg"));
//		int idx = 0;
//		for (int y = 0; y < source.getHeight(); y += source.getHeight()/20)
//		{
//			for (int i = 0; i < source.getWidth(); i+=source.getWidth()/20) 
//			{
//				 ImageIO.write(source.getSubimage(i, y, source.getWidth()/20, source.getHeight()/20), "jpg", new File("myimage" + idx++ + ".jpg"));
//			}
//		   
//		}
		int idx=0;
		for (int i = 0; i < 1; i++) 
		{
			for (int column = 0; column < 20; column++) {
				for (int row = 0; row <20; row++) 
				{
					firstlevelmap[i][column][row]=new EmptyPlace(new ImageIcon("myimage"+idx+++".jpg").getImage(), row*width, column*height, width, height);
					System.out.println(column+row);
				}
				
			}
		}
	}
	public void draw(Graphics g)
	{
		for (int i = 0; i < 1; i++) 
		{
			for (int column = 0; column < 20; column++) {
				for (int row = 0; row <20; row++) 
				{
					firstlevelmap[i][column][row].draw(g);
					System.out.println(column+row);
				}
				
			}
		}
	}
}
 