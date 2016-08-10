package com.pfariasmunoz.libgdx.canyonbunny.screens.transitions;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
/**
 * Created by Pablo Farias on 09-08-16.
 */
public interface ScreenTransition {
    public float getDuration();
    public void render(SpriteBatch batch, Texture currScreen, Texture nextScreen, float alpha);
}
