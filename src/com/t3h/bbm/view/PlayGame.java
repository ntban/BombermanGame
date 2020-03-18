package com.t3h.bbm.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zon on 18/07/2015.
 */
public class PlayGame extends JPanel {

    private MapPanel mapPanel;

    public PlayGame(){
        initObject();
        setLayout(null);
        setBackground(Color.black);
    }

    private void initObject() {
        mapPanel = new MapPanel();
        add(mapPanel);
        setVisible(true);
    }
}
