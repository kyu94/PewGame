package com.pewgame.model;

import com.badlogic.gdx.math.Rectangle;

public class Tile {

	public enum TileType {
		TILE_BOX, TILE_GRASS
	}

	private float x, y;
	private int width, height;
	private TileType type;
	private Rectangle rect;

	public Tile(float x, float y, int width, int height, TileType type) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.type = type;
		rect = new Rectangle(x, y, width, height);
	}

	public void update(float delta) {
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}	

}
