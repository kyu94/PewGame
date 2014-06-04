package com.pewgame.model;

import com.badlogic.gdx.math.Circle;

public class Player {
	private float x, y;
	private int radius;
	private float velX = 0, velY = -10;
	Circle circ;
	
	public Player(float x, float y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		circ = new Circle(x, y, radius);
	}
	
	public void update(float delta) {
		x += velX * delta;
		y += velY * delta;
		
		if (y < 1) {
			y = 1;
			velY = -velY;
		}
		
		velY -= 2;
		
		circ.setPosition(x, y);
	}
	
	public float setVelX(int x) {
		
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
	
	public Circle getCirc() {
		return circ;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
