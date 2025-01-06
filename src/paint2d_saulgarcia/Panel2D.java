package paint2d_saulgarcia;

import Shapes.Corona;
import Shapes.U;
import Shapes.Estrella;
import Shapes.Flecha;
import Shapes.Hexagono;
import Shapes.Pentagono;
import Shapes.Rombo;
import Shapes.Semicirculo;
import Shapes.Trapecio;
import Shapes.Triangulo;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JPanel;

class Panel2D extends JPanel implements Serializable, MouseListener, MouseMotionListener {

    static final int BORRAR = -2;
    static final int LAPIZ = -1;
    static final int RECTANGLE = 0;
    static final int ROUNDRECTANGLE2D = 1;
    static final int ELLIPSE2D = 2;
    static final int ARC2D = 3;
    static final int LINE2D = 4;
    static final int QUADCURVE2D = 5;
    static final int CUBICCURVE2D = 6;
    static final int POLYGON = 7;

    static final int TRANSLATION = 10;
    static final int ROTATION = 11;
    static final int SHEARING = 12;
    static final int SCALING = 13;
    static final int REFLECTION = 14;

    static final int OR = 20;
    static final int AND = 21;
    static final int NOT = 22;
    static final int XOR = 23;

    static final int MOVETO = 30;
    static final int LINETO = 31;
    static final int CURVETO = 32;
    static final int QUEADTO = 33;
    static final int CLOSEPATH = 34;

    static final int TRIANGULO = 40;
    static final int ROMBO = 41;
    static final int HEXAGONO = 42;
    static final int PENTAGONO = 43;
    static final int TRAPECIO = 44;
    static final int SEMICIRCULO = 45;
    static final int FLECHA = 46;
    static final int CORONA = 47;
    static final int ESTRELLA = 48;
    static final int U = 49;

    static final int SAVED = 50;

    //NewShape
    boolean saved = false;
    
    Shape temp = null;

    //Color
    Color border = Color.BLACK;
    float valAlph = 1.0f;
    AlphaComposite al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, valAlph);
    boolean alfaComp = false;
    boolean bor = false;
    boolean strok = false;

    //Stroke
    int thickness = 1;
    float[] dashArray = null;
    float dashPhase = 0;
    int cap = 1;
    int join = 1;
    int miterLimit = 15;
    Stroke stroke = new BasicStroke(thickness, cap, join, 0,
            dashArray, dashPhase);

    //Paint
    Color solid = new Color(0, 0, 0);

    boolean paintShape = false;
    Paint paint = null;

    int gradX1 = 1;
    int gradX2 = 1;
    int gradY1 = 1;
    int gradY2 = 1;
    Color gradiant1 = new Color(255, 153, 153);
    Color gradiant2 = new Color(204, 153, 255);

    boolean cyclic = false;

    //Tipo
    String typePaint = "Ninguno";

    //Texture
    URL bimage = null;
    int x_tex = 0;
    int y_tex = 0;
    int width_tex = 100;
    int height_tex = 100;

    //
    //Transformations
    int indexShape = -1;

    Vector<ColoredShape> coloredShapes = new Vector<>();

    Vector points = new Vector();
    int pointIndex = 0;
    Point p = null;
    Shape partialShape = null;
    Shape drawShape = null;

    boolean trans = false;

    boolean areaOper = false;
    boolean nueva = false;

    //Aqui se cambia la figura
    int shapeType = RECTANGLE;

    //GeneralPath
    GeneralPath gp = null;
    boolean general = false;
    int q1 = -10000;
    int q2 = -10000;
    int q3 = -10000;
    int q4 = -10000;

    public void setShapeType(int i) {
        shapeType = i;
    }

    public Panel2D() {
        super();
        setPreferredSize(new Dimension(1080, 720));
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        /*BufferedImage bufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int i = 0; i < coloredShapes.size(); i++) {
            g2.setComposite(coloredShapes.get(i).getAlpha());
            g2.setPaint(coloredShapes.get(i).getPaint());
            if (coloredShapes.get(i).getPaint() != null) {
                g2.fill(coloredShapes.get(i).getShape());
            }
            g2.setColor(coloredShapes.get(i).getColor());
            g2.setStroke(coloredShapes.get(i).getStroke());
            g2.draw(coloredShapes.get(i).getShape());
        }*/

        BufferedImage bufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bufferedGraphics = bufferedImage.createGraphics();

        for (ColoredShape coloredShape : coloredShapes) {
            if (coloredShape.getAlpha() != null) {
                bufferedGraphics.setComposite(coloredShape.getAlpha());
            }

            bufferedGraphics.setPaint(coloredShape.getPaint());
            if (coloredShape.getPaint() != null) {
                bufferedGraphics.fill(coloredShape.getShape());
            }
            bufferedGraphics.setStroke(coloredShape.getStroke());
            bufferedGraphics.setColor(coloredShape.getColor());
            bufferedGraphics.draw(coloredShape.getShape());
        }

        bufferedGraphics.dispose();
        g.drawImage(bufferedImage, 0, 0, this);

        // Dibuja el BufferedImage en el componente
    }

    public void mouseClicked(MouseEvent e) {
        points.clear();
        pointIndex = 0;
        p = null;
        if (bor == true) {
            Graphics2D g2 = (Graphics2D) getGraphics();
            for (int i = 0; i < coloredShapes.size(); i++) {
                if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                    System.out.println("SIIIIII");
                    coloredShapes.get(i).setColor(border);
                    break;
                }
            }
            repaint();
        }

        if (strok == true) {
            Graphics2D g2 = (Graphics2D) getGraphics();
            stroke = new BasicStroke(thickness, cap, join, miterLimit,
                    dashArray, dashPhase);
            for (int i = 0; i < coloredShapes.size(); i++) {

                if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                    System.out.println("SIIIIII");
                    coloredShapes.get(i).setStroke(stroke);
                    coloredShapes.get(i).setThickness(thickness);
                    coloredShapes.get(i).setDashArray(dashArray);
                    coloredShapes.get(i).setDashPhase(dashPhase);
                    coloredShapes.get(i).setCap(cap);
                    coloredShapes.get(i).setJoin(join);
                    coloredShapes.get(i).setMiterLimit(miterLimit);
                    break;
                }
            }
            repaint();
        }

        if (paintShape == true) {
            Graphics2D g2 = (Graphics2D) getGraphics();
            for (int i = 0; i < coloredShapes.size(); i++) {

                if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                    System.out.println("SIIIIII");

                    coloredShapes.get(i).setTypePaint(typePaint);
                    coloredShapes.get(i).setColorg1(gradiant1);
                    coloredShapes.get(i).setColorg2(gradiant2);
                    coloredShapes.get(i).setXcolorg1(gradX1);
                    coloredShapes.get(i).setYcolorg1(gradY1);
                    coloredShapes.get(i).setXcolorg2(gradX2);
                    coloredShapes.get(i).setYcolorg2(gradY2);
                    coloredShapes.get(i).setCyclic(cyclic);
                    coloredShapes.get(i).setPaint(paint);
                    coloredShapes.get(i).setImagen(bimage);
                    coloredShapes.get(i).setXtextu(x_tex);
                    coloredShapes.get(i).setYtextu(y_tex);
                    coloredShapes.get(i).setWidthtex(width_tex);
                    coloredShapes.get(i).setHeighttext(height_tex);

                    break;
                }
            }
            repaint();
        }

        if (alfaComp == true) {
            Graphics2D g2 = (Graphics2D) getGraphics();
            for (int i = 0; i < coloredShapes.size(); i++) {
                if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                    System.out.println("SIIIIII");
                    coloredShapes.get(i).setAlpha(al);
                    //paintShape = false;
                    break;
                }
            }
            repaint();
        }

        if (general == true) {
            Graphics2D g2 = (Graphics2D) getGraphics();
            g2.setColor(border);
            g2.setStroke(stroke);

            if (shapeType == 30) {
                gp = new GeneralPath();
                gp.moveTo(e.getX(), e.getY());
            } else {
                if (gp != null) {
                    if (shapeType == 31) {
                        gp.lineTo(e.getX(), e.getY());
                        g2.draw(gp);
                    } else {
                        if (shapeType == 32) {
                            // Implementa curva cúbica (curveTo)
                            if (q1 != -10000 && q2 != -10000 && q3 != -10000 && q4 != -10000) {
                                gp.curveTo(q1, q2, q3, q4, e.getX(), e.getY());
                                g2.draw(gp);
                                q1 = -10000;
                                q2 = -10000;
                                q3 = -10000;
                                q4 = -10000;
                            } else {
                                if (q1 != -10000 && q2 != -10000) {
                                    q3 = e.getX();
                                    q4 = e.getY();
                                } else {
                                    q1 = e.getX();
                                    q2 = e.getY();
                                }
                            }
                        } else {
                            if (shapeType == 33) {
                                // Implementa curva cúbica (curveTo)
                                if (q1 != -10000 && q2 != -10000) {
                                    gp.quadTo(q1, q2, e.getX(), e.getY());
                                    g2.draw(gp);
                                    q1 = -10000;
                                    q2 = -10000;
                                } else {
                                    q1 = e.getX();
                                    q2 = e.getY();
                                }

                            } else {

                                if (shapeType == 34) {
                                    gp.closePath();
                                    coloredShapes.add(new ColoredShape(gp, border, stroke, paint, al, thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex));
                                    gp = null;
                                    repaint();
                                }
                            }
                        }
                    }
                }

            }
        }

        for (int i = 0; i < coloredShapes.size(); i++) {
            if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                System.out.println("SIIIIII" + coloredShapes.get(i).getShape().getBounds().toString());
                temp = coloredShapes.get(i).getShape();
                //paintShape = false;
                saved = true;

                break;
            } else {
                saved = false;
            }
            //repaint();
        }

    }

    public void mousePressed(MouseEvent e) {
        points.add(e.getPoint());
        pointIndex++;
        p = null;

        for (int i = 0; i < coloredShapes.size(); i++) {
            if (coloredShapes.get(i).getShape().contains(e.getPoint())) {
                indexShape = i;

                System.out.println("Figura detectada");
                break;
            } else {
                indexShape = -1;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        Graphics2D g = (Graphics2D) getGraphics();
        try {
            Point p1 = (Point) (points.get(pointIndex - 1));
            p = e.getPoint();
            g.setComposite(al);
            g.setColor(border);
            stroke = new BasicStroke(thickness, cap, join, miterLimit,
                    dashArray, dashPhase);
            AffineTransform tr = new AffineTransform();
            Shape s = null;

            switch (shapeType) {
                case BORRAR:
                    points.clear();
                    pointIndex = 0;
                    p = null;
                    break;

                case LAPIZ:
                    if (points.size() > 1) {
                        s = createShapeFromPoints(points);
                        //shapes.add(shape);
                    }
                    //points.clear();
                    repaint();
                    break;
                case RECTANGLE:
                    s = new Rectangle(p1.x, p1.y, p.x - p1.x, p.y - p1.y);

                    break;
                case ROUNDRECTANGLE2D:
                    s = new RoundRectangle2D.Float(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 10, 10);
                    break;
                case ELLIPSE2D:
                    s = new Ellipse2D.Float(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case ARC2D:
                    s = new Arc2D.Float(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 30, 120, Arc2D.OPEN);
                    break;
                case LINE2D:
                    s = new Line2D.Float(p1.x, p1.y, p.x, p.y);
                    break;
                case QUADCURVE2D:
                    if (pointIndex > 1) {
                        Point p2 = (Point) points.get(0);
                        s = new QuadCurve2D.Float(p2.x, p2.y, p1.x, p1.y, p.x, p.y);
                    }
                    break;
                case CUBICCURVE2D:
                    if (pointIndex > 2) {
                        Point p2 = (Point) points.get(pointIndex - 2);
                        Point p3 = (Point) points.get(pointIndex - 3);
                        s = new CubicCurve2D.Float(p3.x, p3.y, p2.x, p2.y, p1.x, p1.y, p.x, p.y);
                    }
                    break;
                case POLYGON:
                    if (e.isShiftDown()) {
                        s = new Polygon();
                        for (int i = 0; i < pointIndex; i++) {
                            ((Polygon) s).addPoint(((Point) points.get(i)).x, ((Point) points.get(i)).y);
                        }
                        ((Polygon) s).addPoint(p.x, p.y);
                    }
                    break;
                case TRANSLATION:
                    if (trans == true) {
                        tr.setToTranslation(-p1.x + p.x, -p1.y + p.y);
                        coloredShapes.get(indexShape).setShape(tr.createTransformedShape(coloredShapes.get(indexShape).getShape()));
                        points.clear();
                        pointIndex = 0;
                        p = null;
                        repaint();

                    }
                    break;
                case ROTATION:
                    if (trans == true) {
                        double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                        double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                        double a = Math.atan2(p.getY() - y0, p.getX() - x0);
                        tr.setToRotation(a, x0, y0);
                        coloredShapes.get(indexShape).setShape(tr.createTransformedShape(coloredShapes.get(indexShape).getShape()));
                        repaint();
                        points.clear();
                        pointIndex = 0;
                        p = null;
                    }
                    break;
                case SCALING:
                    if (trans == true) {
                        double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                        double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                        double scaleX = 1 + (p.getX() - x0) / x0;
                        double scaleY = 1 + (p.getY() - y0) / y0;
                        tr.translate(x0, y0);
                        tr.scale(scaleX, scaleY);
                        tr.translate(-x0, -y0);
                        coloredShapes.get(indexShape).setShape(tr.createTransformedShape(coloredShapes.get(indexShape).getShape()));
                        points.clear();
                        pointIndex = 0;
                        p = null;
                        repaint();
                    }
                    break;
                case REFLECTION:
                    if (trans == true) {
                        double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                        double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                        tr.translate(x0, y0);
                        tr.scale(-1, 1);
                        tr.translate(-x0, -y0);
                        coloredShapes.get(indexShape).setShape(tr.createTransformedShape(coloredShapes.get(indexShape).getShape()));
                        points.clear();
                        pointIndex = 0;
                        p = null;
                        repaint();
                    }
                    break;
                case SHEARING:
                    if (trans == true) {
                        double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                        double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                        double shearFactor = (p.getX() - x0) / y0;
                        tr.translate(x0, y0);
                        tr.shear(shearFactor, 0);
                        tr.translate(-x0, -y0);
                        coloredShapes.get(indexShape).setShape(tr.createTransformedShape(coloredShapes.get(indexShape).getShape()));
                        points.clear();
                        pointIndex = 0;
                        p = null;
                        repaint();
                    }
                    break;
                case OR:
                    System.out.println("Entro");

                    ArrayList ar = new ArrayList<>();
                    Rectangle2D tem = new Rectangle(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    Area a = new Area();
                    Vector<ColoredShape> tempColorShapes = new Vector<>();
                    for (int i = 0; i < coloredShapes.size(); i++) {
                        if (coloredShapes.get(i).getShape().intersects(tem)) {
                            System.out.println("Siii");
                            tempColorShapes.add(coloredShapes.get(i));
                            ar.add(i);
                        }

                    }

                    if (nueva == false) {
                        for (int j = 0; j < tempColorShapes.size(); j++) {
                            for (int k = 0; k < coloredShapes.size(); k++) {
                                if (tempColorShapes.get(j) == coloredShapes.get(k)) {
                                    coloredShapes.remove(k);
                                    break;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < tempColorShapes.size(); i++) {
                        //coloredShapes.remove(tempColorShapes.get(i));
                        a.add(new Area(tempColorShapes.get(i).getShape()));

                    }
                    coloredShapes.add(new ColoredShape(a, border, stroke, paint, AlphaComposite.getInstance(AlphaComposite.SRC_OVER, valAlph), thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex));
                    repaint();
                    System.out.println(coloredShapes.size());

                    break;

                case AND:
                    System.out.println("Entro");
                    Rectangle2D tem2 = new Rectangle(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    Area a2 = new Area();
                    Area a1;
                    Vector<ColoredShape> tempColorShapes2 = new Vector<>();
                    for (int i = 0; i < coloredShapes.size(); i++) {
                        if (coloredShapes.get(i).getShape().intersects(tem2)) {
                            System.out.println("Siii");
                            tempColorShapes2.add(coloredShapes.get(i));
                        }
                    }

                    if (nueva == false) {
                        for (int j = 0; j < tempColorShapes2.size(); j++) {
                            for (int k = 0; k < coloredShapes.size(); k++) {
                                if (tempColorShapes2.get(j) == coloredShapes.get(k)) {
                                    coloredShapes.remove(k);
                                    break;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < tempColorShapes2.size(); i++) {
                        a2 = new Area(tempColorShapes2.get(i).getShape());
                        for (int j = i + 1; j < tempColorShapes2.size(); j++) {
                            a1 = new Area(tempColorShapes2.get(j).getShape());
                            a1.intersect(a2);
                            if (!a1.isEmpty()) {
                                coloredShapes.add(new ColoredShape(a1, border, stroke, paint, AlphaComposite.getInstance(AlphaComposite.SRC_OVER, valAlph), thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex));
                            }
                        }
                    }
                    System.out.println(coloredShapes.size());
                    repaint();
                    break;

                case NOT:
                    System.out.println("Entro");
                    Rectangle2D tem3 = new Rectangle(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    Area a4 = new Area();
                    Area a3;
                    Vector<ColoredShape> tempColorShapes3 = new Vector<>();
                    for (int i = 0; i < coloredShapes.size(); i++) {
                        if (coloredShapes.get(i).getShape().intersects(tem3)) {
                            System.out.println("Siii");
                            tempColorShapes3.add(coloredShapes.get(i));
                        }
                    }

                    if (nueva == false) {
                        for (int j = 0; j < tempColorShapes3.size(); j++) {
                            for (int k = 0; k < coloredShapes.size(); k++) {
                                if (tempColorShapes3.get(j) == coloredShapes.get(k)) {
                                    coloredShapes.remove(k);
                                    break;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < tempColorShapes3.size(); i++) {
                        a4 = new Area(tempColorShapes3.get(i).getShape());
                        for (int j = i + 1; j < tempColorShapes3.size(); j++) {
                            a3 = new Area(tempColorShapes3.get(j).getShape());
                            a3.subtract(a4);
                            if (!a3.isEmpty()) {
                                coloredShapes.add(new ColoredShape(a3, border, stroke, paint, AlphaComposite.getInstance(AlphaComposite.SRC_OVER, valAlph), thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex));
                            }
                        }
                    }
                    repaint();
                    System.out.println(coloredShapes.size());
                    break;

                case XOR:
                    System.out.println("Entro");
                    Rectangle2D tem4 = new Rectangle(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    Area a6 = new Area();
                    Area a5;
                    Vector<ColoredShape> tempColorShapes4 = new Vector<>();
                    for (int i = 0; i < coloredShapes.size(); i++) {
                        if (coloredShapes.get(i).getShape().intersects(tem4)) {
                            System.out.println("Siii");
                            tempColorShapes4.add(coloredShapes.get(i));
                        }
                    }

                    if (nueva == false) {
                        for (int j = 0; j < tempColorShapes4.size(); j++) {
                            for (int k = 0; k < coloredShapes.size(); k++) {
                                if (tempColorShapes4.get(j) == coloredShapes.get(k)) {
                                    coloredShapes.remove(k);
                                    break;
                                }
                            }
                        }
                    }

                    for (int i = 0; i < tempColorShapes4.size(); i++) {
                        a6 = new Area(tempColorShapes4.get(i).getShape());
                        for (int j = i + 1; j < tempColorShapes4.size(); j++) {
                            a5 = new Area(tempColorShapes4.get(j).getShape());
                            a5.exclusiveOr(a6);
                            if (!a5.isEmpty()) {
                                coloredShapes.add(new ColoredShape(a5, border, stroke, paint, AlphaComposite.getInstance(AlphaComposite.SRC_OVER, valAlph), thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex));
                            }
                        }
                    }
                    repaint();
                    System.out.println(coloredShapes.size());
                    break;

                case TRIANGULO:
                    s = new Triangulo(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case ROMBO:
                    s = new Rombo(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case HEXAGONO:
                    s = new Hexagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case PENTAGONO:
                    s = new Pentagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case TRAPECIO:
                    s = new Trapecio(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case SEMICIRCULO:
                    s = new Semicirculo(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case FLECHA:
                    s = new Flecha(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case CORONA:
                    s = new Corona(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case ESTRELLA:
                    s = new Estrella(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case U:
                    s = new U(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case SAVED:
                    s = temp;
                    break;

            }
            if (s != null) {
                ColoredShape coloredShape = new ColoredShape(s, border, stroke, paint, al, thickness, dashArray, dashPhase, cap, join, miterLimit, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bimage, x_tex, y_tex, width_tex, height_tex);
                if (coloredShape.getShape().getBounds() != new Rectangle(0, 0)) {
                    coloredShapes.add(coloredShape);
                }
                points.clear();
                pointIndex = 0;
                p = null;
                repaint();
                System.out.println(coloredShapes.size());
            } else {

            }
        } catch (Exception ex) {

        }
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        Graphics2D g = (Graphics2D) getGraphics();
        try {

            g.setComposite(al);
            g.setColor(border);
            stroke = new BasicStroke(thickness, cap, join, miterLimit,
                    dashArray, dashPhase);
            g.setStroke(stroke);
            g.setPaint(paint);
            g.setXORMode(Color.WHITE);
            Point p1 = (Point) points.get(pointIndex - 1);
            AffineTransform tr = new AffineTransform();
            switch (shapeType) {
                case BORRAR:
                    int eraseSize = 10; // Tamaño del borrador
                    for (int i = 0; i < coloredShapes.size(); i++) {
                        Rectangle eraseArea = new Rectangle(e.getX() - eraseSize / 2, e.getY() - eraseSize / 2, eraseSize, eraseSize);
                        if (coloredShapes.get(i).getShape().intersects(eraseArea)) {
                            coloredShapes.remove(i);
                            i--;
                        }
                    }
                    repaint();
                    break;
                case LAPIZ:
                    points.add(e.getPoint());
                    g.draw(createShapeFromPoints(points));
                    repaint();
                    break;
                case RECTANGLE:
                    if (p != null) {
                        g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();
                    g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;
                case ROUNDRECTANGLE2D:
                    if (p != null) {
                        g.drawRoundRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 10, 10);
                    }
                    p = e.getPoint();
                    g.drawRoundRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 10, 10);
                    break;
                case ELLIPSE2D:
                    if (p != null) {
                        g.drawOval(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();
                    g.drawOval(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    break;

                case ARC2D:
                    if (p != null) {
                        g.drawArc(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 30, 120);
                    }
                    p = e.getPoint();
                    g.drawArc(p1.x, p1.y, p.x - p1.x, p.y - p1.y, 30, 120);
                    break;
                case LINE2D:
                case POLYGON:
                    if (p != null) {
                        g.drawLine(p1.x, p1.y, p.x, p.y);
                    }
                    p = e.getPoint();
                    g.drawLine(p1.x, p1.y, p.x, p.y);
                    break;
                case QUADCURVE2D:
                    if (pointIndex == 1) {
                        if (p != null) {
                            g.drawLine(p1.x, p1.y, p.x, p.y);
                        }
                        p = e.getPoint();
                        g.drawLine(p1.x, p1.y, p.x, p.y);
                    } else {
                        Point p2 = (Point) points.get(pointIndex - 2);
                        if (p != null) {
                            g.draw(partialShape);
                        }
                        p = e.getPoint();
                        partialShape = new QuadCurve2D.Float(p2.x, p2.y, p1.x, p1.y, p.x, p.y);
                        g.draw(partialShape);
                    }
                    break;
                case CUBICCURVE2D:
                    if (pointIndex == 1) {
                        if (p != null) {
                            g.drawLine(p1.x, p1.y, p.x, p.y);
                        }
                        p = e.getPoint();
                        g.drawLine(p1.x, p1.y, p.x, p.y);
                    } else if (pointIndex == 2) {
                        Point p2 = (Point) points.get(pointIndex - 2);
                        if (p != null) {
                            g.draw(partialShape);
                        }
                        p = e.getPoint();
                        partialShape = new QuadCurve2D.Float(p2.x, p2.y, p1.x, p1.y, p.x, p.y);
                        g.draw(partialShape);
                    } else {
                        Point p2 = (Point) points.get(pointIndex - 2);
                        Point p3 = (Point) points.get(pointIndex - 3);
                        if (p != null) {
                            g.draw(partialShape);
                        }
                        p = e.getPoint();
                        partialShape = new CubicCurve2D.Float(p3.x, p3.y, p2.x, p2.y, p1.x, p1.y, p.x, p.y);
                        g.draw(partialShape);
                    }
                    break;
                case TRANSLATION:
                    if (trans == true) {

                        if (indexShape != -1) {
                            p = e.getPoint();
                            g.setXORMode(Color.white);

                            tr.setToTranslation(-p1.x + p.x, -p1.y + p.y);
                            if (partialShape != null) {
                                g.draw(partialShape);
                            }

                            partialShape = tr.createTransformedShape(coloredShapes.get(indexShape).getShape());
                            g.draw(partialShape);
                        }
                    }
                    break;
                case ROTATION:
                    if (trans == true) {
                        if (indexShape != -1) {
                            p = e.getPoint();
                            g.setXORMode(Color.white);
                            double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                            double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                            double a = Math.atan2(p.getY() - y0, p.getX() - x0);

                            tr.setToRotation(a, x0, y0);
                            if (partialShape != null) {
                                g.draw(partialShape);
                            }
                            partialShape = tr.createTransformedShape(coloredShapes.get(indexShape).getShape());
                            g.draw(partialShape);
                        }
                    }
                    break;
                case SCALING:
                    if (trans == true) {
                        if (indexShape != -1) {
                            p = e.getPoint();
                            g.setXORMode(Color.white);
                            double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                            double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                            if (partialShape != null) {
                                g.draw(partialShape);
                            }
                            double scaleX = 1 + (p.getX() - x0) / x0;
                            double scaleY = 1 + (p.getY() - y0) / y0;
                            tr.translate(x0, y0);
                            tr.scale(scaleX, scaleY);
                            tr.translate(-x0, -y0);

                            partialShape = tr.createTransformedShape(coloredShapes.get(indexShape).getShape());
                            g.draw(partialShape);
                        }
                    }
                    break;
                case REFLECTION:
                    if (trans == true) {
                        if (indexShape != -1) {
                            g.setXORMode(Color.white);
                            double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                            double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();
                            tr.translate(x0, y0);
                            tr.scale(-1, 1);
                            tr.translate(-x0, -y0);
                            if (partialShape != null) {
                                g.draw(partialShape);
                            }
                            partialShape = tr.createTransformedShape(coloredShapes.get(indexShape).getShape());
                            g.draw(partialShape);
                            repaint();
                        }
                    }
                    break;
                case SHEARING:
                    if (trans == true) {
                        if (indexShape != -1) {
                            p = e.getPoint();
                            g.setXORMode(Color.white);
                            double y0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterY();
                            double x0 = coloredShapes.get(indexShape).getShape().getBounds().getCenterX();

                            double shearFactor = (p.getX() - x0) / y0;

                            tr.translate(x0, y0); // Trasladar al centro de la figura
                            tr.shear(shearFactor, 0); // Cizallamiento en la dirección x basado en la posición del ratón
                            tr.translate(-x0, -y0);

                            if (partialShape != null) {
                                g.draw(partialShape);
                            }
                            partialShape = tr.createTransformedShape(coloredShapes.get(indexShape).getShape());
                            g.draw(partialShape);
                            repaint();
                        }
                    }
                    break;
                case OR:

                    if (p != null) {
                        g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();

                    g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    repaint();
                    break;
                case AND:

                    if (p != null) {
                        g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();

                    g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    repaint();
                    break;
                case NOT:

                    if (p != null) {
                        g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();

                    g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    repaint();
                    break;
                case XOR:

                    if (p != null) {
                        g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    }
                    p = e.getPoint();

                    g.drawRect(p1.x, p1.y, p.x - p1.x, p.y - p1.y);
                    repaint();
                    break;
                case TRIANGULO:
                    if (p != null) {
                        g.draw(new Triangulo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Triangulo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case ROMBO:
                    if (p != null) {
                        g.draw(new Rombo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Rombo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case HEXAGONO:

                    if (p != null) {
                        g.draw(new Hexagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Hexagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case PENTAGONO:

                    if (p != null) {
                        g.draw(new Pentagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Pentagono(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case TRAPECIO:

                    if (p != null) {
                        g.draw(new Trapecio(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Trapecio(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case SEMICIRCULO:
                    if (p != null) {
                        g.draw(new Semicirculo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Semicirculo(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case FLECHA:
                    if (p != null) {
                        g.draw(new Flecha(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Flecha(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case CORONA:
                    if (p != null) {
                        g.draw(new Corona(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Corona(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case ESTRELLA:
                    if (p != null) {
                        g.draw(new Estrella(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new Estrella(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case U:
                    if (p != null) {
                        g.draw(new U(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    }
                    p = e.getPoint();
                    g.draw(new U(p1.x, p1.y, p.x - p1.x, p.y - p1.y));
                    break;
                case SAVED:

                    if (p != null) {
                        g.draw(temp);
                    }

                    p = e.getPoint();
                    double scaleX = p.x / temp.getBounds().getWidth();
                    double scaleY = p.y / temp.getBounds().getHeight();
                    AffineTransform transform = AffineTransform.getScaleInstance(scaleX, scaleY);
                    temp =transform.createTransformedShape(temp);
                    g.draw(temp);
                    break;

            }
        } catch (Exception ex) {

        }
    }

    public void mouseMoved(MouseEvent e) {

    }

    private Shape createShapeFromPoints(Vector<Point> points) {
        if (points.size() < 2) {
            return null;
        }
        getGraphics().setColor(Color.WHITE);
        Path2D path = new Path2D.Double();
        path.moveTo(points.get(0).getX(), points.get(0).getY());
        for (int i = 1; i < points.size(); i++) {
            Point p = points.get(i);
            path.lineTo(p.getX(), p.getY());
        }
        return path;
    }

}

class ColoredShape implements Serializable {

    public URL getImagen() {
        return imagen;
    }

    public void setImagen(URL imagen) {
        this.imagen = imagen;
    }

    public int getXtextu() {
        return xtextu;
    }

    public void setXtextu(int xtextu) {
        this.xtextu = xtextu;
    }

    public int getYtextu() {
        return ytextu;
    }

    public void setYtextu(int ytextu) {
        this.ytextu = ytextu;
    }

    public int getWidthtex() {
        return widthtex;
    }

    public void setWidthtex(int widthtex) {
        this.widthtex = widthtex;
    }

    public int getHeighttext() {
        return heighttext;
    }

    public void setHeighttext(int heighttext) {
        this.heighttext = heighttext;
    }

    public Color getColorg1() {
        return colorg1;
    }

    public void setColorg1(Color colorg1) {
        this.colorg1 = colorg1;
    }

    public Color getColorg2() {
        return colorg2;
    }

    public void setColorg2(Color colorg2) {
        this.colorg2 = colorg2;
    }

    public int getXcolorg1() {
        return xcolorg1;
    }

    public void setXcolorg1(int xcolorg1) {
        this.xcolorg1 = xcolorg1;
    }

    public int getYcolorg1() {
        return ycolorg1;
    }

    public void setYcolorg1(int ycolorg1) {
        this.ycolorg1 = ycolorg1;
    }

    public int getXcolorg2() {
        return xcolorg2;
    }

    public void setXcolorg2(int xcolorg2) {
        this.xcolorg2 = xcolorg2;
    }

    public int getYcolorg2() {
        return ycolorg2;
    }

    public void setYcolorg2(int ycolorg2) {
        this.ycolorg2 = ycolorg2;
    }

    public boolean isCyclic() {
        return cyclic;
    }

    public void setCyclic(boolean cyclic) {
        this.cyclic = cyclic;
    }

    public String getTypePaint() {
        return typePaint;
    }

    public void setTypePaint(String typePaint) {
        this.typePaint = typePaint;
    }

    public int getMiterLimit() {
        return miterLimit;
    }

    public void setMiterLimit(int miterLimit) {
        this.miterLimit = miterLimit;
    }

    public int getJoin() {
        return join;
    }

    public void setJoin(int join) {
        this.join = join;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public float getDashPhase() {
        return dashPhase;
    }

    public void setDashPhase(float dashPhase) {
        this.dashPhase = dashPhase;
    }

    public float[] getDashArray() {
        return dashArray;
    }

    public void setDashArray(float[] dashArray) {
        this.dashArray = dashArray;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public AlphaComposite getAlpha() {
        return alpha;
    }

    public void setAlpha(AlphaComposite alpha) {
        this.alpha = alpha;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public Stroke getStroke() {
        return stroke;
    }

    private Shape shape;
    private Color color;
    private Stroke stroke;
    private Paint paint;
    private AlphaComposite alpha;
    private int thickness;
    private float[] dashArray;
    private float dashPhase;
    private int cap;
    private int join;
    private int miterLimit;

    private Color colorg1;
    private Color colorg2;
    private int xcolorg1;
    private int ycolorg1;
    private int xcolorg2;
    private int ycolorg2;
    private boolean cyclic;
    private String typePaint;

    private URL imagen;
    private int xtextu;
    private int ytextu;
    private int widthtex;
    private int heighttext;

    public ColoredShape(Shape shape, Color color, Stroke stroke, Paint paint, AlphaComposite alpha, int thickness, float[] dashArray, float dashPhase, int cap, int join, int miterLimit,
            Color colorg1,
            Color colorg2,
            int xcolorg1,
            int ycolorg1,
            int xcolorg2,
            int ycolorg2,
            boolean cyclic,
            String typePaint,
            URL imagen,
            int xtextu,
            int ytextu,
            int widthtex,
            int heighttext
    ) {
        this.shape = shape;
        this.color = color;
        this.stroke = stroke;
        this.paint = paint;
        this.alpha = alpha;
        this.thickness = thickness;
        this.dashArray = dashArray;
        this.dashPhase = dashPhase;
        this.cap = cap;
        this.join = join;
        this.miterLimit = miterLimit;
        this.colorg1 = colorg1;
        this.colorg2 = colorg2;
        this.xcolorg1 = xcolorg1;
        this.ycolorg1 = ycolorg1;
        this.xcolorg2 = xcolorg2;
        this.ycolorg2 = ycolorg2;
        this.cyclic = cyclic;
        this.typePaint = typePaint;
        this.imagen = imagen;
        this.xtextu = xtextu;
        this.ytextu = ytextu;
        this.widthtex = widthtex;
        this.heighttext = heighttext;

    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public Paint getPaint() {
        return paint;
    }

    public ColoredShape() {
        // Constructor sin argumentos
    }

}
