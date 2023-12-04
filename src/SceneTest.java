import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SceneTest 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.out.println(System.getProperty("user.dir"));
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
