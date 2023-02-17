package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

//EP1 Just like a painting you have the Frame and then the actual picture -- > JPanel
// EP2  : The inputs will be added in here
public class GamePanel extends JPanel {
    private int xDelta = 100;
    private int yDelta = 100;
    private MouseInputs mouseInputs;
    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void setRectPos(int x , int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void changexDelta(int value){
        this.xDelta += value;
        // EP2 repaint calls paintComponent and repaints the pic
        repaint();
    }
    public void changeyDelta(int value){
        this.yDelta += value;
        repaint();
    }
    // EP1 Method in JPanel to draw the picture - we need a graphic object
    // like a Paintbrush
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect( xDelta, yDelta , 200, 75);

    }
}
