/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paint2d_saulgarcia;

import Shapes.Created;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author NewUser
 */
public class DrawPanel extends JFrame {

    String fll = null;
    boolean remove = false;
    int x;
    int y;
    int ind;

    int long1 = 0;
    int long2 = 0;
    int esp1 = 0;
    int esp2 = 0;

    int x1g = 0;
    int y1g = 0;
    int x2g = 0;
    int y2g = 0;

    int dash = 0;

    int xt = 0;
    int yt = 0;

    int height = 0;
    int weight = 0;

    int sli = 1;

    Font f = new Font("Franklin Gothic Demi Cond", Font.PLAIN, 16);
    Vector<Created> newShapes = new Vector<>();

    public DrawPanel() {
        initComponents();
        initMouse();
        cargarShapes();
        addButtons();
        loadShapes();
        UIManager.put("control", Color.WHITE);
        UIManager.put("OptionPane.messageFont", f);
        UIManager.put("OptionPane.messageForeground", Color.white);
        UIManager.put("OptionPane.messageIconImage", null);
        this.setTitle("Nuevo Archivo");
    }

    public void initMouse() {
        MouseMotionListener ml = new MouseAdapter() {
            public void mouseMoved(MouseEvent ev) {
                x = ev.getX();
                y = ev.getY();
            }
        };
        addMouseMotionListener(ml);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel1 = new Panel2D();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jPanel8 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton56 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1580, 820));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Color.png"))); // NOI18N
        jButton11.setToolTipText("Color");
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton11);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Thickness.png"))); // NOI18N
        jButton12.setToolTipText("Grosor");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton12);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(360, 20, 55, 90);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 184, 1580, 640);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Pencil.png"))); // NOI18N
        jButton9.setToolTipText("Lápiz");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Eraser.png"))); // NOI18N
        jButton10.setToolTipText("Goma");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 20, 55, 90);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/DashArray.png"))); // NOI18N
        jButton13.setToolTipText("Dash Array");
        jButton13.setBorder(null);
        jButton13.setContentAreaFilled(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/CapButt.png"))); // NOI18N
        jButton14.setToolTipText("Cap Butt");
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/CapRound.png"))); // NOI18N
        jButton15.setToolTipText("Cap Round");
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton15);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/CapSquare.png"))); // NOI18N
        jButton16.setToolTipText("Cap Square");
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton16);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/DashPhase.png"))); // NOI18N
        jButton17.setToolTipText("Dash Phase");
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton17);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/JoinRound.png"))); // NOI18N
        jButton18.setToolTipText("Join Round");
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton18);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/JoinBevel.png"))); // NOI18N
        jButton19.setToolTipText("Join Bevel");
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton19);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/JoinMiter.png"))); // NOI18N
        jButton20.setToolTipText("Join Miter");
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(415, 20, 180, 90);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/PaintGradiant.png"))); // NOI18N
        jButton21.setToolTipText("Relleno Gradiente");
        jButton21.setBorder(null);
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.setFocusPainted(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton21);

        jButton22.setBackground(new java.awt.Color(255, 153, 153));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/ColorGradiant.png"))); // NOI18N
        jButton22.setToolTipText("Color Gradiente 1");
        jButton22.setBorderPainted(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton22);

        jButton23.setBackground(new java.awt.Color(204, 153, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/ColorGradiant.png"))); // NOI18N
        jButton23.setToolTipText("Color Gradiente 2");
        jButton23.setBorderPainted(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton23);

        jButton25.setBackground(new java.awt.Color(204, 51, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/PaintSolid.png"))); // NOI18N
        jButton25.setToolTipText("Relleno Solido");
        jButton25.setBorderPainted(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton25);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/PaintImage.png"))); // NOI18N
        jButton26.setToolTipText("Relleno con Textura");
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/PaintRemove.png"))); // NOI18N
        jButton27.setToolTipText("Remover Relleno");
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton27.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton27);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(595, 20, 125, 90);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Selected.png"))); // NOI18N
        jButton24.setToolTipText("Deseleccionar");
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton24);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Selected2.png"))); // NOI18N
        jButton28.setToolTipText("Seleccionar");
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton28);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(1020, 20, 55, 90);

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinimum(1);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("Alpha");
        jSlider1.setValue(100);
        jSlider1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1);
        jSlider1.setBounds(985, 20, 35, 90);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Translate.png"))); // NOI18N
        jButton29.setToolTipText("Trasladar");
        jButton29.setBorder(null);
        jButton29.setContentAreaFilled(false);
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.setFocusPainted(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton29);

        jButton30.setBackground(new java.awt.Color(255, 153, 153));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Rotation.png"))); // NOI18N
        jButton30.setToolTipText("Rotar");
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton30);

        jButton31.setBackground(new java.awt.Color(204, 153, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Shearing.png"))); // NOI18N
        jButton31.setToolTipText("Cizallar");
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton31);

        jButton32.setBackground(new java.awt.Color(204, 51, 255));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Scaling.png"))); // NOI18N
        jButton32.setToolTipText("Escalar");
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton32);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Reflection.png"))); // NOI18N
        jButton33.setToolTipText("Reflexión");
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton33);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(1075, 20, 125, 90);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Clear.png"))); // NOI18N
        jButton34.setToolTipText("Clear");
        jButton34.setBorder(null);
        jButton34.setContentAreaFilled(false);
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.setFocusPainted(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton34);

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Src.png"))); // NOI18N
        jButton35.setToolTipText("Src");
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton35);

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Dst.png"))); // NOI18N
        jButton36.setToolTipText("Dst");
        jButton36.setBorderPainted(false);
        jButton36.setContentAreaFilled(false);
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton36.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton36);

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Src-over.png"))); // NOI18N
        jButton37.setToolTipText("Src Over");
        jButton37.setBorderPainted(false);
        jButton37.setContentAreaFilled(false);
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton37);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Dst-over.png"))); // NOI18N
        jButton38.setToolTipText("Dst Over");
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton38);

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Src-in.png"))); // NOI18N
        jButton39.setToolTipText("Src In");
        jButton39.setBorderPainted(false);
        jButton39.setContentAreaFilled(false);
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton39);

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Dst-in.png"))); // NOI18N
        jButton40.setToolTipText("Dst In");
        jButton40.setBorderPainted(false);
        jButton40.setContentAreaFilled(false);
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton40);

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Src-out.png"))); // NOI18N
        jButton41.setToolTipText("Src Out");
        jButton41.setBorderPainted(false);
        jButton41.setContentAreaFilled(false);
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton41);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Dst-out.png"))); // NOI18N
        jButton42.setToolTipText("Dst Out");
        jButton42.setBorderPainted(false);
        jButton42.setContentAreaFilled(false);
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton42);

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Src-atop.png"))); // NOI18N
        jButton43.setToolTipText("Src Atop");
        jButton43.setBorderPainted(false);
        jButton43.setContentAreaFilled(false);
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton43);

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Dst-atop.png"))); // NOI18N
        jButton44.setToolTipText("Dst Atop");
        jButton44.setBorderPainted(false);
        jButton44.setContentAreaFilled(false);
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton44);

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Xor.png"))); // NOI18N
        jButton45.setToolTipText("Xor");
        jButton45.setBorderPainted(false);
        jButton45.setContentAreaFilled(false);
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton45);

        getContentPane().add(jPanel9);
        jPanel9.setBounds(720, 20, 265, 90);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton47.setBackground(new java.awt.Color(255, 153, 153));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/OR.png"))); // NOI18N
        jButton47.setToolTipText("Or");
        jButton47.setBorderPainted(false);
        jButton47.setContentAreaFilled(false);
        jButton47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton47.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton47);

        jButton48.setBackground(new java.awt.Color(204, 153, 255));
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/AND.png"))); // NOI18N
        jButton48.setToolTipText("And");
        jButton48.setBorderPainted(false);
        jButton48.setContentAreaFilled(false);
        jButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton48.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton48);

        jButton49.setBackground(new java.awt.Color(204, 51, 255));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/NOT.png"))); // NOI18N
        jButton49.setToolTipText("Not");
        jButton49.setBorderPainted(false);
        jButton49.setContentAreaFilled(false);
        jButton49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton49.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton49);

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/XOR-A.png"))); // NOI18N
        jButton50.setToolTipText("Xor");
        jButton50.setBorderPainted(false);
        jButton50.setContentAreaFilled(false);
        jButton50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton50.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton50);

        jCheckBox1.setText("Nueva");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBox1);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(1200, 20, 170, 90);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Rectangle.png"))); // NOI18N
        jButton1.setToolTipText("Rectangulo");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/RoundedRectangle.png"))); // NOI18N
        jButton2.setToolTipText("Rectangulo Redondeado");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Elipse.png"))); // NOI18N
        jButton3.setToolTipText("Círculo");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Arc.png"))); // NOI18N
        jButton4.setToolTipText("Arco");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Line.png"))); // NOI18N
        jButton5.setToolTipText("Linea");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/QuadCurve.png"))); // NOI18N
        jButton6.setToolTipText("Curva Cuadrática");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/CubicCurve.png"))); // NOI18N
        jButton7.setToolTipText("Curva Cúbica");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Polygon.png"))); // NOI18N
        jButton8.setToolTipText("Polígono");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(55, 20, 180, 90);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/MoveTo.png"))); // NOI18N
        jButton46.setToolTipText("Move To");
        jButton46.setBorder(null);
        jButton46.setContentAreaFilled(false);
        jButton46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton46.setFocusPainted(false);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton46);

        jButton51.setBackground(new java.awt.Color(255, 153, 153));
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/LineTo.png"))); // NOI18N
        jButton51.setToolTipText("Line To");
        jButton51.setBorderPainted(false);
        jButton51.setContentAreaFilled(false);
        jButton51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton51.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton51);

        jButton52.setBackground(new java.awt.Color(204, 153, 255));
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/CurveTo.png"))); // NOI18N
        jButton52.setToolTipText("Curve To");
        jButton52.setBorderPainted(false);
        jButton52.setContentAreaFilled(false);
        jButton52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton52.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton52);

        jButton53.setBackground(new java.awt.Color(204, 51, 255));
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/QuadTo.png"))); // NOI18N
        jButton53.setToolTipText("Quad To");
        jButton53.setBorderPainted(false);
        jButton53.setContentAreaFilled(false);
        jButton53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton53.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton53);

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/ClosePath.png"))); // NOI18N
        jButton54.setToolTipText("Close Path");
        jButton54.setBorderPainted(false);
        jButton54.setContentAreaFilled(false);
        jButton54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton54.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton54);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(235, 20, 125, 90);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton56.setBackground(new java.awt.Color(204, 153, 255));
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Rombo.png"))); // NOI18N
        jButton56.setToolTipText("Rombo");
        jButton56.setBorderPainted(false);
        jButton56.setContentAreaFilled(false);
        jButton56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton56.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton56);

        jButton55.setBackground(new java.awt.Color(255, 153, 153));
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Triangulo.png"))); // NOI18N
        jButton55.setToolTipText("Triángulo");
        jButton55.setBorderPainted(false);
        jButton55.setContentAreaFilled(false);
        jButton55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton55.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton55);

        jButton57.setBackground(new java.awt.Color(204, 51, 255));
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Hexagono.png"))); // NOI18N
        jButton57.setToolTipText("Hexágono");
        jButton57.setBorderPainted(false);
        jButton57.setContentAreaFilled(false);
        jButton57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton57.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton57);

        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Pentagono.png"))); // NOI18N
        jButton58.setToolTipText("Pentágono");
        jButton58.setBorderPainted(false);
        jButton58.setContentAreaFilled(false);
        jButton58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton58.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton58);

        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Trapecio.png"))); // NOI18N
        jButton59.setToolTipText("Trapecio");
        jButton59.setBorderPainted(false);
        jButton59.setContentAreaFilled(false);
        jButton59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton59.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton59);

        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Semicirculo.png"))); // NOI18N
        jButton60.setToolTipText("Semicírculo");
        jButton60.setBorderPainted(false);
        jButton60.setContentAreaFilled(false);
        jButton60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton60.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton60);

        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Flecha.png"))); // NOI18N
        jButton61.setToolTipText("Flecha");
        jButton61.setBorderPainted(false);
        jButton61.setContentAreaFilled(false);
        jButton61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton61.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton61);

        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Corona.png"))); // NOI18N
        jButton62.setToolTipText("Corona");
        jButton62.setBorderPainted(false);
        jButton62.setContentAreaFilled(false);
        jButton62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton62.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton62);

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Estrella.png"))); // NOI18N
        jButton63.setToolTipText("Estrella");
        jButton63.setBorderPainted(false);
        jButton63.setContentAreaFilled(false);
        jButton63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton63.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton63);

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/U.png"))); // NOI18N
        jButton64.setToolTipText("U");
        jButton64.setBorderPainted(false);
        jButton64.setContentAreaFilled(false);
        jButton64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton64.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton64);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(0, 130, 410, 50);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Save.png"))); // NOI18N
        jButton65.setToolTipText("Guardar figura");
        jButton65.setBorderPainted(false);
        jButton65.setContentAreaFilled(false);
        jButton65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton65.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton65);

        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint2d_saulgarcia/iconos/Remove_1.png"))); // NOI18N
        jButton66.setToolTipText("Eliminar figura");
        jButton66.setBorderPainted(false);
        jButton66.setContentAreaFilled(false);
        jButton66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton66.setPreferredSize(new java.awt.Dimension(35, 35));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton66);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(1480, 20, 55, 90);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane2.setViewportView(jPanel15);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1370, 20, 110, 90);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operaciones booleanas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1200, 0, 170, 14);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Figuras extra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 112, 120, 14);

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Figuras básicas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 0, 80, 14);

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GeneralPath");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 0, 80, 14);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stroke");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 0, 80, 14);

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Relleno");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(620, 0, 80, 14);

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AlphaComposite");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 0, 80, 14);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Figuras creadas");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1390, 0, 80, 14);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Transformaciones");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1100, 0, 80, 14);

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setText("Guardar Como");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cargar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 1;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 0;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 2;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 3;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 4;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 5;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 6;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 7;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = -1;
        paneld.trans = false;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.areaOper = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.areaOper = false;
        paneld.shapeType = -2;
        paneld.trans = false;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.general = false;
        paneld.gp = null;
        repaint();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
// TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        Color newColor = JColorChooser.showDialog(this, "Elegir Color", p.border);
        if (newColor != null) {
            p.border = newColor;
        } else {

        }
        jButton11.setBackground(newColor);
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
        p.alfaComp = false;
        p.bor = true;
        p.paintShape = false;
        p.strok = false;
        p.areaOper = false;

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.thickness = showSliderDialog();
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        p.areaOper = false;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.dashArray = mostrarDialogoSliders();
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.areaOper = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.cap = 2;
        p.trans = false;
        p.areaOper = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.cap = 1;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.areaOper = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.cap = 0;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.areaOper = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.dashPhase = dashPhaseSlider();
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.areaOper = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.join = 1;
        p.miterLimit = 0;
        p.trans = false;
        p.areaOper = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.join = 2;
        p.miterLimit = 0;
        p.trans = false;
        p.alfaComp = false;
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.join = 0;
        p.miterLimit = 15;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.areaOper = false;
        p.paintShape = false;
        p.strok = true;
        p.general = false;
        p.shapeType = -3;
        p.gp = null;
        repaint();
        //p.paintShape = true;
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.areaOper = false;
        p.paintShape = true;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
        gradiantPaint();


    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.areaOper = false;
        p.paintShape = true;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
        Color newColor = JColorChooser.showDialog(this, "Elegir Color", p.gradiant1);
        if (newColor != null) {
            p.gradiant1 = newColor;
            GradientPaint gp = new GradientPaint(p.gradX1, p.gradY1, p.gradiant1, p.gradX2, p.gradY2, p.gradiant2, p.cyclic);
            p.paint = gp;
            p.typePaint = "Gradiante";
            jButton22.setBackground(newColor);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = true;
        p.strok = false;
        p.areaOper = false;
        p.general = false;
        p.gp = null;
        repaint();
        Color newColor = JColorChooser.showDialog(this, "Elegir Color", p.gradiant2);
        if (newColor != null) {

            p.gradiant2 = newColor;
            GradientPaint gp = new GradientPaint(p.gradX1, p.gradY1, p.gradiant1, p.gradX2, p.gradY2, p.gradiant2, p.cyclic);
            p.paint = gp;
            p.typePaint = "Gradiante";
            jButton23.setBackground(newColor);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.general = false;
        p.areaOper = false;
        p.gp = null;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = true;
        p.strok = false;
        repaint();
        Color newColor = JColorChooser.showDialog(this, "Elegir Color", p.solid);
        if (newColor != null) {
            p.solid = newColor;
            p.paint = newColor;
            p.typePaint = "Solido";
            jButton25.setBackground(newColor);
        }
        //p.paintShape = true;
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = true;
        p.strok = false;
        p.general = false;
        p.areaOper = false;
        p.gp = null;
        repaint();
        URL url;
        BufferedImage image;

        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("JPG & PNG", "JPG", "PNG");
        jf.setFileFilter(fi);

        int respuesta = jf.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            try {
                url = jf.getSelectedFile().toURL();
                image = ImageIO.read(url);

                JSlider[] sliders = new JSlider[4];

                float[] sliderValues = new float[4];

                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                JLabel jl1 = new JLabel("X: " + xt);
                JLabel jl2 = new JLabel("Y: " + yt);
                JLabel jl3 = new JLabel("Widht: " + weight);
                JLabel jl4 = new JLabel("Height: " + height);

                jl1.setFont(f);
                jl2.setFont(f);
                jl3.setFont(f);
                jl4.setFont(f);

                // Configurar los JSliders
                for (int i = 0; i < sliders.length; i++) {
                    sliders[i] = new JSlider(JSlider.HORIZONTAL, 1, 1000, 1);
                    sliders[i].setMajorTickSpacing(50);
                    sliders[i].setMinorTickSpacing(1);
                    sliders[i].setPaintTicks(true);
                    sliders[i].setPaintLabels(false);
                    sliders[i].setFont(f);
                    final int index = i;
                    sliderValues[index] = sliders[index].getValue();
                    sliders[i].addChangeListener(e -> {
                        sliderValues[index] = sliders[index].getValue();
                        switch (index) {
                            case 0:
                                xt = sliders[index].getValue();
                                jl1.setText("X: " + xt);
                                break;
                            case 1:
                                yt = sliders[index].getValue();
                                jl2.setText("Y: " + yt);
                                break;
                            case 2:
                                weight = sliders[index].getValue();
                                jl3.setText("Width: " + weight);
                                break;
                            case 3:
                                height = sliders[index].getValue();
                                jl4.setText("Height: " + height);
                                break;
                        }
                    });
                    switch (i) {
                        case 0:
                            sliders[i].setValue(xt);

                            panel.add(jl1);
                            break;
                        case 1:
                            sliders[i].setValue(yt);
                            panel.add(jl2);
                            break;
                        case 2:
                            sliders[i].setValue(weight);
                            panel.add(jl3);
                            break;
                        case 3:
                            sliders[i].setValue(height);
                            panel.add(jl4);
                            break;
                    }
                    panel.add(sliders[i]);
                }

                int result = JOptionPane.showOptionDialog(
                        this,
                        panel,
                        "Selecciona valores",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        null);

                if (result == JOptionPane.OK_OPTION) {
                    p.x_tex = sliders[0].getValue();
                    p.y_tex = sliders[1].getValue();
                    p.width_tex = sliders[2].getValue();
                    p.height_tex = sliders[3].getValue();
                    p.bimage = url;
                    p.typePaint = "Texture";
                    TexturePaint tp = new TexturePaint(image, new Rectangle2D.Double(p.x_tex, p.y_tex, p.width_tex, p.height_tex));
                    p.paint = tp;
                } else {
                    TexturePaint tp = new TexturePaint(image, new Rectangle2D.Double(p.x_tex, p.y_tex, p.width_tex, p.height_tex));
                    p.paint = tp;
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:

        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.paint = null;
        p.areaOper = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = true;
        p.strok = false;
        p.general = false;
        p.gp = null;
        p.typePaint = "Ninguno";
        repaint();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.paintShape = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.strok = false;
        p.areaOper = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 10;
        p.trans = true;
        p.general = false;
        p.areaOper = false;
        p.bor = false;
        p.alfaComp = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 11;
        p.trans = true;
        p.general = false;
        p.areaOper = false;
        p.bor = false;
        p.alfaComp = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 12;
        p.trans = true;
        p.general = false;
        p.areaOper = false;
        p.bor = false;
        p.alfaComp = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 13;
        p.areaOper = false;
        p.bor = false;
        p.alfaComp = false;
        p.paintShape = false;
        p.strok = false;
        p.trans = true;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 14;
        p.trans = true;
        p.general = false;
        p.areaOper = false;
        p.bor = false;
        p.alfaComp = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.CLEAR, p.valAlph);

        p.alfaComp = true;
        p.trans = false;
        p.general = false;

        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.SRC, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.DST, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.DST_OVER, p.valAlph);

        p.alfaComp = true;
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.SRC_IN, p.valAlph);
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.DST_IN, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.SRC_OUT, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.DST_OVER, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.DST_ATOP, p.valAlph);
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.alfaComp = true;
        p.trans = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.al = AlphaComposite.getInstance(AlphaComposite.XOR, p.valAlph);
        p.alfaComp = true;
        p.trans = false;
        p.areaOper = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.valAlph = jSlider1.getValue() / 100.0f;
        p.al = AlphaComposite.getInstance(p.al.getRule(), p.valAlph);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 20;
        p.areaOper = true;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 21;
        p.areaOper = true;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 22;
        p.areaOper = true;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.shapeType = 23;
        p.areaOper = true;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = false;
        p.gp = null;
        repaint();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.areaOper = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = true;
        p.shapeType = 30;

    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.areaOper = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = true;
        p.shapeType = 31;
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.areaOper = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = true;
        p.shapeType = 32;
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.areaOper = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = true;
        p.shapeType = 33;
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        p.areaOper = false;
        p.trans = false;
        p.alfaComp = false;
        p.bor = false;
        p.paintShape = false;
        p.strok = false;
        p.general = true;
        p.shapeType = 34;

    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 40;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 41;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 42;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 43;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 44;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 45;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 46;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 47;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 48;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        paneld.shapeType = 49;
        paneld.alfaComp = false;
        paneld.bor = false;
        paneld.paintShape = false;
        paneld.strok = false;
        paneld.al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        paneld.general = false;
        paneld.gp = null;
        paneld.repaint();
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos binarios (*.dat)", "dat"));
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado por el usuario
            String fileName = fileChooser.getSelectedFile().toString();
            fll = fileName;
            if (!fileName.endsWith(".dat")) {
                // Añadir extensión .dat si no está presente
                fileName += ".dat";
            }

            System.out.println(paneld.coloredShapes.size() + "Si se detectan");
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                Vector types = new Vector();
                for (int i = 0; i < paneld.coloredShapes.size(); i++) {
                    AlphaComposite er = paneld.coloredShapes.get(i).getAlpha();
                    int rule = er.getRule();
                    float alf = er.getAlpha();
                    types.add(rule);
                    types.add(alf);

                    int thick = paneld.coloredShapes.get(i).getThickness();
                    types.add(thick);

                    int cap = paneld.coloredShapes.get(i).getCap();
                    types.add(cap);

                    int join = paneld.coloredShapes.get(i).getJoin();
                    types.add(join);

                    int miter = paneld.coloredShapes.get(i).getMiterLimit();
                    types.add(miter);

                    float[] array = paneld.coloredShapes.get(i).getDashArray();
                    types.add(array);

                    float dash = paneld.coloredShapes.get(i).getDashPhase();
                    types.add(dash);

                    //HAY QUE AGREGAR PATH, X, Y, WIDTH Y HEIGHT PARA GUARDAR TEXTUREPAINT, CREAR BANDERA
                    String type = paneld.coloredShapes.get(i).getTypePaint();
                    types.add(type);

                    Color color1 = paneld.coloredShapes.get(i).getColorg1();
                    types.add(color1);

                    Color color2 = paneld.coloredShapes.get(i).getColorg2();
                    types.add(color2);

                    int xg1 = paneld.coloredShapes.get(i).getXcolorg1();
                    types.add(xg1);

                    int yg1 = paneld.coloredShapes.get(i).getYcolorg1();
                    types.add(yg1);

                    int xg2 = paneld.coloredShapes.get(i).getXcolorg2();
                    types.add(xg2);

                    int yg2 = paneld.coloredShapes.get(i).getYcolorg2();
                    types.add(yg2);

                    boolean cycl = paneld.coloredShapes.get(i).isCyclic();
                    types.add(cycl);

                    URL bf = paneld.coloredShapes.get(i).getImagen();
                    types.add(bf);

                    int xtt = paneld.coloredShapes.get(i).getXtextu();
                    types.add(xtt);

                    int ytt = paneld.coloredShapes.get(i).getYtextu();
                    types.add(ytt);

                    int wid = paneld.coloredShapes.get(i).getWidthtex();
                    types.add(wid);

                    int hei = paneld.coloredShapes.get(i).getHeighttext();
                    types.add(hei);

                    if ("Gradiante".equals(type) || "Texture".equals(type)) {
                        Paint p = null;
                        types.add(p);
                    } else {
                        types.add(paneld.coloredShapes.get(i).getPaint());
                    }

                    types.add(paneld.coloredShapes.get(i).getColor());
                    types.add(paneld.coloredShapes.get(i).getShape());
                }
                outputStream.writeObject(types);
                this.setTitle(fll);
                System.out.println("El vector de ColoredShape ha sido guardado en el archivo binario: " + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Guardado cancelado por el usuario.");
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar archivo binario");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos binarios (*.dat)", "dat"));

        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado por el usuario
            String fileName = fileChooser.getSelectedFile().toString();
            fll = fileName;

            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
                // Deserializar el objeto desde el archivo
                Vector cp = (Vector) inputStream.readObject();
                paneld.coloredShapes.removeAllElements();
                int rule = 0;
                float alpha = 0;
                int thick = 0;
                int cap = 0;
                int join = 0;
                int milter = 0;
                float[] dash = null;
                float phase = 0;

                int gradX1 = 1;
                int gradX2 = 1;
                int gradY1 = 1;
                int gradY2 = 1;
                Color gradiant1 = null;
                Color gradiant2 = null;
                boolean cyclic = false;

                URL bim = null;
                int xte = 0;
                int yte = 0;
                int wte = 0;
                int hte = 0;

                //Tipo
                String typePaint = "Ninguno";

                Paint pa = null;
                Color col = null;
                Shape sh = null;
                int index = 0;
                System.out.println(cp.size());
                for (int i = 0; i < cp.size(); i++) {
                    if (index == 0) {
                        rule = (int) cp.get(i);
                        index++;
                    } else {
                        if (index == 1) {
                            alpha = (float) cp.get(i);
                            index++;
                        } else {
                            if (index == 2) {
                                thick = (int) cp.get(i);
                                index++;
                            } else {
                                if (index == 3) {
                                    cap = (int) cp.get(i);
                                    index++;
                                } else {
                                    if (index == 4) {
                                        join = (int) cp.get(i);
                                        index++;
                                    } else {
                                        if (index == 5) {
                                            milter = (int) cp.get(i);
                                            index++;
                                        } else {
                                            if (index == 6) {
                                                dash = (float[]) cp.get(i);
                                                index++;
                                            } else {
                                                if (index == 7) {
                                                    phase = (float) cp.get(i);
                                                    index++;
                                                } else {
                                                    if (index == 8) {
                                                        typePaint = (String) cp.get(i);
                                                        index++;

                                                    } else {
                                                        if (index == 9) {
                                                            gradiant1 = (Color) cp.get(i);
                                                            index++;

                                                        } else {
                                                            if (index == 10) {
                                                                gradiant2 = (Color) cp.get(i);
                                                                index++;

                                                            } else {
                                                                if (index == 11) {
                                                                    gradX1 = (int) cp.get(i);
                                                                    index++;

                                                                } else {
                                                                    if (index == 12) {
                                                                        gradY1 = (int) cp.get(i);
                                                                        index++;

                                                                    } else {
                                                                        if (index == 13) {
                                                                            gradX2 = (int) cp.get(i);
                                                                            index++;

                                                                        } else {
                                                                            if (index == 14) {
                                                                                gradY2 = (int) cp.get(i);
                                                                                index++;

                                                                            } else {
                                                                                if (index == 15) {
                                                                                    cyclic = (boolean) cp.get(i);
                                                                                    index++;

                                                                                } else {
                                                                                    if (index == 16) {
                                                                                        bim = (URL) cp.get(i);
                                                                                        index++;
                                                                                    } else {
                                                                                        if (index == 17) {
                                                                                            xte = (int) cp.get(i);
                                                                                            index++;

                                                                                        } else {
                                                                                            if (index == 18) {
                                                                                                yte = (int) cp.get(i);
                                                                                                index++;
                                                                                            } else {
                                                                                                if (index == 19) {
                                                                                                    wte = (int) cp.get(i);
                                                                                                    index++;
                                                                                                } else {
                                                                                                    if (index == 20) {
                                                                                                        hte = (int) cp.get(i);
                                                                                                        index++;
                                                                                                    } else {
                                                                                                        if (index == 21) {
                                                                                                            pa = (Paint) cp.get(i);
                                                                                                            index++;

                                                                                                        } else {
                                                                                                            if (index == 22) {
                                                                                                                col = (Color) cp.get(i);
                                                                                                                index++;
                                                                                                            } else {
                                                                                                                if (index == 23) {
                                                                                                                    sh = (Shape) cp.get(i);
                                                                                                                    Stroke str = new BasicStroke(thick, cap, join, milter,
                                                                                                                            dash, phase);
                                                                                                                    AlphaComposite al = AlphaComposite.getInstance(rule, alpha);

                                                                                                                    if ("Ninguna".equals(typePaint)) {
                                                                                                                        pa = null;
                                                                                                                    } else {
                                                                                                                        if ("Gradiante".equals(typePaint)) {
                                                                                                                            pa = new GradientPaint(gradX1, gradY1, gradiant1, gradX2, gradY2, gradiant2, cyclic);
                                                                                                                        } else {
                                                                                                                            if ("Solido".equals(typePaint)) {

                                                                                                                            } else {
                                                                                                                                if ("Texture".equals(typePaint)) {
                                                                                                                                    BufferedImage im = ImageIO.read(bim);
                                                                                                                                    pa = new TexturePaint(im, new Rectangle2D.Double(xte, yte, wte, hte));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    paneld.coloredShapes.add(new ColoredShape(sh, col, str, pa, al, thick, dash, phase, cap, join, milter, gradiant1, gradiant2, gradX1, gradY1, gradX2, gradY2, cyclic, typePaint, bim, xte, yte, wte, hte));
                                                                                                                    index = 0;
                                                                                                                    paneld.repaint();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println(paneld.coloredShapes.size());
                        System.out.println("Archivo binario leído exitosamente: " + fileName);
                    }
                    this.setTitle(fll);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Lectura cancelada por el usuario.");

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        DrawPanel nvo = new DrawPanel();
        this.dispose();
        nvo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;

        System.out.println(paneld.coloredShapes.size() + "Si se detectan");
        if (fll != null) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fll))) {
                Vector types = new Vector();
                for (int i = 0; i < paneld.coloredShapes.size(); i++) {
                    AlphaComposite er = paneld.coloredShapes.get(i).getAlpha();
                    int rule = er.getRule();
                    float alf = er.getAlpha();
                    types.add(rule);
                    types.add(alf);

                    int thick = paneld.coloredShapes.get(i).getThickness();
                    types.add(thick);

                    int cap = paneld.coloredShapes.get(i).getCap();
                    types.add(cap);

                    int join = paneld.coloredShapes.get(i).getJoin();
                    types.add(join);

                    int miter = paneld.coloredShapes.get(i).getMiterLimit();
                    types.add(miter);

                    float[] array = paneld.coloredShapes.get(i).getDashArray();
                    types.add(array);

                    float dash = paneld.coloredShapes.get(i).getDashPhase();
                    types.add(dash);

                    String type = paneld.coloredShapes.get(i).getTypePaint();
                    types.add(type);

                    Color color1 = paneld.coloredShapes.get(i).getColorg1();
                    types.add(color1);

                    Color color2 = paneld.coloredShapes.get(i).getColorg2();
                    types.add(color2);

                    int xg1 = paneld.coloredShapes.get(i).getXcolorg1();
                    types.add(xg1);

                    int yg1 = paneld.coloredShapes.get(i).getYcolorg1();
                    types.add(yg1);

                    int xg2 = paneld.coloredShapes.get(i).getXcolorg2();
                    types.add(xg2);

                    int yg2 = paneld.coloredShapes.get(i).getYcolorg2();
                    types.add(yg2);

                    boolean cycl = paneld.coloredShapes.get(i).isCyclic();
                    types.add(cycl);

                    URL bf = paneld.coloredShapes.get(i).getImagen();
                    types.add(bf);

                    int xtt = paneld.coloredShapes.get(i).getXtextu();
                    types.add(xtt);

                    int ytt = paneld.coloredShapes.get(i).getYtextu();
                    types.add(ytt);

                    int wid = paneld.coloredShapes.get(i).getWidthtex();
                    types.add(wid);

                    int hei = paneld.coloredShapes.get(i).getHeighttext();
                    types.add(hei);

                    if ("Gradiante".equals(type) || "Texture".equals(type)) {
                        Paint p = null;
                        types.add(p);
                    } else {
                        types.add(paneld.coloredShapes.get(i).getPaint());
                    }

                    types.add(paneld.coloredShapes.get(i).getColor());

                    types.add(paneld.coloredShapes.get(i).getShape());
                }
                outputStream.writeObject(types);
                System.out.println("El vector de ColoredShape ha sido guardado en el archivo binario: " + fll);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos binarios (*.dat)", "dat"));

            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                // Obtener el archivo seleccionado por el usuario
                String fileName = fileChooser.getSelectedFile().toString();
                fll = fileName;

                if (!fileName.endsWith(".dat")) {
                    // Añadir extensión .dat si no está presente
                    fileName += ".dat";
                }

                System.out.println(paneld.coloredShapes.size() + "Si se detectan");
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                    Vector types = new Vector();
                    for (int i = 0; i < paneld.coloredShapes.size(); i++) {
                        AlphaComposite er = paneld.coloredShapes.get(i).getAlpha();
                        int rule = er.getRule();
                        float alf = er.getAlpha();
                        types.add(rule);
                        types.add(alf);

                        int thick = paneld.coloredShapes.get(i).getThickness();
                        types.add(thick);

                        int cap = paneld.coloredShapes.get(i).getCap();
                        types.add(cap);

                        int join = paneld.coloredShapes.get(i).getJoin();
                        types.add(join);

                        int miter = paneld.coloredShapes.get(i).getMiterLimit();
                        types.add(miter);

                        float[] array = paneld.coloredShapes.get(i).getDashArray();
                        types.add(array);

                        float dash = paneld.coloredShapes.get(i).getDashPhase();
                        types.add(dash);

                        String type = paneld.coloredShapes.get(i).getTypePaint();
                        types.add(type);

                        Color color1 = paneld.coloredShapes.get(i).getColorg1();
                        types.add(color1);

                        Color color2 = paneld.coloredShapes.get(i).getColorg2();
                        types.add(color2);

                        int xg1 = paneld.coloredShapes.get(i).getXcolorg1();
                        types.add(xg1);

                        int yg1 = paneld.coloredShapes.get(i).getYcolorg1();
                        types.add(yg1);

                        int xg2 = paneld.coloredShapes.get(i).getXcolorg2();
                        types.add(xg2);

                        int yg2 = paneld.coloredShapes.get(i).getYcolorg2();
                        types.add(yg2);

                        boolean cycl = paneld.coloredShapes.get(i).isCyclic();
                        types.add(cycl);

                        URL bf = paneld.coloredShapes.get(i).getImagen();
                        types.add(bf);

                        int xtt = paneld.coloredShapes.get(i).getXtextu();
                        types.add(xtt);

                        int ytt = paneld.coloredShapes.get(i).getYtextu();
                        types.add(ytt);

                        int wid = paneld.coloredShapes.get(i).getWidthtex();
                        types.add(wid);

                        int hei = paneld.coloredShapes.get(i).getHeighttext();
                        types.add(hei);

                        if ("Gradiante".equals(type) || "Texture".equals(type)) {
                            Paint p = null;
                            types.add(p);
                        } else {
                            types.add(paneld.coloredShapes.get(i).getPaint());
                        }

                        types.add(paneld.coloredShapes.get(i).getColor());

                        types.add(paneld.coloredShapes.get(i).getShape());
                    }
                    outputStream.writeObject(types);
                    System.out.println("El vector de ColoredShape ha sido guardado en el archivo binario: " + fileName);
                    this.setTitle(fll);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Guardado cancelado por el usuario.");
            }
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        if (paneld.saved == true) {
            UIManager.put("control", Color.WHITE);
            UIManager.put("OptionPane.messageFont", f);
            UIManager.put("OptionPane.messageForeground", Color.black);
            String nombre = JOptionPane.showInputDialog(this, "Ingrese un nombre para la forma:");

            // Verificar si el usuario ingresó un nombre válido
            if (nombre != null && !nombre.isEmpty()) {
                // Agregar nombre a la forma
                Created crr = new Created();
                crr.setName(nombre);
                //paneld.cr.setName(nombre);

                Path2D path = new Path2D.Double();
                path.setWindingRule(Path2D.WIND_NON_ZERO); // Establecer la regla de devanado

                // Obtener el iterador de la forma
                PathIterator iterator = paneld.temp.getPathIterator(null);
                double[] coords = new double[6];

                // Iterar sobre los segmentos de la forma y agregarlos al Path2D
                while (!iterator.isDone()) {
                    int type = iterator.currentSegment(coords);
                    switch (type) {
                        case PathIterator.SEG_MOVETO:
                            path.moveTo(coords[0], coords[1]);
                            break;
                        case PathIterator.SEG_LINETO:
                            path.lineTo(coords[0], coords[1]);
                            break;
                        case PathIterator.SEG_QUADTO:
                            path.quadTo(coords[0], coords[1], coords[2], coords[3]);
                            break;
                        case PathIterator.SEG_CUBICTO:
                            path.curveTo(coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
                            break;
                        case PathIterator.SEG_CLOSE:
                            path.closePath();
                            break;
                    }
                    iterator.next();
                }
                crr.setShape(path);

                newShapes.add(crr);

                addButtons();
                guardarShapes();
                paneld.saved = false;
            }
        }


    }//GEN-LAST:event_jButton65ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        Panel2D paneld = new Panel2D();
        paneld = (Panel2D) jPanel1;
        if (jCheckBox1.isSelected()) {
            paneld.nueva = true;
        } else {
            paneld.nueva = false;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:

        remove = true;
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
               String rutaArchivo = "src/Manual/Manual.pdf";

        // Crear un objeto File con la ruta del archivo
        File archivo = new File(rutaArchivo);

        // Verificar si el archivo existe
        if (archivo.exists()) {
            try {
                // Abrir el archivo con el programa predeterminado del sistema
                Desktop.getDesktop().open(archivo);
            } catch (IOException e) {
                System.out.println("No se pudo abrir el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    public int showSliderDialog() {

        JSlider slider = new JSlider(1, 15);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSize(250, 60);
        slider.setBackground(Color.white);
        slider.setValue(sli);
        JLabel valueLabel = new JLabel("Tamaño del borde: " + slider.getValue());
        valueLabel.setFont(f);
        slider.setFont(f);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                valueLabel.setText("Tamaño: " + slider.getValue());
                sli = slider.getValue();
            }
        });

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(slider);
        panel.add(valueLabel);
        panel.setSize(new Dimension(150, 50));
        panel.setBackground(Color.white);

        int result = JOptionPane.showConfirmDialog(this, panel, "Selecciona un valor", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            return slider.getValue();
        } else {
            return 1; // Si el usuario cierra el cuadro de diálogo sin hacer clic en OK
        }
    }

    public float[] mostrarDialogoSliders() {
        JSlider[] sliders = new JSlider[4];
        float[] sliderValues = new float[4];

        JPanel panel = new JPanel(new GridLayout(5, 1));
        JLabel jl = new JLabel("Longitud 1: " + long1);
        JLabel jl2 = new JLabel("Espacio 1: " + esp1);
        JLabel jl3 = new JLabel("Longitud 2: " + long2);
        JLabel jl4 = new JLabel("Espacio 2: " + esp2);
        // Configurar los JSliders
        for (int i = 0; i < sliders.length; i++) {
            sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 50, 1);
            sliders[i].setMajorTickSpacing(10);
            sliders[i].setMinorTickSpacing(1);
            sliders[i].setPaintTicks(true);
            sliders[i].setPaintLabels(false);

            sliders[i].setFont(f);
            final int index = i;
            sliderValues[index] = sliders[index].getValue();
            sliders[i].addChangeListener(e -> {
                sliderValues[index] = sliders[index].getValue();
                switch (index) {
                    case 0:

                        jl.setText("Longitud 1: " + sliders[index].getValue());
                        long1 = sliders[index].getValue();
                        break;
                    case 1:

                        jl2.setText("Espacio 1: " + sliders[index].getValue());
                        esp1 = sliders[index].getValue();
                        break;
                    case 2:

                        jl3.setText("Longitud 2: " + sliders[index].getValue());
                        long2 = sliders[index].getValue();
                        break;
                    case 3:
                        jl4.setText("Espacio 1: " + sliders[index].getValue());
                        esp2 = sliders[index].getValue();
                        break;
                }
            });

            switch (i) {
                case 0:
                    sliders[i].setValue(long1);
                    jl.setFont(f);
                    panel.add(jl);
                    break;
                case 1:
                    sliders[i].setValue(esp1);
                    jl2.setFont(f);
                    panel.add(jl2);
                    break;
                case 2:
                    sliders[i].setValue(long2);
                    jl3.setFont(f);
                    panel.add(jl3);
                    break;
                case 3:
                    sliders[i].setValue(esp2);
                    jl4.setFont(f);
                    panel.add(jl4);
                    break;
            }

            panel.add(sliders[i]);
        }

        int result = JOptionPane.showOptionDialog(
                this,
                panel,
                "Selecciona valores",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null);

        if (result == JOptionPane.OK_OPTION) {
            if ((sliderValues[0] == 0 && sliderValues[1] == 0 && sliderValues[2] == 0 && sliderValues[3] == 0) || (sliderValues[0] == 0) || (sliderValues[2] == 0)) {
                return null;
            }
            return sliderValues;
        } else {
            return null;
        }
    }

    public void gradiantPaint() {

        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        JSlider[] sliders = new JSlider[4];
        JCheckBox jb = new JCheckBox("Ciclico");

        float[] sliderValues = new float[4];

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        JLabel jl1 = new JLabel("X1: " + x1g);
        JLabel jl2 = new JLabel("Y1: " + y1g);
        JLabel jl3 = new JLabel("X2: " + x2g);
        JLabel jl4 = new JLabel("Y2: " + y2g);

        jl1.setFont(f);
        jl2.setFont(f);
        jl3.setFont(f);
        jl4.setFont(f);
        jb.setFont(f);

        // Configurar los JSliders
        for (int i = 0; i < sliders.length; i++) {
            sliders[i] = new JSlider(JSlider.HORIZONTAL, 1, 1000, 1);
            sliders[i].setMajorTickSpacing(10);
            sliders[i].setMinorTickSpacing(1);
            sliders[i].setPaintTicks(true);
            sliders[i].setPaintLabels(false);
            sliders[i].setFont(f);
            final int index = i;
            sliderValues[index] = sliders[index].getValue();
            sliders[i].addChangeListener(e -> {
                sliderValues[index] = sliders[index].getValue();
                switch (index) {
                    case 0:
                        x1g = sliders[index].getValue();
                        jl1.setText("X1: " + x1g);
                        break;
                    case 1:
                        y1g = sliders[index].getValue();
                        jl2.setText("Y1: " + y1g);
                        break;
                    case 2:
                        x2g = sliders[index].getValue();
                        jl3.setText("X2: " + x2g);
                        break;
                    case 3:
                        y2g = sliders[index].getValue();
                        jl4.setText("Y2: " + y2g);
                        break;
                }
            });
            switch (i) {
                case 0:
                    sliders[i].setValue(x1g);
                    panel.add(jl1);
                    break;
                case 1:
                    sliders[i].setValue(y1g);
                    panel.add(jl2);
                    break;
                case 2:
                    sliders[i].setValue(x2g);
                    panel.add(jl3);
                    break;
                case 3:
                    sliders[i].setValue(y2g);
                    panel.add(jl4);
                    break;
            }
            panel.add(sliders[i]);
        }
        panel.add(jb);

        int result = JOptionPane.showOptionDialog(
                this,
                panel,
                "Selecciona valores",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null);

        if (result == JOptionPane.OK_OPTION) {
            p.cyclic = jb.isSelected();
            p.gradX1 = sliders[0].getValue();
            p.gradY1 = sliders[1].getValue();
            p.gradX2 = sliders[2].getValue();
            p.gradY2 = sliders[3].getValue();
            p.gradiant1 = jButton22.getBackground();
            p.gradiant2 = jButton23.getBackground();
            GradientPaint gp = new GradientPaint(p.gradX1, p.gradY1, p.gradiant1, p.gradX2, p.gradY2, p.gradiant2, p.cyclic);
            p.paint = gp;
            p.typePaint = "Gradiante";
        } else {

        }
    }

    public void texturePaint() {

    }

    public void guardarShapes() {
        try {
            Panel2D p = new Panel2D();
            p = (Panel2D) jPanel1;
            FileOutputStream fileOut = new FileOutputStream("src/Shapes/newShapes.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            /*Vector<Shape> newShapesAux = new Vector<>();
            System.out.println(newShapes.size());
            for (int i = 0; i < newShapes.size(); i++) {
                Shape au = newShapes.get(i).getShape();
                Shape de = au;
                newShapes.get(i).setShape(de);
            }*/

            objectOut.writeObject(newShapes);
            objectOut.close();
            fileOut.close();
            System.out.println("Se han guardado las formas correctamente en newShapes.dat");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void cargarShapes() {
        try {
            Panel2D p = new Panel2D();
            p = (Panel2D) jPanel1;
            FileInputStream fileIn = new FileInputStream("src/Shapes/newShapes.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            newShapes = (Vector<Created>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Se han cargado las formas correctamente desde newShapes.dat");
        } catch (IOException | ClassNotFoundException ex) {

        }
    }

    public void addButtons() {
        Panel2D p = new Panel2D();
        p = (Panel2D) jPanel1;
        jPanel15.removeAll();
        if (!newShapes.isEmpty()) {
            jPanel15.removeAll();
            int index = 1;

            for (int i = 0; i < newShapes.size(); i++) {
                final int inde = i;
                System.out.println("Index = " + ind);
                JButton jb = new JButton();
                jb.setPreferredSize(new Dimension(35, 35));
                jb.setIcon(new javax.swing.ImageIcon(getClass().getResource("iconos/Created" + index + ".png")));
                if (index == 3) {
                    index = 1;
                } else {
                    index++;
                }
                jb.setVisible(true);
                jb.setFocusPainted(false);
                jb.setContentAreaFilled(false);
                jb.setCursor(new Cursor(HAND_CURSOR));
                UIManager.put("control", Color.WHITE);
                UIManager.put("OptionPane.messageFont", f);
                UIManager.put("OptionPane.messageForeground", Color.white);
                UIManager.put("OptionPane.messageIconImage", null);
                jb.setToolTipText(newShapes.get(inde).getName());
                jb.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (remove == false) {
                            Panel2D p = new Panel2D();
                            p = (Panel2D) jPanel1;
                            System.out.println("Figura imprimida: " + inde);
                            p.temp = newShapes.get(inde).getShape();
                            p.shapeType = 50;
                        } else {
                            UIManager.put("control", Color.WHITE);
                            UIManager.put("OptionPane.messageFont", f);
                            UIManager.put("OptionPane.messageForeground", Color.BLACK);
                            int confirmDialogResult = JOptionPane.showConfirmDialog(DrawPanel.this, "¿Estás seguro de que deseas eliminar esta figura?", "Confirmación", JOptionPane.YES_NO_OPTION);
                            if (confirmDialogResult == JOptionPane.YES_OPTION) {
                                Panel2D p = new Panel2D();
                                p = (Panel2D) jPanel1;
                                newShapes.remove(inde);
                                guardarShapes();
                                addButtons();
                                remove = false;
                            }
                        }
                    }
                });
                jPanel15.add(jb);
                jPanel15.updateUI();

            }
        }
    }

    public void loadShapes() {
        String fileName = "newShapes.dat";
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));

        } catch (Exception ex) {

        }
    }

    public float dashPhaseSlider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setFont(f);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        JLabel jl = new JLabel("Dash Phase Value: " + dash);
        slider.setValue(dash);
        jl.setFont(f);
        slider.addChangeListener(e -> {
            dash = slider.getValue();
            jl.setText("Dash Phase Value: " + dash);

        });
        panel.add(jl);
        panel.add(slider);

        int result = JOptionPane.showOptionDialog(
                this,
                panel,
                "Selecciona un valor",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null);

        if (result == JOptionPane.OK_OPTION) {
            int valorSlider = slider.getValue();
            return (float) valorSlider; // Convertir a float
        } else {
            return 0;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrawPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
