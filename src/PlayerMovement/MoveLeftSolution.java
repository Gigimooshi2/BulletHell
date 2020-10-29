package PlayerMovement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import PlayerManager.Player;
import bulletHell.App;

public class MoveLeftSolution implements IStrategy{
	private static MoveLeftSolution instance = null;
	Thread movementThread = null;
	boolean running = false;
	private MoveLeftSolution(Player player) {
		movementThread = new Thread() {
			public void run() {
				while(running) {
				try {
					player.movePlayerLeft();
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
	}
	public static MoveLeftSolution getInstance(Player player) {
		synchronized(Class.class) {
		if (instance == null)
			instance = new MoveLeftSolution(player);
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
