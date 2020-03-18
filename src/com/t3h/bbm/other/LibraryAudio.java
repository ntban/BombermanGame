package com.t3h.bbm.other;

import javax.sound.sampled.Clip;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by zon on 18/07/2015.
 */
public class LibraryAudio {
    public static HashMap<String, MidiSound> soundMap;
    public LibraryAudio() {
        soundMap = new HashMap<String, MidiSound>();

        loadSound(GameConstant.BATTLE);
        loadSound(GameConstant.BONUS);
        loadSound(GameConstant.DIE);
        loadSound(GameConstant.EXPLOSION);
    }

    private void loadSound(String name) {
        soundMap.put(name, new MidiSound(name));
    }

    public static void play(String song) {
        soundMap.get(song).play();
        if (song.equals(GameConstant.BATTLE)) {
            soundMap.get(song).loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public static void stopAll() {
        for (String k : soundMap.keySet()) {
            soundMap.get(k).stop();
        }
    }
}
