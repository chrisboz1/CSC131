import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Scene 
{
	private String id;
	private JFrame frame;
	private Scene[] nextScenes;
	
	public Scene() 
	{
		this.id = "-1";
		this.frame = new JFrame();
		this.nextScenes = null;
	}
	
	public Scene(String id, JFrame frame, Scene[] nextScenes) 
	{
		this.id = id;
		this.frame = frame;
		this.nextScenes = nextScenes;
	}

	public String getID() 
	{
		return id;
	}

	public JFrame getFrame() 
	{
		return frame;
	}
	
	public Scene getNextScene(int choice) 
	{
		return nextScenes[choice];
	}	
	
	public void createSceneFrame(String imageName) 
	{
		System.out.println(System.getProperty("user.dir"));
		ImageIcon icon1 = new ImageIcon(".\\src\\resources\\" + imageName);
		frame.add(new JLabel(icon1));
		
		frame.setBounds(0, 0, icon1.getIconWidth(), icon1.getIconHeight());
		frame.setResizable(false);
	}
	
	public void createSceneFrame(String imageName, String[] choices) 
	{
		createSceneFrame(imageName);
		//Being worked on
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		Scene scene = new Scene();
		scene.createSceneFrame("hors.jpg");
		
		scene.getFrame().setVisible(true);
	}
}
