public class Player {
    private String name;
    private Scene currentScene;

    public Player(String name){
        this.name = name;
    }



    public void setCurrentScene(Scene scene){
        this.currentScene = scene;
    } 

    public Scene getCurrentScene(){
        return currentScene;
    }
}
