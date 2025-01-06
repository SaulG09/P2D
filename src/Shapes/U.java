package Shapes;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;
import javax.swing.*;

public class U implements Shape, Serializable {

    GeneralPath path;

    public U(float x, float y, float w, float h) {
        path = new GeneralPath();
        float x0 = x;
        float y0 = y;
        float x1 = x0 + 0.30f * w;
        float y1 = y0;
        float x2 = x1;
        float y2 = y1 + 1.00f * h;
        float x3 = x2 + 0.50f * w;
        float y3 = y2;
        float x4 = x3;
        float y4 = y3 - 1.00f * h;
        float x5 = x4 + 0.30f * w;
        float y5 = y4;
        float x6 = x5;
        float y6 = y5 + 1.30f * h;
        float x7 = x6 - 1.10f * w;
        float y7 = y6;

        path.moveTo(x0, y0);
        path.lineTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.lineTo(x4, y4);
        path.lineTo(x5, y5);
        path.lineTo(x6, y6);
        path.lineTo(x7, y7);
        path.closePath();
    }

    public boolean contains(Rectangle2D rect) {
        return path.contains(rect);
    }

    public boolean contains(Point2D point) {
        return path.contains(point);
    }

    public boolean contains(double x, double y) {
        return path.contains(x, y);
    }

    public boolean contains(double x, double y, double w, double h) {
        return path.contains(x, y, w, h);
    }

    public Rectangle getBounds() {
        return path.getBounds();
    }

    public Rectangle2D getBounds2D() {
        return path.getBounds2D();
    }

    public PathIterator getPathIterator(AffineTransform at) {
        return path.getPathIterator(at);
    }

    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return path.getPathIterator(at, flatness);
    }

    public boolean intersects(Rectangle2D rect) {
        return path.intersects(rect);
    }

    public boolean intersects(double x, double y, double w, double h) {
        return path.intersects(x, y, w, h);

    }
}
