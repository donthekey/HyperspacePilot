package com.hyperspace.game.graphics.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.hyperspace.game.graphics.AbstractScreen;
import com.hyperspace.game.input.GameScreenInput;
import com.hyperspace.game.input.Input;

/**
 * Created by huch on 04.07.2016..
 */
public class GameScreen extends AbstractScreen {

    private ShapeRenderer shapeRenderer;

    private SpriteBatch spriteBatch;

    private GameScreenInput input;

    public GameScreen() {
        init();
    }

    private void init() {
        shapeRenderer = createShapeRenderer();
        spriteBatch = createSpriteBatch();
        input = new GameScreenInput(this);
    }

    @Override
    public void show() {

    }

    @Override
    protected void draw(SpriteBatch spriteBatch) {

    }

    @Override
    protected void drawDebug(ShapeRenderer shapeRenderer) {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.GREEN);
        shapeRenderer.circle(50, 50, 30);
        shapeRenderer.end();
    }

    @Override
    protected void update(float delta) {

    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update(delta);
        draw(spriteBatch);
        drawDebug(shapeRenderer);
    }

    public Input getInput() {
        return input;
    }

}
