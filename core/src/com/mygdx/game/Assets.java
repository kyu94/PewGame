package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
	
	public static TextureRegion box, grass;
	public static Music bgm; 

	public static void load() {
		box = new TextureRegion(new Texture(Gdx.files.internal("box.png")));
		grass = new TextureRegion(new Texture(Gdx.files.internal("grass.png")));
		bgm = Gdx.audio.newMusic(Gdx.files.internal("dubstep.ogg"));
	}
	
}
