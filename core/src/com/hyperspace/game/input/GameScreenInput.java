package com.hyperspace.game.input;

import com.hyperspace.game.graphics.screens.GameScreen;

/**
 * Created by huch on 07.07.2016..
 */
public class GameScreenInput extends Input {

    public GameScreenInput(GameScreen gameScreen) {
        super(gameScreen);
    }

    @Override
    public boolean keyDown(int keycode) {
        System.out.println("Working input.");
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
