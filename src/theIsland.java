public class theIsland {
    public static void main(String[] args)
    {
        //Intro Scenes and Branches
        Scene intro1 = new Scene(); //landing on shore
        Scene rowBoatScene = new Scene(); //row boat path
        Scene heliScene = new Scene(); //heli path
        Scene tentScene = new Scene(); //tent path

        Scene pickMapCamp = new Scene();
        Scene pickMapLab = new Scene();
        Scene goToSea = new Scene();
        Scene findTreasure = new Scene();

        Scene smokeSignal = new Scene();

        //Intro Choices
        String intro1Desc = "\tThe Island Storyline\nYou are stranded on an abandoned island.\nYou notice an old row boat on the shore, a wrecked helicopter, and what seems to be a tent in the distance.\nWhich will you chose to visit?";
        String intro1Choices[] = {"Choices", "Go to row boat", "Go to wrecked helicopter","Go to the tent"};
        Scene intro1Scenes[] = {rowBoatScene, heliScene, tentScene};
        //row boat path
        String rowBoatDesc = "In the rowboat you find that the boat is still usable and has oars.\nYou also notice that there is a treasure map laying on the floor of the boat.\nDo you attempt to row the boat off the island or stay and try to find the treasure?";
        String rowBoatChoices[] = {"Choices", "Take the boat and row off the island", "Take the map and find the hidden treasure" };
        Scene rowBoatScenes[] = {goToSea, findTreasure};
        //heli path
        String heliSceneDesc = "Inside the helicopter you find two maps, one map seems to lead to a campsite somewhere on the island.\nYou also notice there is another map that leads to a secret laboratory somewhere beneath the island\nWhich map will you take and follow?";
        String heliChoices[] = { "Which do you pick up?", "Find map to campsite", "Find map to secret lab." };
        Scene heliScenes[] = {pickMapCamp, pickMapLab};
        //tent path
        String tentDesc = "Inside of the tent you discover a map that leads to a hidden treasure somewhere on the island.\nYou also notice there are smoke signals in the tent.\nWhich item will you take and use?";
        String tentChoices[] = {"What do you do next?", "Find smoke signals", "Find treasure map"};
        Scene tentScenes[] = {smokeSignal, findTreasure};

        //Intro Frames
        intro1.createSceneFrame("island.jpg", intro1Desc, intro1Choices, intro1Scenes);
        rowBoatScene.createSceneFrame("rowboat.jpg", rowBoatDesc, rowBoatChoices, rowBoatScenes);
        heliScene.createSceneFrame("wreckedhelicopter.jpg", heliSceneDesc, heliChoices, heliScenes);
        tentScene.createSceneFrame("tent.jpg", tentDesc, tentChoices, tentScenes);


        /***********************************************************************************************************/
        //Find map to campsite from heli path
        //map route choice
        String mapDesc = "You go to the campsite on the far side of the island.\nYou find that there are others stranded on the island.\nHowever they are native to the island and very hostile.\nThey quickly attack and kill you!";
        String mapChoices[] = { "You Died!", "Try again?"};
        Scene mapScenes[] = {intro1};
        //map lab choice
        String spearDesc = "You follow the map and it leads to a secret lab beneath the island.\nYou find creatures hidden in the lab and they attack you!\nYou are now one of them!";
        String spearChoices[] = { "You turned into a monster!", "Try again?" };
        Scene spearScenes[] = {intro1};


        //Map Heli Route Frames
        pickMapCamp.createSceneFrame("attack.jpg", mapDesc, mapChoices, mapScenes);
        pickMapLab.createSceneFrame("attack.jpg", spearDesc, spearChoices, spearScenes);


        /***********************************************************************************************************/
        //Rowboat sequences and branches

        String rowToSeaDesc = "You rowed off the island and were killed by a shark!";
        String rowToSeaChoices[] = {"You Died", "Try Again?"};
        Scene rowToSeaScenes[] = {intro1};

        String findTreasureDesc = "You went out to find the hidden treasure.\nYou found the hidden treasure and were rescued by a helicopter!\n";
        String findTreasureChoices[] = {"Success!", "Restart?"};
        Scene findTreasureSceene[] = {intro1};

        goToSea.createSceneFrame("shark.jpg", rowToSeaDesc, rowToSeaChoices, rowToSeaScenes);
        findTreasure.createSceneFrame("hiddentreasure.jpg", findTreasureDesc, findTreasureChoices, findTreasureSceene);

        /***********************************************************************************************************/
        //Tent Sequence and Branches

        String smokeDesc = "You use the smoke signals to signal a helicopter overhead.\nThe helicopter finds you!\nYou are rescued and flown off the island!";
        String smokeChoices[] = {"You survived", "Play Again?"};
        Scene smokeScenes[] = {intro1};

        smokeSignal.createSceneFrame("tent.jpg", smokeDesc, smokeChoices, smokeScenes);

        /***********************************************************************************************************/

        //Start game at introduction
        intro1.getFrame().setVisible(true);
    }
}

