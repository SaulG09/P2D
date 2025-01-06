package Shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class Pentagono implements Shape, Serializable {

    private GeneralPath path;

    public Pentagono(float x, float y, float width, float height) {
        path = new GeneralPath();

        // Calcula los vértices del pentágono sin rotación
        float sideLength = Math.min(width, height); // Longitud del lado del pentágono
        float angle = (float) Math.toRadians(72); // Ángulo entre los vértices del pentágono

        float x1 = x + width / 2; // Centro en x
        float y1 = y - height / 2; // Centro en y

        path.moveTo(x1 + sideLength * (float) Math.cos(-angle * 2), y1 + sideLength * (float) Math.sin(-angle * 2));

        for (int i = 1; i < 5; i++) {
            float xi = x1 + sideLength * (float) Math.cos(-angle * 2 + angle * i);
            float yi = y1 + sideLength * (float) Math.sin(-angle * 2 + angle * i);
            path.lineTo(xi, yi);
        }

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