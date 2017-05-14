package com.chen.mario;

import java.awt.Graphics;

import com.chen.sonar.SonarSoundEngine;
import com.chen.sonar.SoundListener;


public abstract class Scene implements SoundListener
{
    public SonarSoundEngine sound;
    public static boolean[] keys = new boolean[16];

    public void toggleKey(int key, boolean isPressed)
    {
        keys[key] = isPressed;
    }

    public final void setSound(SonarSoundEngine sound)
    {
        sound.setListener(this);
        this.sound = sound;
    }

    public abstract void init();

    public abstract void tick();

    public abstract void render(Graphics og, float alpha);
}