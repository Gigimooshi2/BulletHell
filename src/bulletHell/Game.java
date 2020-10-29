package bulletHell;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Vector;

import EntityManager.Entity;
import PlayerManager.MeleePlayer;
import PlayerManager.RangedPlayer;
import WeaponManager.Sword;
public class Game{
	Level currentLevel;
	RangedPlayer rangedPlayer;
	MeleePlayer meleePlayer;
	public Game() {
		meleePlayer = new MeleePlayer(new Sword(), 0, 10, 10, 0, 10, 5, new Rectangle(App.frameWidth/2-32,App.frameHeight-64,64,64), null);
		int[][] levelMap = { {0,0,0},{1,1,1},{0,0,0}};
		Vector<Entity> levelEntities = new Vector<Entity>();
		levelEntities.add(meleePlayer);
		currentLevel = new Level(levelMap,levelEntities);
	}
	public void draw(Graphics g){
		currentLevel.draw(g);
	}
	public void keyPressedHandler(int code) {
	}
}
