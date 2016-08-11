package com.pfariasmunoz.libgdx.canyonbunny;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.math.Interpolation;
import com.pfariasmunoz.libgdx.canyonbunny.game.Assets;
import com.pfariasmunoz.libgdx.canyonbunny.screens.DirectedGame;
import com.pfariasmunoz.libgdx.canyonbunny.screens.MenuScreen;
import com.pfariasmunoz.libgdx.canyonbunny.screens.transitions.ScreenTransition;
import com.pfariasmunoz.libgdx.canyonbunny.screens.transitions.ScreenTransitionSlice;
import com.pfariasmunoz.libgdx.canyonbunny.util.AudioManager;
import com.pfariasmunoz.libgdx.canyonbunny.util.GamePreferences;

public class CanyonBunnyMain extends DirectedGame {

    @Override
    public void create () {
        // Set Libgdx log level
        Gdx.app.setLogLevel(Application.LOG_DEBUG);

        // Load assets
        Assets.instance.init(new AssetManager());

        // Load preferences for audio settings and start playing music
        GamePreferences.instance.load();
        AudioManager.instance.play(Assets.instance.music.song01);

        // Start game at menu screen
        ScreenTransition transition = ScreenTransitionSlice.init(2, ScreenTransitionSlice.UP_DOWN, 10, Interpolation.pow5Out);
        setScreen(new MenuScreen(this), transition);
    }

}
