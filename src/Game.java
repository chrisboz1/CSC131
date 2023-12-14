import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Game 
{
	public static void main(String[] args) 
	{
		Scene menu = new Scene();
		Scene menuReturn = new Scene();
		
		menu.setFrame(GameMenu.getMenu()); //Set up main menu
		GameMenu.getMenu().addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) {
				menuReturn.getFrame().setVisible(true);
			}
		});
		
		String returnChoices[] = { "Select bottom option to return to menu.", "Return to menu." };
		Scene returnScenes[] = {menu};
		menuReturn.createSceneFrame("empty", returnChoices, returnScenes);
		menuReturn.getFrame().pack();
	}
}
