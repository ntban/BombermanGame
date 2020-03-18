package com.t3h.bbm.other;

import java.awt.*;

/**
 * Created by zon on 18/07/2015.
 */
public class GameConstant {
    public static final int LEFT_ORIENT = 1;
    public static final int RIGHT_ORIENT = 2;
    public static final int UP_ORIENT = 3;
    public static final int DOWN_ORIENT = 4;

    public static final int CENTER_FLAME = 0;
    public static final int HORIZONTAL_FLAME = 1;
    public static final int VERTICAL_FLAME = 2;
    public static final int UP_FLAME = 3;
    public static final int RIGHT_FLAME = 4;
    public static final int DOWN_FLAME = 5;
    public static final int LEFT_FLAME = 6;

    public static final int UNIT_SIZE = 16;
    public static final int BBM_SIZE = 22;
    public static final int MAP_SIZE = 416;
    public static final int PADDING_TOP = 40;
    public static final int PADDING_LEFT = 40;
    public static final int NUM_UNIT = 26;

    public static final int GRASS_TYPE = 0;
    public static final int BRICK_TYPE = 1;
    public static final int BLOCK_TYPE = 2;

    public static final int FLAME_ITEM = 0;
    public static final int BOMB_ITEM = 1;
    public static final int SHOE_ITEM = 2;
    public static final int MOVING_ITEM = 3;
    public static final int LIFE_ITEM = 4;

    public static final String GAME_TITLE = "Trying Bomberman";

    public static int WIDTH_FRAME;
    public static int HEIGHT_FRAME;

    public static final String BETTY = "betty";
    public static final String JOE = "joe";
    public static final String JOHN = "john";
    public static final String MARY = "mary";
    public static final String FADE = "fade";
    public static final String ITEM = "item";
    public static final String BOMB = "bomb";
    public static final String FLAME = "flame";
    public static final String TILE = "tile";

    public static final int BBM_COL = 3;
    public static final int BBM_ROW = 8;
    public static final int FLAME_COL = 4;
    public static final int FLAME_ROW = 7;
    public static final int COUNT_ROW = 1;
    public static final int ITEM_NUMBER = 5;
    public static final int BOMB_NUMBER = 3;
    public static final int TILE_NUMBER = 3;
    public static final int FADE_NUMBER = 7;

    public static final String BATTLE = "battle";
    public static final String DIE = "die";
    public static final String BONUS = "bonus";
    public static final String EXPLOSION = "explosion";

    public GameConstant() {
        WIDTH_FRAME = Toolkit.getDefaultToolkit().getScreenSize().width;
        HEIGHT_FRAME = Toolkit.getDefaultToolkit().getScreenSize().height;
    }
}
