package com.hyperspace.game.graphics;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.hyperspace.game.input.Input;

/**
 * Created by huch on 30.06.2016..
 */
public abstract class AbstractScreen implements Screen {

    protected abstract void draw(SpriteBatch spriteBatch);
    protected abstract void drawDebug(ShapeRenderer shapeRenderer);
    protected abstract void update(float delta);

    protected abstract Input getInput();

    public ShapeRenderer createShapeRenderer() {
        return new ShapeRenderer();
    }

    public SpriteBatch createSpriteBatch() {
        return new SpriteBatch();
    }

}
