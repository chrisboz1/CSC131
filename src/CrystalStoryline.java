
import java.awt.Color;

//Zamiel's Storyline
public class CrystalStoryline 
{
	public static void main(String[] args) 
	{
		String folderPath = "crystal_storyline/";
		
		
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
		intro1.createSceneFrame(folderPath + "intro1.png", intro1Desc, intro1Choices, intro1Scenes);
		intro2.createSceneFrame(folderPath + "intro2.png", intro2Desc, intro2Choices, intro2Scenes);
		intro3.createSceneFrame(folderPath + "intro3.png", intro3Desc, intro3Choices, intro3Scenes);
		
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
		
		String confrontDesc = "You are immediately shot by an arcane beam. You reach a pathetic end.";
		String confrontChoices[] = {"Restart?", "Yes."};
		Scene confrontScenes[] = {intro1};
		
		//Orb Route Frames
		pickOrb.createSceneFrame(folderPath + "pickOrb.png", orbDesc, orbChoices, orbScenes);
		screech.createSceneFrame(folderPath + "screech.png", screechDesc, screechChoices, screechScenes);
		spotting.createSceneFrame(folderPath + "spotting.png", spottingDesc, spottingChoices, spottingScenes);
		
		confront.createSceneFrame(folderPath + "confront.png", confrontDesc, confrontChoices, confrontScenes);

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
		pickSpear.createSceneFrame(folderPath + "pickSpear.png", spearDesc, spearChoices, spearScenes);
		stalking.createSceneFrame(folderPath + "stalking.png", stalkingDesc, stalkingChoices, stalkingScenes);
		art.createSceneFrame(folderPath + "art.png", artDesc, artChoices, artScenes);
		
		/***********************************************************************************************************/
		//Flee Sequence and Branches
		Scene fleeHidden = new Scene();
		Scene fleeCaught = new Scene();
		
		//Hidden
		Scene fall1 = new Scene();
		Scene fall2 = new Scene();
		Scene undertale = new Scene();
		Scene device = new Scene();
		Scene ambush = new Scene();
		
		Scene ambushFail = new Scene();
		Scene ambushWin = new Scene();
		
		Scene ambushBad = new Scene();
		
		Scene ambushWin1 = new Scene();
		Scene ambushWin2 = new Scene();
		Scene downWith = new Scene();
		Scene imminentBoom = new Scene();
		Scene orbSuccess = new Scene();
		Scene orbSuccess1 = new Scene();
		//Caught
		Scene withThem = new Scene();
		Scene fleeBetrayal = new Scene();
		Scene fleeBad = new Scene();
		
		//Flee Route Choices
		String fleeDesc = "REACT FAST TO FLEE SUCCESSFULLY";
		String fleeChoices[] = { "...", "!" };
		Scene fleeScenes[] = {fleeHidden, fleeCaught};
		flee.addAutoAdvance(2, 1);
		
		//Hidden
		String fleeHiddenDesc = "You evade the enemy patrol, dashing aimlessly through this white desert. Fittingly, like quicksand"
							  + ", you feel the ground give way.";
		String fleeHiddenChoices[] = { "Uh oh.", "Brace for impact." };
		Scene fleeHiddenScenes[] = {fall1};
		
		Scene fall1Next[] = {fall2};
		fall1.setNextScenes(fall1Next);
		fall1.addAutoAdvance(2, 0);
		
		Scene fall2Next[] = {undertale};
		fall2.setNextScenes(fall2Next);
		fall2.addAutoAdvance(2, 0);
		
		String undertaleDesc = "You've survived worse. This is a strange cave you found yourself in; it doesn't seem to be a natural"
							 + " formation. You hear distant sounds of machinery echo through the tunnels.";
		String undertaleChoices[] = { "Must look into this.", "Explore the cave." };
		Scene undertaleScenes[] = {device};
		
		String deviceDesc = "As you walk down one of the tunnels, the orb stirs once again. The source of the disruption becomes clear"
						  + ", as you bear witness to a malevolent device that you eventually come across.";
		String deviceChoices[] = { "The accursed thing stands in the way.", "Destroy this Crystal Imperial contraption." };
		Scene deviceScenes[] = {ambush};
		
		String ambushDesc = "YOU HEAR AN ARCANE WEAPON CHARGING UP";
		String ambushChoices[] = { "...", "!" };
		Scene ambushScenes[] = {ambushWin, ambushFail};
		ambush.addAutoAdvance(3, 1);
		
		String ambushFailDesc = "A red flash pierces through your chest and you collapse on the ground. You cannot see"
							  + "; it seems that your assailant has enveloped you in magical darkness.";
		String ambushFailChoices[] = { "Pain...", "Turn to face the darkness." };
		Scene ambushFailScenes[] = {ambushBad};
		
		String ambushBadDesc = "The last thing you see is two red eyes and a mechanical voice. \"Poor little guardsman, unveiling"
						   + " the enemy underground, when the true threat was that among their own ranks.\"";
		String ambushBadChoices[] = {"Restart?", "Yes."};
		Scene ambushBadScenes[] = {intro1};
		
		Scene aWNext[] = {ambushWin1};
		ambushWin.setNextScenes(aWNext);
		ambushWin.addAutoAdvance(2, 0);
		
		Scene aW1Next[] = {ambushWin2};
		ambushWin1.setNextScenes(aW1Next);
		ambushWin1.addAutoAdvance(2, 0);
		
		Scene aW2Next[] = {downWith};
		ambushWin2.setNextScenes(aW2Next);
		ambushWin2.addAutoAdvance(2, 0);
		
		String downWithDesc = "Believe it or not, you know who this is. They're your regiment's artificer, an arcane engineer who"
							+ " takes charge of information collection and technology. And, evidently, it seems that this one has"
							+ " engaged in dark dealings with the enemy. Their eyes glow red and green; they cackle as they gradually"
							+ " slip away. \"Foolish, meddling guardsman...Ha...You may have struck me down, but your efforts are all"
							+ " for naught! I will make sure you go down with me!\"";
		String downWithChoices[] = { "One of their mechanical arms reaches for something!", "Grab it!" };
		Scene downWithScenes[] = {imminentBoom};
		
		String imminentBoomDesc = "Your quick thinking allows you to tackle the corrupted artificer, but not before they are able to "
								+ "take out their own crystal orb. Lightning crackles and jumps toward the machine. You know that with"
								+ " that energy, this whole cave system is set to blow. Tackling down the artificer has interrupted the"
								+ " process enough to buy you a little time to do one last thing...";
		String imminentBoomChoices[] = { "Their orb seems immune to the machine's mitigation...", "Connect the orbs." };
		Scene imminentBoomScenes[] = {orbSuccess};
		
		String orbSuccessDesc = "You hastily set a connection between the former artificer's orb and your own. Able to access the information"
							  + " inside yours, the artificer's orb is able to establish a connection with home and send the message. As the"
							  + " machine growls even more aggressively, you are prepared to accept your fate. You lay down next to the nearest"
							  + " rock to rest...";
		String orbSuccessChoices[] = { "But one last transmission comes through the orb...", "Listen in..." };
		Scene orbSuccessScenes[] = {orbSuccess1};
		
		String orbSuccess1Desc = "It's the princess. It seems she wanted to reply to you, face to face. \"Well done soldier. This information"
							   + " will prove useful to the war effort. But wait, where is your regiment?\" You give a weak reply: \"Died with"
							   + " honor, ma'am. And perhaps...One dishonerably.\" With a pause, the princess gives you one last order. \"I"
							   + " understand. Rest easy now.\" You close your eyes, and accept this end.";
		String orbSuccess1Choices[] = {"Restart?", "Yes."};
		Scene orbSuccess1Scenes[] = {intro1};
		//Caught
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
		String fleeBadChoices[] = {"Restart?", "Yes."};
		Scene fleeBadScenes[] = {intro1};
		//Flee Route Frames
		flee.createSceneFrame(folderPath + "flee.png", fleeDesc, fleeChoices, fleeScenes);
		
		//Hidden
		fleeHidden.createSceneFrame(folderPath + "fleeHidden.png", fleeHiddenDesc, fleeHiddenChoices, fleeHiddenScenes);
		fall1.createSceneFrame(folderPath + "fall1.png");
		fall2.createSceneFrame(folderPath + "fall2.png");
		undertale.createSceneFrame(folderPath + "undertale.png", undertaleDesc, undertaleChoices, undertaleScenes);
		setToCaveColors(undertale, 1);
		device.createSceneFrame(folderPath + "device.png", deviceDesc, deviceChoices, deviceScenes);
		setToCaveColors(device, 1);
		ambush.createSceneFrame(folderPath + "ambush.png", ambushDesc, ambushChoices, ambushScenes);
		setToCaveColors(ambush, 1);
		
		ambushFail.createSceneFrame("empty", ambushFailDesc, ambushFailChoices, ambushFailScenes);
		setToCaveColors(ambushFail, 0);
		ambushBad.createSceneFrame(folderPath + "ambushBad.png", ambushBadDesc, ambushBadChoices, ambushBadScenes);
		setToCaveColors(ambushBad, 1);
		
		ambushWin.createSceneFrame(folderPath + "ambushWin.png");
		ambushWin1.createSceneFrame(folderPath + "ambushWin1.png");
		ambushWin2.createSceneFrame(folderPath + "ambushWin2.png");
		downWith.createSceneFrame(folderPath + "downWith.png", downWithDesc, downWithChoices, downWithScenes);
		setToCaveColors(downWith, 1);
		imminentBoom.createSceneFrame(folderPath + "imminentBoom.png", imminentBoomDesc, imminentBoomChoices, imminentBoomScenes);
		setToCaveColors(imminentBoom, 1);
		orbSuccess.createSceneFrame(folderPath + "orbSuccess.png", orbSuccessDesc, orbSuccessChoices, orbSuccessScenes);
		setToCaveColors(orbSuccess, 1);
		orbSuccess1.createSceneFrame(folderPath + "orbSuccess1.png", orbSuccess1Desc, orbSuccess1Choices, orbSuccess1Scenes);
		setToCaveColors(orbSuccess1, 1);
		
		//Caught
		fleeCaught.createSceneFrame(folderPath + "fleeCaught.png", fleeCaughtDesc, fleeCaughtChoices, fleeCaughtScenes);
		withThem.createSceneFrame(folderPath + "withThem.png", withThemDesc, withThemChoices, withThemScenes);
		fleeBetrayal.createSceneFrame(folderPath + "fleeBetrayal.png", fleeBetrayalDesc, fleeBetrayalChoices, fleeBetrayalScenes);
		fleeBad.createSceneFrame(folderPath + "fleeBad.png", fleeBadDesc, fleeBadChoices, fleeBadScenes);
		setToCaveColors(fleeBad, 1);
		
		/***********************************************************************************************************/
		
		//Start game at introduction
		intro1.getFrame().setVisible(true);
	}
	
	private static void setToCaveColors(Scene scene, int textComponent) 
	{
		Color caveColor = new Color(9, 3, 49);
		scene.getFrame().getContentPane().setBackground(caveColor);
		scene.getFrame().getContentPane().getComponent(textComponent).setForeground(Color.white); //Set text as white
	}
}


