package bulletHell;

import java.awt.Graphics;
import java.util.Vector;

import EntityManager.Entity;

public class Level {
	int[][] levelMap;
	Vector<Entity> levelEntities;
	public Level(int[][] levelMap,Vector<Entity> levelEntities) {
		this.levelMap = levelMap;
		this.levelEntities = levelEntities;
	}
	public void draw(Graphics g){
		for (Entity e : levelEntities){
			e.draw(g);
		}
	}
}
