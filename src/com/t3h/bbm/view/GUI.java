package com.t3h.bbm.view;

import com.t3h.bbm.other.GameConstant;
import com.t3h.bbm.other.LibraryAudio;
import com.t3h.bbm.other.LibraryImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by zon on 18/07/2015.
 */
public class GUI extends JFrame {
    public static boolean IS_RUNNING = true;

    public GUI() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new CardLayout());
        setLocationRelativeTo(null);
        //    setResizable(false);
        initObject();
        addWindowListener(windowAdapter);
    }

    private void initObject() {
        new GameConstant();
        new LibraryImage();
       // new LibraryAudio();
        add(new MapPanel());
      // LibraryAudio.play(LibraryAudio.BATTLE);
    }

    private WindowAdapter windowAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            int con = JOptionPane.showConfirmDialog(null, "Are you really want to quit?");
            if (con == 0) {
                IS_RUNNING = false;
                System.exit(0);
            }
        }
    };
}
