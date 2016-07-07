package com.hyperspace.game.graphics;

/**
 * Created by huch on 04.07.2016..
 */
public enum Screens {
    MAIN_MENU("mainmenu"),
    GAME_SCREEN("gamescreen");

    private String screenName;

    Screens(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }
}
