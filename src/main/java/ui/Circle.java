package ui;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {
/*
*
* CHANGE!!
*
* */
    private Point point;
    private Point centerPoint;
    private double height;
    private double width;
    private double x0;
    private double y0;
    private double radius = 300.0;
    private double angle = 6.0;
    private double i = 0;


    public Circle(double x, double y, double width, double height) {
        point = new Point(x, y);
        centerPoint = new Point(425,425);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        point.setLocation(x, y);
        this.width = width;
        this.height = height;

    }

    public Rectangle2D getBounds2D() {
        return null;
    }
}
