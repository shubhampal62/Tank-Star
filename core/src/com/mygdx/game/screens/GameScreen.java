package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.MyGame;

public class GameScreen implements Screen {
    private Texture mainGameBG;
    private MyGame game;

    public GameScreen(MyGame game) {
        this.setGame(game);
    }

    @Override

    public void show() {
        setMainGameBG(new Texture(Gdx.files.internal("MainGameBG.png")));
    }


    @Override
    public void render(float delta) {

        if (Gdx.input.isTouched()) {
            System.out.println("touched at " + Gdx.input.getX() + " " + Gdx.input.getY() + " " + "in tank selection screen 1");
        }


        // PAUSE BUTTON
        if (Gdx.input.getX() > 25 && Gdx.input.getX() < 110 && Gdx.input.getY() > 25 && Gdx.input.getY() < 110) {
            if (Gdx.input.justTouched()) {
                dispose();
                getGame().setScreen(new PauseMenuScreen(getGame()));
            }
        }

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        getGame().batch.begin();
        getGame().batch.draw(getMainGameBG(), 0, 0, MyGame.WIDTH, MyGame.HEIGHT);
        getGame().batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    public Texture getMainGameBG() {
        return mainGameBG;
    }

    public void setMainGameBG(Texture mainGameBG) {
        this.mainGameBG = mainGameBG;
    }

    public MyGame getGame() {
        return game;
    }

    public void setGame(MyGame game) {
        this.game = game;
    }
}
