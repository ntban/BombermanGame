package com.t3h.bbm.map;

import com.t3h.bbm.model.bomberman.Bombermans;
import com.t3h.bbm.other.GameConstant;

import java.awt.*;

/**
 * Created by zon on 19/07/2015.
 */
public class ItemSpecial extends TileUnit{
    public ItemSpecial(Image img, int x, int y, int type) {
        super(img, x, y, type);
    }

    public void special(Bombermans bbm){
        switch (type){
            case GameConstant.FLAME_ITEM:
                bbm.setBombLength(bbm.getBombLength() + 1);
                break;
            case GameConstant.BOMB_ITEM:
                bbm.setBombCount(bbm.getBombCount() + 1);
                break;
            case GameConstant.SHOE_ITEM:
                bbm.setSpeed(bbm.getSpeed() + 1);
                break;
            case  GameConstant.MOVING_ITEM:
                bbm.setBombMoving(true);
                break;
            case GameConstant.LIFE_ITEM:
                bbm.setLife(bbm.getLife() + 1);
                break;
        }
    }
}
