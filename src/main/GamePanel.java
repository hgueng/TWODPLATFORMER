package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//EP1 Just like a painting you have the Frame and then the actual picture -- > JPanel
// EP2  : The inputs will be added in here
public class GamePanel extends JPanel {
    private float xDelta = 100 , yDelta = 100;
    private float xDir = 1f , yDir = 1f;

    private Color color = new Color(150 , 20 , 90);
    private Random random;

    private MouseInputs mouseInputs;
    public GamePanel(){
        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void setRectPos(int x , int y){
        this.xDelta = x;
        this.yDelta = y;

    }

    public void changexDelta(int value){
        this.xDelta += value;
        // EP2 repaint calls paintComponent and repaints the pic

    }
    public void changeyDelta(int value){
        this.yDelta += value;

    }
    // EP1 Method in JPanel to draw the picture - we need a graphic object
    // like a Paintbrush
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        updateRectangle();
        g.setColor(color);
        g.fillRect( (int)xDelta, (int)yDelta , 200, 75);

        }




    private void updateRectangle() {
        xDelta+=xDir;
        if(xDelta > 400 || xDelta < 0 ){
            xDir *= -1;
            color = getRndColor();
        }
        yDelta+=yDir;
        if(yDelta > 400 || yDelta < 0 ){
            yDir *= -1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g,b);
    }
}
