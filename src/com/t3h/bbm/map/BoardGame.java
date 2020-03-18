package com.t3h.bbm.map;

import com.t3h.bbm.other.GameConstant;
import com.t3h.bbm.other.LibraryImage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by zon on 18/07/2015.
 */
public class BoardGame {
    private ArrayList<TileUnit> units;
    private ArrayList<TileUnit> grass;

    public BoardGame(int level) {
        units = new ArrayList<>();
        grass = new ArrayList<>();
        setUnits("src/MAPS/map" + level);
    }

    private void setUnits(String path) {
        try {
            File file = new File(path);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "UTF8"));
            String sequence;
            int j = 0;
            while ((sequence = in.readLine()) != null) {
                for (int i = 0; i < sequence.length(); i++) {
                    int index = Integer.parseInt(sequence.charAt(i) + "");
                    Image image = LibraryImage.imageMap.get(GameConstant.TILE
                            + (GameConstant.COUNT_ROW - 1) + GameConstant.GRASS_TYPE);
                    grass.add(new TileUnit(image, i * GameConstant.UNIT_SIZE,
                            j * GameConstant.UNIT_SIZE, GameConstant.GRASS_TYPE));
                    if (index == GameConstant.BLOCK_TYPE) {
                        image = LibraryImage.imageMap.get(GameConstant.TILE
                                + (GameConstant.COUNT_ROW - 1) + GameConstant.BLOCK_TYPE);
                        units.add(new TileUnit(image, i * GameConstant.UNIT_SIZE,
                                j * GameConstant.UNIT_SIZE, GameConstant.BLOCK_TYPE));
                    } else if(index == GameConstant.BRICK_TYPE){
                        image = LibraryImage.imageMap.get(GameConstant.TILE
                                + (GameConstant.COUNT_ROW - 1) + GameConstant.BRICK_TYPE);
                        units.add(new Brick(image, i * GameConstant.UNIT_SIZE,
                                j * GameConstant.UNIT_SIZE, GameConstant.BRICK_TYPE));
                    }
                }
                j++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void drawBoard(Graphics2D g) {//blocks and bricks are on grass
        for (int i = 0; i < grass.size(); i++) {
            grass.get(i).draw(g);
        }
        for (int i = 0; i < units.size(); i++) {
            units.get(i).draw(g);
        }
    }

    public void removeUnit(TileUnit unit) {//when brick is destroyed
        if (unit.getType() == GameConstant.BRICK_TYPE) {
            units.remove(unit);
        }
    }

    public ArrayList<TileUnit> getUnits() {
        return units;
    }
}
