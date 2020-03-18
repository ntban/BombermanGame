package com.t3h.bbm.map;

import com.t3h.bbm.other.GameConstant;

import java.awt.*;

/**
 * Created by zon on 18/07/2015.
 */
public class TileUnit {//for block, brick, grass, item - which is static
    protected Image image;
    protected int x;
    protected int y;
    protected int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public TileUnit(Image img, int x, int y, int type) {
        this.image = img;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

    public boolean colide(Rectangle rect) {
        return rect.intersects(getRect());
    }

    public int getWidth() {
        return image.getWidth(null);
    }

    public int getHeight() {
        return image.getHeight(null);
    }

    public void draw(Graphics2D g){
        g.drawImage(image, x, y, null);
    }

}
