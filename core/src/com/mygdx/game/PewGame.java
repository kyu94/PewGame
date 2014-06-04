package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.pewgame.input.GameInput;
import com.pewgame.screen.MenuScreen;


public class PewGame extends Game {

	@Override
	public void create() {
		Assets.load();
		Gdx.input.setInputProcessor(new GameInput());
		setScreen(new MenuScreen(this));
	}

}
