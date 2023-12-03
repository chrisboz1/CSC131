import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Scene 
{
	private JFrame frame;
	private Scene[] nextScenes;
	
	public Scene() 
	{
		this.frame = new JFrame();
		frame.setBackground(new Color(0, 0, 0));
		this.nextScenes = null;
	}
	
	public Scene(JFrame frame, Scene[] nextScenes) 
	{
		this.frame = frame;
		this.nextScenes = nextScenes;
	}
	
	public JFrame getFrame() 
	{
		return frame;
	}
	
	public void advanceScene(int choice) 
	{
		this.frame.setVisible(false);
		nextScenes[choice].getFrame().setVisible(true);
	}	
	
	public void setNextScenes(Scene[] nextScenes) 
	{
		this.nextScenes = nextScenes;
	}
	
	//Functions that simplify adding JSwing components
	
	public ImageIcon addImage(String imageName) 
	{
		File file = new File(".\\src\\resources\\" + imageName);
		if (!file.exists()) 
		{
			System.out.println("Invalid Image File.");
			return null;
		}
		
		ImageIcon icon1 = new ImageIcon(file.toString());
		frame.add(new JLabel(icon1));
		return icon1;
	}
	
	public void addDescription(String description) 
	{
		JTextArea text = new JTextArea();
		text.setText(description);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setOpaque(false);
		text.setBounds(frame.getWidth()/2, 0, frame.getWidth()-50, frame.getHeight());
		text.setEditable(false);
		
		frame.add(text);
		frame.setBounds(0, 0, frame.getWidth(), frame.getHeight()+100);
	}
	
	public void addChoices(String[] choices) 
	{
		Choice choiceList = new Choice(); //Create user choices
		for (int i = 0; i < choices.length; i++) 
		{
			choiceList.add(choices[i]);
		}
		
		choiceList.addItemListener(new ItemListener() //Give choices functionality
        {
            public void itemStateChanged(ItemEvent e)
            {
            	String[] listChoices = choices;
            	for (int i = 1; i < choices.length; i++) 
        		{
	                if (Objects.equals(choiceList.getSelectedItem(), listChoices[i]))
	                {
	                    advanceScene(i-1);
	                }
	            }
            }
        });
		
		frame.add(choiceList);
		frame.setBounds(0, 0, frame.getWidth(), frame.getHeight()+100);
	}
	
	public void addAutoAdvance(int seconds, int scene) 
	{
		ActionListener waitAdvance = new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				advanceScene(scene);
			}
		};
		
		Timer timer = new Timer(seconds*1000, waitAdvance);
		timer.setRepeats(false);
		frame.addComponentListener(new ComponentAdapter() 
		{
			public void componentShown(ComponentEvent e) 
			{
				timer.start();
			}
		   
			public void componentHidden(ComponentEvent e) 
			{
				timer.stop();
			}
		});
	}
	
	//createSceneFrame functions are optional functions to make it easier to create a whole frame
	
	/**
     * Creates a scene frame from an image.
     *
     * @param imageName  The image file name in the resources folder.
     */
	public void createSceneFrame(String imageName) 
	{
		frame.setLayout(new FlowLayout()); //Set layout for all elements
		
		ImageIcon icon = addImage(imageName);
		
		if (icon != null) 
		{
			frame.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
		}
		else 
		{
			frame.setBounds(0, 0, 500, 400);
		}
	}
	
	/**
     * Creates a scene frame from an image and a description. Use an invalid
     * file name if you wish to have just the description.
     *
     * @param imageName		The image file name in the resources folder.
     * @param description	Description of the scene.
     */
	public void createSceneFrame(String imageName, String description) 
	{
		createSceneFrame(imageName);
		addDescription(description);
	}
	
	/**
     * Creates a scene frame from an image and String array of choices. Use if next scenes
     * are already defined.
     *
     * @param imageName	The image file name in the resources folder.
     * @param choices	Choices displayed to the player. First string is used as a header.
     */
	public void createSceneFrame(String imageName, String[] choices)
	{
		createSceneFrame(imageName); //Create frame with selected image
		addChoices(choices);
	}
	
	/**
     * Creates a scene frame from an image, a description, and a String array of choices. 
     * Use if next scenes are already defined.
     *
     * @param imageName	The image file name in the resources folder.
     * @param description	Description of the scene.
     * @param choices	Choices displayed to the player. First string is used as a header.
     */
	public void createSceneFrame(String imageName, String description, String[] choices)
	{
		createSceneFrame(imageName, description); //Create frame with selected image and description
		addChoices(choices);
	}
	
	/**
     * Creates a scene frame from an image and String array of choices. Use if next scenes
     * are not already defined.
     *
     * @param imageName		The image file name in the resources folder.
     * @param choices		Choices displayed to the player. First string is used as a header.
     * @param newNextScenes	The scene objects associated with each choice.
     */
	public void createSceneFrame(String imageName, String[] choices, Scene[] newNextScenes) 
	{
		createSceneFrame(imageName, choices);
		setNextScenes(newNextScenes);
	}
	
	/**
     * Creates a scene frame from an image, a description, and a String array of choices.
     * Use if next scenes are not already defined.
     *
     * @param imageName		The image file name in the resources folder.
     * @param choices		Choices displayed to the player. First string is used as a header.
     * @param newNextScenes	The scene objects associated with each choice.
     */
	public void createSceneFrame(String imageName, String description, String[] choices, Scene[] newNextScenes) 
	{
		createSceneFrame(imageName, description, choices);
		setNextScenes(newNextScenes);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//test2();
		autoAdvanceTest();
	}
	
	private static void test1() throws InterruptedException 
	{
		Scene scene1 = new Scene();
		scene1.createSceneFrame("hors.jpg");
		
		Scene scene2 = new Scene();
		scene2.createSceneFrame("image.png");
		
		Scene scene3 = new Scene();
		scene3.createSceneFrame("zeedee_by_thebirdgang_df81fqi-pre.jpg");
		
		Scene scenes1[] = {scene2, scene3};
		
		scene1.setNextScenes(scenes1);
		
		scene1.getFrame().setVisible(true);
		TimeUnit.SECONDS.sleep(5);
		scene1.advanceScene(0);
	}
	
	private static void test2() throws InterruptedException 
	{
		//Declare Scenes
		// 1 is parent of 2 and 3
		Scene scene1 = new Scene();
		Scene scene2 = new Scene();
		Scene scene3 = new Scene();
		
		// 2 is parent of 4 and 5
		Scene scene4 = new Scene();
		Scene scene5 = new Scene();
		
		//Declare choices and next scenes
		String choices1[] = {"This choice shouldnt do anything", "the second coming", "Halo 3"};
		Scene scenes1[] = {scene2, scene3};
		
		String choices2[] = {"Some more scenes", "the 4th", "the 5 guys burgers and fries"};
		Scene scenes2[] = {scene4, scene5};
		
		//Create scene frames and associate choices
		scene1.createSceneFrame("hors.jpg", choices1, scenes1);
		scene2.createSceneFrame("hors.jpg", "this scene has an image, but it has words. How are you, "
									  + "by the way? I am doing quite fine myself. I am just testing out how far I can push the text here"
									  + "and all that jazz. oh boy howdy.", choices2, scenes2);
		scene3.createSceneFrame("zeedee_by_thebirdgang_df81fqi-pre.jpg", "I know what you did.");
		
		scene4.createSceneFrame("empty", "what am i?");
		scene5.createSceneFrame("image.png", "WHAT AM I FIGHTING FOOOOOORRRR");
		
		scene1.getFrame().setVisible(true);
	}
	
	private static void autoAdvanceTest() throws InterruptedException 
	{
		//Declare Scenes
		Scene scene1 = new Scene();
		Scene scene2 = new Scene();
		Scene scene3 = new Scene();
		Scene auto = new Scene();
		
		Scene manual = new Scene();
		Scene hidden = new Scene();
		//Declare choices and next scenes
		String choices1[] = {"This choice shouldnt do anything", "the second coming", "Halo 3", "Let's test the auto"};
		Scene scenes1[] = {scene2, scene3, auto};
		
		String autoDesc = "This scene has two choices, but one of them is \"hidden\" and will be advanced to after some time";
		String autoChoices[] = {"Header text lol", "select manually"};
		Scene autoScenes[] = {manual, hidden};
		auto.addAutoAdvance(5, 1);
		
		//Create scene frames and associate choices
		scene1.createSceneFrame("hors.jpg", "do the last option to test auto advance", choices1, scenes1);
		scene2.createSceneFrame("hors.jpg", "this scene has an image, but it has words. How are you, "
									  + "by the way? I am doing quite fine myself. I am just testing out how far I can push the text here"
									  + "and all that jazz. oh boy howdy.");
		scene3.createSceneFrame("zeedee_by_thebirdgang_df81fqi-pre.jpg", "I know what you did.");
		auto.createSceneFrame("AAAA", autoDesc, autoChoices, autoScenes);
		manual.createSceneFrame("wha", "manual selection");
		hidden.createSceneFrame("wha", "hidden auto-advance selection");
		
		scene1.getFrame().setVisible(true);
	}
}
