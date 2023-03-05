package demo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
// import java.awt.Point;
// import java.awt.Toolkit;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class AnimacionCirculo extends Thread {
    private static final int ANCHO = 500;
    private static final int ALTO = 400;
    private static final int RADIO = 50;
    private static final int DELAY = 5;
    
    private JFrame ventana;
    private JPanel panel;
    
    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;
    
    public AnimacionCirculo() {
        ventana = new JFrame("Animación de círculo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(new Dimension(ANCHO, ALTO));
        ventana.setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.white);
                g.fillOval(x, y, RADIO * 2, RADIO * 2);
            }
        };
        panel.setBackground(Color.BLACK);
        ventana.setContentPane(panel);
        ventana.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            x += dx;
            y += dy;

            if (x + RADIO * 2.2 > ANCHO || x < 0) {
                dx *= -1;
            }

            if (y + RADIO * 2.8 > ALTO || y < 0) {
                dy *= -1;
            }

            panel.repaint();

            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
