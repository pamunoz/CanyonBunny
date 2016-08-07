package com.pfariasmunoz.libgdx.canyonbunny.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.pfariasmunoz.libgdx.canyonbunny.game.Assets;
/**
 * Created by Pablo Farias on 07-08-16.
 */
public abstract class AbstractGameScreen implements Screen {

    protected Game game;

    public AbstractGameScreen(Game game) {
        this.game = game;
    }

    public abstract void render (float deltaTime);
    public abstract void show ();
    public abstract void hide ();
    public abstract void pause ();

    public void resume () {
        Assets.instance.init(new AssetManager());
    }

    public void dispose () {
        Assets.instance.dispose();
    }
}
