package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	
	public static TextureRegion box, grass;

	public static void load() {
		box = new TextureRegion(new Texture(Gdx.files.internal("box.png")));
		box = new TextureRegion(new Texture(Gdx.files.internal("grass.png")));
	}
	
}