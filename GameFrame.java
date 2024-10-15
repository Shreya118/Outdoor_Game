package pongGame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame implements Runnable {
GamePanel panel;
    
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Save the Goal");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void run() {
        
    }
}
