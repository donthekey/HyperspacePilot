package com.hyperspace.game.graphics;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.hyperspace.game.graphics.screens.GameScreen;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huch on 04.07.2016..
 */
public class ScreenController {

    private Game game;

    private Map<String, AbstractScreen> screens = new HashMap<String, AbstractScreen>();

    private AbstractScreen currentScreen;

    public ScreenController(Game game) {
        this.game = game;
        createScreens();
    }

    private void createScreens() {
        screens.put(Screens.GAME_SCREEN.getScreenName(), new GameScreen());
    }

    public boolean setScreen(Screens screen) {
        String screenName = screen.getScreenName();
        if(!screens.containsKey(screenName)) {
            System.out.println("Can't set screen.");
            return false;
        }
        currentScreen = screens.get(screenName);
        game.setScreen(currentScreen);
        Gdx.input.setInputProcessor(currentScreen.getInput());
        System.out.println("Screen set with name " + screenName + ".");
        return true;
    }

}
