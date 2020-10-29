package PlayerManager;
import java.awt.Image;
import java.awt.Rectangle;

import WeaponManager.Spell;
public class RangedPlayer extends Player{
	Spell[] spells;
	public RangedPlayer(Spell[] spells,int mana, int spiritHealth, int stamina, int cash, int health, double speed, Rectangle hitBox,
			Image texture) {
		super(mana, spiritHealth, stamina, cash, health, speed, hitBox, texture);
		this.spells = spells;
		// TODO Auto-generated constructor stub
	}
}
