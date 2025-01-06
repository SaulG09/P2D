package Shapes;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;
import javax.swing.*;

public class Corona implements Shape, Serializable {

    GeneralPath path;

    public Corona(float x, float y, float w, float h) {
        path = new GeneralPath();
        float x0 = x;
        float y0 = y;
        float x1 = x + 0.20f * w;
        float y1 = y + 0.20f * h;
        float x2 = x + 0.40f * w;
        float y2 = y;
        float x3 = x + 0.60f * w;
        float y3 = y + 0.20f * h;
        float x4 = x + 0.80f * w;
        float y4 = y;
        float x5 = x + 0.80f * w;
        float y5 = y + 0.80f * h;
        float x6 = x;
        float y6 = y + 0.80f * h;

        path.moveTo(x0, y0);
        path.lineTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.lineTo(x4, y4);
        path.lineTo(x5, y5);
        path.lineTo(x6, y6);

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
