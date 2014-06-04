package com.pewgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.PewGame;

public class MenuScreen extends PewScreen {

	private PewGame game;
	private SpriteBatch batch;
	private OrthographicCamera camera;

	public MenuScreen(PewGame game) {
		this.game = game;
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 16f, 9f);
		camera.update();
	}

	@Override
	public void render(float delta) {
		if (Gdx.input.justTouched()) {
			game.setScreen(new GameScreen(game));
		}

		Gdx.gl.glClearColor(0.2f, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.end();
	}

	@Override
	public boolean keyDown(int keycode) {
		System.out.println("!");
		return false;
	}
	
	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}
}
