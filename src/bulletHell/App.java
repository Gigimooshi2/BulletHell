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
import java.util.ArrayList;

import javax.swing.*;


public class App extends JPanel implements ActionListener{
	static Game gameWorld;
	static int frameWidth;
	static int frameHeight;
	Timer T;
	public static void main(String[] args) {
		App app=new App();
		JFrame frame=new JFrame("Game Frame");
		frameSettings(app,frame);
		gameWorld = new Game();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public App(){
		addKeyListener(new KL ());
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
	class KL extends KeyAdapter
    {
		public void keyPressed(KeyEvent e)
		{
			int code=e.getKeyCode();
			gameWorld.keyPressedHandler(code);
		}
		public void keyReleased(KeyEvent e)
		{
		
			int code=e.getKeyCode();
			gameWorld.keyReleasedHandler(code);
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
}
