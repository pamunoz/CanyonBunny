package com.pfariasmunoz.libgdx.canyonbunny;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.pfariasmunoz.libgdx.canyonbunny.game.Assets;
import com.pfariasmunoz.libgdx.canyonbunny.screens.MenuScreen;
import com.pfariasmunoz.libgdx.canyonbunny.screens.DirectedGame;

public class CanyonBunnyMain extends DirectedGame {

    @Override
    public void create() {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        // Load assets
        Assets.instance.init(new AssetManager());
        // Start game at menu screen
        setScreen(new MenuScreen(this));
    }
}