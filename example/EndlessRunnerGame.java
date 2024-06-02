import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EndlessRunnerGame extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private int playerX, playerY, playerSpeed;
    private int obstacleX, obstacleY, obstacleSpeed;
    private boolean isJumping;
    private boolean powerUpActive;
    private int powerUpX, powerUpY;

    public EndlessRunnerGame() {
        playerX = 50;
        playerY = 250;
        playerSpeed = 5;
        isJumping = false;
        powerUpActive = false;

        obstacleX = 800;
        obstacleY = 250;
        obstacleSpeed = 7;

        powerUpX = -200;
        powerUpY = -200;

        timer = new Timer(20, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        playerX += playerSpeed;
        obstacleX -= obstacleSpeed;

        if (obstacleX < 0) {
            obstacleX = 800;
            obstacleY = 250;
        }

        if (powerUpActive) {
            powerUpX -= playerSpeed;
            if (powerUpX < 0) {
                powerUpX = -200;
                powerUpY = -200;
                powerUpActive = false;
            }
        }

        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw player
        g.setColor(Color.BLUE);
        g.fillRect(playerX, playerY, 30, 30);

        // Draw obstacle
        g.setColor(Color.RED);
        g.fillRect(obstacleX, obstacleY, 30, 30);

        // Draw power-up (if active)
        if (powerUpActive) {
            g.setColor(Color.GREEN);
            g.fillRect(powerUpX, powerUpY, 30, 30);
        }
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE && !isJumping) {
            jump();
        } else if (keyCode == KeyEvent.VK_SHIFT && !powerUpActive) {
            activatePowerUp();
        }
    }

    public void keyReleased(KeyEvent e) {}

    private void jump() {
        isJumping = true;
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                playerY -= 5;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 30; i++) {
                playerY += 5;
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isJumping = false;
        }).start();
    }

    private void activatePowerUp() {
        powerUpActive = true;
        powerUpX = 800;
        powerUpY = 250;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Endless Runner Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(new EndlessRunnerGame());
        frame.setVisible(true);
    }
}
