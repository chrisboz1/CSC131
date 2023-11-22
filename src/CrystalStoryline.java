public class CrystalStoryline 
{
	public static void main(String[] args) 
	{
		//Intro Scenes
		Scene intro1 = new Scene();
		Scene intro2 = new Scene();
		Scene intro3 = new Scene();
		
		//Intro Branches
		Scene pickOrb = new Scene();
		Scene pickSpear = new Scene();
		
		//Intro Choices
		String intro1Desc = "Your vision clears up as you wake from a painful slumber. Wreckage and bodies embedded in a"
							+ " mattress of snow. You rack your mind to recall what happened.";
		String intro1Choices[] = { "Trying to...", "...remember..." };
		Scene intro1Scenes[] = {intro2};
		
		String intro2Desc = "You remember your mission. The ongoing war, a message to the princess. Your airship assailed"
						  + " by the enemy: the Crystal Empire.";
		String intro2Choices[] = { "What happens now?", "Observe your surroundings." };
		Scene intro2Scenes[] = {intro3};
		
		String intro3Desc = "Not a single sign of life around. Only the corpses of fallen allies and shattered wooden beams."
						  + " Only two items stand out to you, buried in the snow: a crystal orb, and a trusty spear.";
		String intro3Choices[] = { "Which do you pick up?", "Arm with knowledge.", "Arm with strength." };
		Scene intro3Scenes[] = {pickOrb, pickSpear};
		
		//Intro Frames
		intro1.createSceneFrame("EMPTY", intro1Desc, intro1Choices, intro1Scenes);
		intro2.createSceneFrame("EMPTY", intro2Desc, intro2Choices, intro2Scenes);
		intro3.createSceneFrame("EMPTY", intro3Desc, intro3Choices, intro3Scenes);
		
		//Orb Sequence and Branches
		Scene screech = new Scene();
		Scene spotting = new Scene();
		
		//Orb Route Start Choices 
		String orbDesc = "It looks to be one of those magical crystal balls, which are commonly used to store information or"
					   + " communicate.";
		String orbChoices[] = { "Maybe it has the princess's message.", "Activate the orb." };
		Scene orbScenes[] = {screech};
		
		String screechDesc = "An ear-piercing screech, mixed with a cacophany of garbage noise bursts out of the orb. The"
						   + " magical winds inside violently swirl in a torrent. You quickly give it a smack to cease the"
						   + " sounds. There must be some magic at work, blocking the orb's functionality.";
		String screechChoices[] = { "This must be the work of the enemy.", "A voice calls out?" };
		Scene screechScenes[] = {spotting};
		
		String spottingDesc = "A deep, filtered, and commanding voice is heard in the distance. \"What is that noise? Squad 7,"
							+ " investigate the wreckage!\" THe sound of footsteps crunching the snow follow, and they are "
							+ "getting closer.";
		String spottingChoices[] = { "This must be the work of the enemy.", "A voice calls out?" };
		Scene spottingScenes[] = {};
		
		//Orb Route Frames
		pickOrb.createSceneFrame("EMPTY", orbDesc, orbChoices, orbScenes);

		intro1.getFrame().setVisible(true);
	}
}
