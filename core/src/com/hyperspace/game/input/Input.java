package com.hyperspace.game.input;

import com.badlogic.gdx.InputProcessor;
import com.hyperspace.game.graphics.AbstractScreen;

/**
 * Created by huch on 07.07.2016..
 */
public abstract class Input implements InputProcessor {

    private AbstractScreen screen;

    public Input(AbstractScreen screen) {
        this.screen = screen;
    }

    public AbstractScreen getScreen() {
        return screen;
    }

}
