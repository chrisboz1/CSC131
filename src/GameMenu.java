import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

public class GameMenu extends JFrame
{
	private static GameMenu gameMenu;
    private GameMenu()
    {
    	super("Choose Your Own Adventure");
    	gameMenu = this;
        Button b;
        Choice c = new Choice();
        
        b = new Button("Click Here to Begin");
        b.setBounds(400, 400, 200, 200);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                c.add("Pick Your Adventure!");
                c.add("Zamiel's Storyline");
                c.add("Emily's Storyline");
                c.add("Arju's Storyline");
                c.add("The Island Storyline");
                gameMenu.add(c);

                c.addItemListener(new ItemListener()
                {
                    public void itemStateChanged(ItemEvent e)
                    {
                        if (Objects.equals(c.getSelectedItem(), "Zamiel's Storyline"))
                        {
                        	gameMenu.dispatchEvent(new WindowEvent(gameMenu, WindowEvent.WINDOW_CLOSING));
                            CrystalStoryline.main(null);
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Emily's Storyline"))
                        {
                        	gameMenu.dispatchEvent(new WindowEvent(gameMenu, WindowEvent.WINDOW_CLOSING));
                            EmilyStoryLine.main(null);
                        }
                        else if (Objects.equals(c.getSelectedItem(), "Arju's Storyline"))
                        {
                        	gameMenu.dispatchEvent(new WindowEvent(gameMenu, WindowEvent.WINDOW_CLOSING));
                            MarvelUniverse arjuStory = new MarvelUniverse();
                        }
                        else if (Objects.equals(c.getSelectedItem(), "The Island Storyline"))
                        {
                        	gameMenu.dispatchEvent(new WindowEvent(gameMenu, WindowEvent.WINDOW_CLOSING));
                            theIsland.main(null);
                        }
                    }
                });
            }
        });

        gameMenu.add(b);
        gameMenu.setSize(1000, 1000);
        gameMenu.setLayout(null);
        gameMenu.setVisible(true);
    }
    
    public static GameMenu getMenu() 
    {
    	if (gameMenu == null) 
    	{
    		gameMenu = new GameMenu();
    	}
    	
    	return gameMenu;
    }
}
