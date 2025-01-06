package Shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;

public class Hexagono implements Shape, Serializable {

    private GeneralPath path;

    public Hexagono(float x, float y, float width, float height) {
        path = new GeneralPath();

        // Calcula los vértices del hexágono
        float sideLength = width / 2; // Longitud del lado del hexágono
        float hexHeight = (float) (Math.sqrt(3) * sideLength / 2);
        float x1 = x + sideLength / 2;
        float y1 = y;
        float x2 = x1 + sideLength;
        float y2 = y;
        float x3 = x2 + sideLength / 2;
        float y3 = y + hexHeight;
        float x4 = x2;
        float y4 = y + 2 * hexHeight;
        float x5 = x1;
        float y5 = y4;
        float x6 = x;
        float y6 = y3;

        // Crea el hexágono usando la GeneralPath
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.lineTo(x4, y4);
        path.lineTo(x5, y5);
        path.lineTo(x6, y6);
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
