package com.t3h.bbm.other;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * Created by zon on 18/07/2015.
 */
public class LibraryImage {
    public static HashMap<String, Image> imageMap;

    public LibraryImage() {
        imageMap = new HashMap<String, Image>();

        loadImage(GameConstant.BETTY, GameConstant.BBM_SIZE, GameConstant.BBM_COL, GameConstant.BBM_ROW);
        loadImage(GameConstant.JOE, GameConstant.BBM_SIZE, GameConstant.BBM_COL, GameConstant.BBM_ROW);
        loadImage(GameConstant.JOHN, GameConstant.BBM_SIZE, GameConstant.BBM_COL, GameConstant.BBM_ROW);
        loadImage(GameConstant.MARY, GameConstant.BBM_SIZE, GameConstant.BBM_COL, GameConstant.BBM_ROW);

        loadImage(GameConstant.FADE, GameConstant.UNIT_SIZE, GameConstant.FADE_NUMBER, GameConstant.COUNT_ROW);
        loadImage(GameConstant.ITEM, GameConstant.UNIT_SIZE, GameConstant.ITEM_NUMBER, GameConstant.COUNT_ROW);
        loadImage(GameConstant.BOMB, GameConstant.UNIT_SIZE, GameConstant.BOMB_NUMBER, GameConstant.COUNT_ROW);
        loadImage(GameConstant.FLAME, GameConstant.UNIT_SIZE, GameConstant.FLAME_COL, GameConstant.FLAME_ROW);
        loadImage(GameConstant.TILE, GameConstant.UNIT_SIZE, GameConstant.TILE_NUMBER, GameConstant.COUNT_ROW);
    }

    private void loadImage(String imgName, int size, int col, int row) {
        try {
            BufferedImage buffImg = ImageIO.read(getClass().
                    getResourceAsStream("/IMAGES/" + imgName + ".png"));
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    BufferedImage bi = buffImg.getSubimage(i * size, j * size, size, size);
                    imageMap.put(imgName + j + i, bi);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
