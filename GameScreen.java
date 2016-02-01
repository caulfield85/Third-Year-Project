import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

class GameScreen extends JFrame
{
	BufferedImage img;

	public static void main(String[] args)
	{
		new GameScreen();
	}

	GameScreen()
	{
		super("Frame Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 500);
		try
		{
			   img = ImageIO.read(new File("human.png"));
		}
		catch (IOException e) {}
        setVisible(true);
	}

	public void paint(Graphics g)
	{
    	super.paint(g);
    	g.drawImage(img, 40, 40, this);
	}
}
