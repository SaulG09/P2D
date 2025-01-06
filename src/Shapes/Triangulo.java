package Shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class Triangulo implements Shape, Serializable {

    private GeneralPath path;

    public Triangulo(float x, float y, float w, float h) {
        path = new GeneralPath();
        path.moveTo(x, y + h);
        path.lineTo(x + (w / 2), y);
        path.lineTo(x + w, y + h);
        path.closePath();
    }

    @Override
    public boolean contains(Rectangle2D rect) {
        return path.contains(rect);
    }

    @Override
    public boolean contains(Point2D point) {
        return path.contains(point);
    }

    @Override
    public boolean contains(double x, double y) {
        return path.contains(x, y);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return path.contains(x, y, w, h);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return path.getBounds2D();
    }

    @Override
    public Rectangle getBounds() {
        return path.getBounds();
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return path.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return path.getPathIterator(at, flatness);
    }

    @Override
    public boolean intersects(Rectangle2D rect) {
        return path.intersects(rect);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return path.intersects(x, y, w, h);
    }
}