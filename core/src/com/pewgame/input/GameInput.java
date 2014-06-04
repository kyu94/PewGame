package com.pewgame.input;

import com.badlogic.gdx.Screen;
import com.pewgame.screen.PewScreen;

public class GameInput extends InputController {

	PewScreen screen;

	public boolean keyDown(int keycode) {
		return screen.keyDown(keycode);
	}
	
	public boolean keyUp(int keycode) {
		return screen.keyUp(keycode);
	}

	public void setScreen(Screen screen) {
		this.screen = (PewScreen) screen;
	}
}
