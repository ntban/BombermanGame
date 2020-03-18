package com.t3h.bbm.model.cartoon;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zon on 19/07/2015.
 */
public class AnimatedObject {
    protected int x;
    protected int y;
    protected int direction;
    protected Animation animation;
    protected ArrayList<Image> images;
    protected final int delay = 10;

    public AnimatedObject(int x, int y){
        images = new ArrayList<>();
        this.x = x;
        this.y  = y;
    }

    public void draw(Graphics2D g){
        g.drawImage(animation.getSprite(), x, y, null);
    }

    public void loadImage(){
    }

    public Rectangle getRect(){
        Image img = images.get(0);
        return new Rectangle(x, y, img.getWidth(null), img.getHeight(null));
    }
}
