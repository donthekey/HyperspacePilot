package com.hyperspace;

import com.badlogic.gdx.Game;
import com.hyperspace.game.graphics.ScreenController;
import com.hyperspace.game.graphics.Screens;

public class HyperspacePilot extends Game {

	private ScreenController screenController;
	
	@Override
	public void create () {
		screenController = new ScreenController(this);
		screenController.setScreen(Screens.GAME_SCREEN);
	}

}
