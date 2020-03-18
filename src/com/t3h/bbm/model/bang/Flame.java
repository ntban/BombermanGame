package com.t3h.bbm.model.bang;

import com.t3h.bbm.map.TileUnit;
import com.t3h.bbm.model.cartoon.AnimatedObject;
import com.t3h.bbm.model.cartoon.Animation;
import com.t3h.bbm.other.GameConstant;
import com.t3h.bbm.other.LibraryImage;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zon on 19/07/2015.
 */
public class Flame extends AnimatedObject {
    public Flame(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public void loadImage() {
        images.clear();
        for (int i = 0; i < GameConstant.FLAME_ROW; i++) {
            Image img = LibraryImage.imageMap.get(
                    GameConstant.FLAME + i + direction);
            images.add(img);
        }
        animation = new Animation(images, delay);
    }

    public int collision(TileUnit unit) {
        if(direction == GameConstant.HORIZONTAL_FLAME
                || direction == GameConstant.VERTICAL_FLAME){
            //cann't destroy anything
            return GameConstant.GRASS_TYPE;
        }
        int typeUnit = unit.getType();//only check in blocks and bricks
        if (unit.colide(getRect())) {
            return typeUnit;
        }
        return GameConstant.GRASS_TYPE;//not colide, it's grass
    }
}
