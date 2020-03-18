package com.t3h.bbm.other;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import java.net.URL;

/**
 * Created by zon on 18/07/2015.
 */
public class MidiSound {
    private static Sequencer player;

    public MidiSound(String songName){
        URL url = getClass().getResource("/SOUNDS/" + songName + ".mid");
        try{
            Sequence song = MidiSystem.getSequence(url);
            player = MidiSystem.getSequencer();
            player.setSequence(song);
            player.open();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void loop(int number){
        if(player != null){
            player.setLoopCount(number);
        }
    }

    public static void play(){
        new Thread(){
            @Override
            public void run() {
                if(player != null && !player.isRunning()){
                    player.start();
                }
            }
        }.start();
    }

    public static void stop(){
        if(player != null && player.isRunning()){
            player.stop();
        }
    }
}
