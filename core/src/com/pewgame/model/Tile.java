package com.pewgame.model;

public class Tile {

	public enum TileType {
		TILE_BOX, TILE_GRASS
	}

	private float x, y;
	private int width, height;
	private int type;

	public Tile(float x, float y, int width, int height, int type) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = type;
	}

	public void update(float delta) {
	}

}
