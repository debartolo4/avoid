package Games.SpaceInvaders;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

/**
 * 
 * Defining player in Space Invaders
 * 
 * @author G5 lab group
 *
 */
public class Player extends Sprite implements Commons{

//  private final int START_Y = 280; 
//  private final int START_X = 270;

//  private final String player = "player.png";
    private int width;

    public Player() {
    	
    	int START_Y = 280; 
    	int START_X = 270;
    	String player = "player.png";

        ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

        width = ii.getImage().getWidth(null); 

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        x += dx;
        if (x <= 2) 
            x = 2;
        if (x >= BOARD_WIDTH - 2*width) 
            x = BOARD_WIDTH - 2*width;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT)
        {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT)
        {
            dx = 0;
        }
    }
}