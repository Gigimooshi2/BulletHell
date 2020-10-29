package PlayerMovement;

import PlayerManager.Player;
import bulletHell.App;

public class MoveRightSolution implements IStrategy{
	private static MoveRightSolution instance = null;
	Thread movementThread = null;
	boolean running = false;
	private MoveRightSolution(Player player) {
		movementThread = new Thread() {
			public void run() {
				while(running) {
				try {
					player.movePlayerRight();
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
	}
	public static MoveRightSolution getInstance(Player player) {
		synchronized(Class.class) {
		if (instance == null)
			instance = new MoveRightSolution(player);
		}
		return instance;
	}
	@Override
	public void Move() {
		synchronized(Class.class) {
		if(!running) {
		running = true;
		App.threadPool.execute(movementThread);
		}
		}
	}
	@Override
	public void Stop() {
		running = false;
	}
}
