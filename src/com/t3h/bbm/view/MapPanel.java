package com.t3h.bbm.view;

import com.t3h.bbm.map.BoardGame;
import com.t3h.bbm.other.GameConstant;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zon on 18/07/2015.
 */
public class MapPanel extends JPanel {
    private BoardGame board;
    private boolean isPause;
    private int level = 1;

    public MapPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(GameConstant.WIDTH_FRAME, GameConstant.HEIGHT_FRAME));
//        setBounds((GameConstant.WIDTH_FRAME - GameConstant.MAP_SIZE) / 2,
//                GameConstant.PADDING_TOP,
//                GameConstant.MAP_SIZE, GameConstant.MAP_SIZE);
        setBackground(Color.WHITE);
        setFocusable(true);
        setVisible(true);
        setupGame();
    }

    private void setupGame() {
        board = new BoardGame(level);
    }

    @Override
    protected void paintComponent(Graphics arg) {
        super.paintComponent(arg);
        Graphics2D g = (Graphics2D) arg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
       board.drawBoard(g);
    }
}
