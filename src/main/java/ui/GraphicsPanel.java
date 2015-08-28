package ui;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel implements java.lang.Runnable {
   private Line line1;
    private Line line2;
    private Circle blackHole;
    public GraphicsPanel(){
        line1 = new Line(500,0,500,1000);
        line2 = new Line(0,500,1000,500);
        blackHole = new Circle(500,500,100,100);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(blackHole);


    }


    public void run() {

    }
}
