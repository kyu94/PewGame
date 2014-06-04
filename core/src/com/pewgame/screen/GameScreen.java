package com.pewgame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;

public class GameScreen extends PewScreen {
	private SpriteBatch batch;
	OrthographicCamera camera;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 16, 9);
		batch = new SpriteBatch();
	}
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		batch.draw(Assets.grass, 0, 0, 1, 1);
		batch.end();
		// super.render(delta);

	}
}
