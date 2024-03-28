package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.screens.GameMenuScreen;

public class MyGame extends Game {
	public static final int WIDTH = 1600;
	public static final int HEIGHT = 900;
	public SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		this.setScreen(new GameMenuScreen(this));
	}


	@Override
	public void render() {
		super.render();
	}

}
