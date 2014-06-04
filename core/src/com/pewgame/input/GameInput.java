package com.pewgame.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;

public class GameInput extends InputController {

	public boolean keyDown(int keycode) {

		switch (keycode) {

		case Keys.W:
			Gdx.app.log("W_pushed", "W");
			return true;
		case Keys.S:
			Gdx.app.log("S_pushed", "S");
			return true;
		case Keys.A:
			Gdx.app.log("A_pushed", "A");
			return true;
		case Keys.D:
			Gdx.app.log("D_pushed", "D");
			return true;
		}
		
		return false;

	}
}
