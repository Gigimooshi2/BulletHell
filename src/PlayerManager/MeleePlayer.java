package PlayerManager;
import java.awt.Image;
import java.awt.Rectangle;

import WeaponManager.Sword;
public class MeleePlayer extends Player{
	Sword sword;
	public MeleePlayer(Sword sword,int mana, int spiritHealth, int stamina, int cash, int health, double speed, Rectangle hitBox,
			Image texture) {
		super(mana, spiritHealth, stamina, cash, health, speed, hitBox, texture);
		this.sword = sword;
		// TODO Auto-generated constructor stub
	}
}
