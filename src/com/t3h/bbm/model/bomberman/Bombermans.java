package com.t3h.bbm.model.bomberman;

/**
 * Created by zon on 18/07/2015.
 */
public class Bombermans {
    private int speed;
    private int life;
    private int bombLength;
    private int bombCount;
    private boolean bombMoving;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setBombLength(int bombLength) {
        this.bombLength = bombLength;
    }

    public void setBombCount(int bombCount) {
        this.bombCount = bombCount;
    }

    public void setBombMoving(boolean bombMoving) {
        this.bombMoving = bombMoving;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLife() {
        return life;
    }

    public int getBombLength() {
        return bombLength;
    }

    public int getBombCount() {
        return bombCount;
    }

    public boolean isBombMoving() {
        return bombMoving;
    }
}
