package com.t3h.bbm.model.cartoon;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zon on 19/07/2015.
 */
public class Animation {
    private int frameCount;     //Counts ticks for change
    private int frameDelay;     //1-12
    private int currentFrame;

    private boolean stopped;

    private ArrayList<Image> viewFrames;

    public Animation(ArrayList<Image> images, int frameDelay) {
        for (Image view : images) {
            addFrame(view, frameDelay);
        }
        this.frameDelay = frameDelay;
        this.frameCount = 0;
        this.stopped = true;
    }

    public void start() {
        if (stopped && viewFrames.size() > 0) {
            stopped = false;
        }
    }

    public void stop() {
        if (viewFrames.size() > 0) {
            stopped = true;
        }
    }

    public void restart() {
        if (viewFrames.size() > 0) {
            stopped = false;
            currentFrame = 0;
        }
    }

    private void addFrame(Image view, int duration) {
        if (duration > 0) {
            viewFrames.add(view);
        }
    }

    public Image getSprite() {
        return viewFrames.get(currentFrame);
    }

    public void update() {
        if (!stopped) {
            frameCount++;
            if (frameCount > frameDelay) {
                frameCount = 0;
                currentFrame++;
                int totalFrames = viewFrames.size();
                if (currentFrame > totalFrames - 1) {
                    currentFrame = 0;
                } else if (currentFrame < 0) {
                    currentFrame = totalFrames - 1;
                }
            }
        }
    }
}
