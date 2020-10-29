package bulletHell;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;

import javax.swing.*;

import PlayerMovement.*;
public class App extends JComponent implements ActionListener{
	static Game gameWorld;
	static int frameWidth;
	static int frameHeight;
	public static ExecutorService threadPool = Executors.newFixedThreadPool(2);
	Timer T;
	public static void main(String[] args) {
		App app=new App();
		JFrame frame=new JFrame("Game Frame");
		frameSettings(app,frame);
		gameWorld = new Game();
		setKeyBinds(app,KeyEvent.VK_A,MoveLeftSolution.getInstance(gameWorld.meleePlayer));
		setKeyBinds(app,KeyEvent.VK_D,MoveRightSolution.getInstance(gameWorld.meleePlayer));		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public App(){
		
		
		setFocusable(true);
		T = new Timer(20,this);
		T.start();
	}
	static void frameSettings(App app,JFrame frame) {
		frame.add(app);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frameHeight = screenSize.height/2;
		frameWidth = screenSize.width/2;
		frame.setSize(frameWidth,frameHeight);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);	
		frame.setFocusable(false);
		app.hideMouseCursor();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}
	class KeyListenerD extends KeyAdapter
    {
		public void keyPressed(KeyEvent e)
		{
			int code=e.getKeyCode();
			if(code==KeyEvent.VK_D) {System.out.println(code);}
			//gameWorld.keyPressedHandler(code);
		}
	}
	class KeyListenerA extends KeyAdapter
    {
		public void keyPressed(KeyEvent e)
		{
			int code=e.getKeyCode();
			if(code==KeyEvent.VK_A) {System.out.println(code);}
			//gameWorld.keyPressedHandler(code);
		}
	}
	class KeyListenerSpace extends KeyAdapter
    {
		public void keyPressed(KeyEvent e)
		{
			int code=e.getKeyCode();
			if(code==KeyEvent.VK_SPACE) {System.out.println(code);}
			//gameWorld.keyPressedHandler(code);
		}
	}
	public void  hideMouseCursor(){
		 //Transparent 16 x 16 pixel cursor image.
		BufferedImage cursorimg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		// Create a new blank cursor.
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
		    cursorimg, new Point(0, 0), "blank cursor");

		// Set the blank cursor to the JPanel.
		setCursor(blankCursor);	
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(gameWorld != null)
		gameWorld.draw(g);
	}
	public static void setKeyBinds(App app,int key,IStrategy algorithm) {
		app.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
			    .put(KeyStroke.getKeyStroke(key, 0, false), key+"Action");
		app.getActionMap().put(key+"Action", new AbstractAction() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
			        	System.out.println(key);
			        	algorithm.Move();
			        }
			    });
		app.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
	    		.put(KeyStroke.getKeyStroke(key, 0, true), key+"Typed Action");
		app.getActionMap().put(key+"Typed Action", new AbstractAction() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	System.out.println("Released "+key);
	        	algorithm.Stop();
	        }
	    });
	}
}
