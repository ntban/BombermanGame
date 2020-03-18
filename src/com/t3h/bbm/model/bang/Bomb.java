package com.t3h.bbm.model.bang;

import com.t3h.bbm.map.BoardGame;
import com.t3h.bbm.map.TileUnit;
import com.t3h.bbm.model.cartoon.AnimatedObject;
import com.t3h.bbm.model.cartoon.Animation;
import com.t3h.bbm.other.GameConstant;
import com.t3h.bbm.other.LibraryImage;
import sun.plugin2.message.GetAppletMessage;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by zon on 19/07/2015.
 */
public class Bomb extends AnimatedObject {
    private ArrayList<Flame> flames;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Bomb(int x, int y) {
        super(x, y);
        flames = new ArrayList<>();
    }

    public void loadImage() {
        images.clear();
        for (int i = 0; i < GameConstant.BOMB_NUMBER; i++) {
            Image img = LibraryImage.imageMap.get(
                    GameConstant.BOMB + GameConstant.COUNT_ROW + i);
            images.add(img);
        }
        animation = new Animation(images, delay);
    }

    public void explosion(ArrayList<TileUnit> units) {//check all units on board
        //add flame in center
        flames.add(new Flame(x, y, GameConstant.CENTER_FLAME));

        //add flame in 4 sides
        Rectangle rect;
        ArrayList<TileUnit> rows = oneRowOrCol(units, true);
        ArrayList<TileUnit> cols = oneRowOrCol(units, false);

        //check for directions
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        for (int i = 1; i <= length; i++) {
            for(TileUnit tile : rows){

            }
            rect = new Rectangle(x - i * GameConstant.UNIT_SIZE, y,
                    GameConstant.UNIT_SIZE, GameConstant.UNIT_SIZE);

        }
    }

    private ArrayList<TileUnit> oneRowOrCol(ArrayList<TileUnit> units, boolean isRow) {
        //check all units on same row or col of the bombs
        ArrayList<TileUnit> rowOrCol = new ArrayList<>();
        for (TileUnit unit : units) {
            if (isRow) {
                if (unit.getY() == y) {
                    rowOrCol.add(unit);
                }
            } else {
                if (unit.getX() == x) {
                    rowOrCol.add(unit);
                }
            }
        }
        return rowOrCol;
    }


}
