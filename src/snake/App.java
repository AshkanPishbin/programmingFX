package challenges.snake.snake;


import java.awt.*;


public class App {

    public static GUI gui;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui = new GUI();
                    gui.createGameWindow();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}

