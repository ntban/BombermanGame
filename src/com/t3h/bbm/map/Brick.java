package com.t3h.bbm.map;

import com.t3h.bbm.other.GameConstant;
import com.t3h.bbm.other.LibraryImage;

import java.awt.*;
import java.util.Random;

/**
 * Created by zon on 19/07/2015.
 */
public class Brick extends TileUnit {
    private ItemSpecial item;

    public Brick(Image img, int x, int y, int type) {
        super(img, x, y, type);
    }

    public void explosion() {//item is on board
        int random = new Random().nextInt(10);
        if (random < GameConstant.ITEM_NUMBER) {
            Image image = LibraryImage.imageMap.get(GameConstant.ITEM + random
                    + GameConstant.COUNT_ROW);
            item = new ItemSpecial(image, x, y, random);
        }
        image = item.getImage();
    }
}
