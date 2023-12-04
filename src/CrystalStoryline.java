public class CrystalStoryline 
{
	public static void main(String[] args) 
	{
		//Intro Scenes and Branches
		Scene intro1 = new Scene();
		Scene intro2 = new Scene();
		Scene intro3 = new Scene();
		
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
		intro1.createSceneFrame("crystal_storyline\\intro1.png", intro1Desc, intro1Choices, intro1Scenes);
		intro2.createSceneFrame("crystal_storyline\\intro2.png", intro2Desc, intro2Choices, intro2Scenes);
		intro3.createSceneFrame("crystal_storyline\\intro3.png", intro3Desc, intro3Choices, intro3Scenes);
		
		/***********************************************************************************************************/
		//Orb Sequence and Branches
		Scene screech = new Scene();
		Scene spotting = new Scene();
		
		Scene flee = new Scene();
		Scene confront = new Scene();
		
		//Orb Route Choices 
		String orbDesc = "It looks to be one of those magical crystal balls, which are commonly used to store information and"
					   + " communicate.";
		String orbChoices[] = { "Maybe it has the princess's message.", "Activate the orb." };
		Scene orbScenes[] = {screech};
		
		String screechDesc = "An ear-piercing screech, mixed with a cacophany of garbage noise bursts out of the orb. The"
						   + " magical winds inside violently swirl in a torrent. You quickly give it a smack to cease the"
						   + " sounds. There must be some magic at work, blocking the orb's functionality.";
		String screechChoices[] = { "This must be the work of the enemy.", "A voice calls out?" };
		Scene screechScenes[] = {spotting};
		
		String spottingDesc = "A deep, filtered, and commanding voice is heard in the distance. \"What is that noise? Squad 7,"
							+ " investigate the wreckage!\" The sounds of footsteps crunching in the snow follows, and they are "
							+ "getting closer.";
		String spottingChoices[] = { "Enemies approach!", "Flee!", "Confront!" };
		Scene spottingScenes[] = {flee, confront};
		
		//Orb Route Frames
		pickOrb.createSceneFrame("crystal_storyline\\pickOrb.png", orbDesc, orbChoices, orbScenes);
		screech.createSceneFrame("crystal_storyline\\screech.png", screechDesc, screechChoices, screechScenes);
		spotting.createSceneFrame("crystal_storyline\\spotting.png", spottingDesc, spottingChoices, spottingScenes);

		/***********************************************************************************************************/
		//Spear Sequence and Branches
		Scene stalking = new Scene();
		Scene art = new Scene();
		
		Scene stab = new Scene();
		Scene sneak = new Scene();
		//Spear Route Choices
		String spearDesc = "Pulling it out of the snow, you recall why your fellow royal guards refer to the spear as \"the"
						 + " soldier's only true friend.\" Even after crash landing, this weapon of war is in pristine condition."
						 + " The spear tip sheens bright as you brush it clean, and the shaft remains smooth and in one piece.";
		String spearChoices[] = { "This will serve you well.", "Attend to the growing sounds of enemy presence." };
		Scene spearScenes[] = {stalking};
		
		String stalkingDesc = "There's no time to contemplate any longer. You notice filtered mumbles in the distance, coming from"
							+ " an armored soldier wading through snow. The enemy. Upon closer inspection, you see them "
							+ "accompanying a familiar figure."; 
		String stalkingChoices[] = { "That one in the hood...", "Look closer." };
		Scene stalkingScenes[] = {art};
		
		String artDesc = "A hooded individual with tentacle arms that whir with a mechanical aura. A member of the Artificer's "
					   + "League, mechanics of magical machinery. They must have been taken hostage. As an arbiter of information, "
					   + "surely they have a means of transmitting the princess's message. Saving them is imperative, lest the "
					   + "information fall into enemy hands.";
		String artChoices[] = { "You have not been spotted. Now's your chance...", "Go in for the kill.", "Follow behind." };
		Scene artScenes[] = {stab, sneak};
		
		//Spear Route Frames
		pickSpear.createSceneFrame("crystal_storyline\\pickSpear.png", spearDesc, spearChoices, spearScenes);
		stalking.createSceneFrame("crystal_storyline\\stalking.png", stalkingDesc, stalkingChoices, stalkingScenes);
		art.createSceneFrame("crystal_storyline\\art.png", artDesc, artChoices, artScenes);
		
		/***********************************************************************************************************/
		//Flee Sequence and Branches
		Scene fleeHidden = new Scene();
		Scene fleeCaught = new Scene();
		
		//Hidden
		//Scene fall = new Scene();
		
		//Caught
		Scene withThem = new Scene();
		Scene fleeBetrayal = new Scene();
		Scene fleeBad = new Scene();
		//Flee Route Choices
		String fleeDesc = "";
		String fleeChoices[] = { "...", "!" };
		Scene fleeScenes[] = {fleeHidden, fleeCaught};
		flee.addAutoAdvance(5, 1);
		
		String fleeHiddenDesc = "You evade the enemy patrol, dashing aimlessly through this white desert. Fittingly, like quicksand"
							  + ", you feel the ground give way.";
		String fleeHiddenChoices[] = { "Uh oh.", "Brace for impact." };
		Scene fleeHiddenScenes[] = {fleeHidden};
		
		String fleeCaughtDesc = "A red arcane blast trips up your feeble attempt to escape. You crash onto the freezing sands.";
		String fleeCaughtChoices[] = { "That hurt...", "Look over your shoulder." };
		Scene fleeCaughtScenes[] = {withThem};
		
		String withThemDesc = "You realize that was not a soldier who shot you. You recognize the hooded figure from your unit."
							+ " One of their cold metal tentacles holds a portable arcane cannon, still red from firing.";
		String withThemChoices[] = { "It cannot be...", "This is..." };
		Scene withThemScenes[] = {fleeBetrayal};
		
		String fleeBetrayalDesc = "This \"artificer,\" an arcane engineer, proceeds to speak. \"Running off without saying hello? "
								+ "How rude. And you almost made off with my data sphere as well. You must have many questions, but"
								+ " alas, I'm afraid they must remain unanswered. Non-disclosure, surely you understand.\"";
		String fleeBetrayalChoices[] = { "...", "Stand up and fight.", "Run and hide." };
		Scene fleeBetrayalScenes[] = {fleeBad, fleeBad};

		String fleeBadDesc = "The wound in your leg makes you a split second slower. Next thing you know, you have reached your end.";
		//Flee Route Frames
		flee.createSceneFrame("crystal_storyline\\flee.png", fleeDesc, fleeChoices, fleeScenes);
		
		//Hidden
		fleeHidden.createSceneFrame("crystal_storyline\\fleeHidden.png", fleeHiddenDesc, fleeHiddenChoices, fleeHiddenScenes);
		
		//Caught
		fleeCaught.createSceneFrame("crystal_storyline\\fleeCaught.png", fleeCaughtDesc, fleeCaughtChoices, fleeCaughtScenes);
		withThem.createSceneFrame("crystal_storyline\\withThem.png", withThemDesc, withThemChoices, withThemScenes);
		fleeBetrayal.createSceneFrame("crystal_storyline\\fleeBetrayal.png", fleeBetrayalDesc, fleeBetrayalChoices, fleeBetrayalScenes);
		fleeBad.createSceneFrame("crystal_storyline\\fleeBad.png", fleeBadDesc);
		
		/***********************************************************************************************************/
		
		//Start game at introduction
		intro1.getFrame().setVisible(true);
	}
}
