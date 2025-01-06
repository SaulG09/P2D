package Shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class Trapecio implements Shape, Serializable {

    GeneralPath path;

    public Trapecio(float x, float y, float w, float h) {
        path = new GeneralPath();
        path.moveTo(x, y);
        
        path.moveTo(x, y+h);
        path.lineTo(x+w, y+h);
        path.lineTo(x+(0.8f*w), y);
        path.lineTo(x+(0.2f*w), y);
        path.lineTo(x, y+h);
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
