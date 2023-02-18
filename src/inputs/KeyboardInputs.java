package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    //  EP2 This let's us change the variable inside our GamePanel
    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamepanel){
        this.gamePanel = gamepanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                // EP2 : Here you can see an example to change the y coordinates by pressing W
                // Our method inside the GamePanel clas is called and we increase the value
                gamePanel.changeyDelta(-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.changexDelta(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeyDelta(5);
                break;
            case KeyEvent.VK_D:
                gamePanel.changexDelta(5);

                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
