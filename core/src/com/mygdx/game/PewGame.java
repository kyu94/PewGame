package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.pewgame.input.GameInput;
import com.pewgame.screen.MenuScreen;


public class PewGame extends Game {

	private GameInput gameInput;
	
	@Override
	public void create() {
		Assets.load();
		gameInput = new GameInput();
		setScreen(new MenuScreen(this));
		Gdx.input.setInputProcessor(gameInput);
	}
	
	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
		gameInput.setScreen(screen);
	}

}
