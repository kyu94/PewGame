package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.pewgame.screen.MenuScreen;


public class PewGame extends Game {

	@Override
	public void create() {
		setScreen(new MenuScreen(this));
	}

}
