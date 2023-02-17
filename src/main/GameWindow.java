package main;

import javax.swing.*;

// Using Jframe we can "have a frame to our game Window - like a picture also has a frame"
public class GameWindow {
    // I am testing out how to push.
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel){
        jframe = new JFrame();
        // Setting the size for our game window by 400x400 Pixels
        jframe.setSize(400 , 400);

        // Exit by clicking Close-Button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // In order to make the frame visible we need to make this Command
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }

}
