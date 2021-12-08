import dependency.GameScreen;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FlappyBird extends GameScreen {

    public FlappyBird() {
        super(800, 600);
        BeginGame();
    }

    @Override
    public void GAME_UPDATE(long deltaTime) {

    }

    @Override
    public void GAME_PAINT(Graphics2D g2) {

    }

    @Override
    public void KEY_ACTION(KeyEvent e, int Event) {

    }

    public static void main(String[] args) {
        new FlappyBird();
    }
}
