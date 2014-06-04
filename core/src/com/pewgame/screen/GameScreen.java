package com.pewgame.screen;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Assets;
import com.mygdx.game.PewGame;
import com.pewgame.model.Player;
import com.pewgame.model.Tile;
import com.pewgame.model.Tile.TileType;

public class GameScreen extends PewScreen {
	private SpriteBatch batch;
	private OrthographicCamera camera;
	private ArrayList<Tile> ground;
	private Player ball;

	public GameScreen(PewGame game) {
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();

		camera = new OrthographicCamera();
		camera.setToOrtho(false, 16, 9);
		batch = new SpriteBatch();
		ground = new ArrayList<Tile>();

		for (int i = 0; i < 16; i++) {
			Tile block = new Tile(i, 0, 1, 1, Tile.TileType.TILE_GRASS);
			ground.add(block);
		}
		
		ball = new Player(8, 8, 2);
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		
		ball.update(delta);

		batch.setProjectionMatrix(camera.combined);

		batch.begin();
		for (Tile t : ground) {
			if (t.getType() == TileType.TILE_GRASS) {
				batch.draw(Assets.grass,t.getX(), t.getY(), t.getWidth(), t.getHeight());
			} else if (t.getType() == TileType.TILE_BOX) {
				batch.draw(Assets.box, t.getX(), t.getY(), t.getWidth(), t.getHeight());
			}
		}
		
		batch.draw(Assets.box, ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius());
		
		batch.end();
		// super.render(delta);

	}
}
