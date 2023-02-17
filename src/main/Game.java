package main;

public class Game {
    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game(){
        // Create a Game Window object
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();


    }

}
