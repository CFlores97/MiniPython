package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;

public class Flujo extends javax.swing.JFrame implements MouseListener, MouseMotionListener {

    public Flujo() {
        initComponents();
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setLocation(0, 0);

        this.setSize(r.width, r.height);

        g = workArea.getGraphics();
        workArea.paintComponents(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_flujo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_archivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_insertar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_diseño = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_vista = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_proceso = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pn_ribbonMenu = new javax.swing.JPanel();
        tb_letras = new javax.swing.JToolBar();
        cb_fuente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        cb_estilo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cb_size = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tb_colors1 = new javax.swing.JToolBar();
        btn_black = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_gray = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btn_bloodred = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btn_red = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btn_orange = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btn_yellow = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        btn_green = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btn_cyan = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btn_blue = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        btn_purple = new javax.swing.JButton();
        tb_colors2 = new javax.swing.JToolBar();
        btn_white = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btn_lightgray = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        btn_brown = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        btn_pink = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        btn_mango = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        btn_yellowopaque = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        btn_limegreen = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        btn_opaquecyan = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        btn_opaqueblue = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        btn_opaquepurple = new javax.swing.JButton();
        pn_formasMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        workArea = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_proc = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_decision = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_subproceso = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_iniofin = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_doc = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_dat = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_separador = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btn_sepVertical = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_flujo.setBackground(new java.awt.Color(38, 38, 38));

        jPanel1.setBackground(new java.awt.Color(10, 10, 10));

        btn_archivo.setBackground(new java.awt.Color(10, 10, 10));
        btn_archivo.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_archivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_archivoMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Archivo");

        javax.swing.GroupLayout btn_archivoLayout = new javax.swing.GroupLayout(btn_archivo);
        btn_archivo.setLayout(btn_archivoLayout);
        btn_archivoLayout.setHorizontalGroup(
            btn_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_archivoLayout.setVerticalGroup(
            btn_archivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_exit.setBackground(new java.awt.Color(10, 10, 10));
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("X");

        javax.swing.GroupLayout btn_exitLayout = new javax.swing.GroupLayout(btn_exit);
        btn_exit.setLayout(btn_exitLayout);
        btn_exitLayout.setHorizontalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_exitLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btn_exitLayout.setVerticalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_exitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_insertar.setBackground(new java.awt.Color(10, 10, 10));
        btn_insertar.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_insertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_insertarMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Insertar");
        jLabel2.setPreferredSize(new java.awt.Dimension(37, 16));

        javax.swing.GroupLayout btn_insertarLayout = new javax.swing.GroupLayout(btn_insertar);
        btn_insertar.setLayout(btn_insertarLayout);
        btn_insertarLayout.setHorizontalGroup(
            btn_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_insertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_insertarLayout.setVerticalGroup(
            btn_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_insertarLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btn_diseño.setBackground(new java.awt.Color(10, 10, 10));
        btn_diseño.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_diseño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_diseñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_diseñoMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diseño");

        javax.swing.GroupLayout btn_diseñoLayout = new javax.swing.GroupLayout(btn_diseño);
        btn_diseño.setLayout(btn_diseñoLayout);
        btn_diseñoLayout.setHorizontalGroup(
            btn_diseñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_diseñoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_diseñoLayout.setVerticalGroup(
            btn_diseñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_diseñoLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_datos.setBackground(new java.awt.Color(10, 10, 10));
        btn_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_datosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_datosMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Datos");

        javax.swing.GroupLayout btn_datosLayout = new javax.swing.GroupLayout(btn_datos);
        btn_datos.setLayout(btn_datosLayout);
        btn_datosLayout.setHorizontalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btn_datosLayout.setVerticalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datosLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_vista.setBackground(new java.awt.Color(10, 10, 10));
        btn_vista.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_vista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vistaMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vista");

        javax.swing.GroupLayout btn_vistaLayout = new javax.swing.GroupLayout(btn_vista);
        btn_vista.setLayout(btn_vistaLayout);
        btn_vistaLayout.setHorizontalGroup(
            btn_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_vistaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btn_vistaLayout.setVerticalGroup(
            btn_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_vistaLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btn_proceso.setBackground(new java.awt.Color(10, 10, 10));
        btn_proceso.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_procesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_procesoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proceso");

        javax.swing.GroupLayout btn_procesoLayout = new javax.swing.GroupLayout(btn_proceso);
        btn_proceso.setLayout(btn_procesoLayout);
        btn_procesoLayout.setHorizontalGroup(
            btn_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_procesoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_procesoLayout.setVerticalGroup(
            btn_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_procesoLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_inicio.setBackground(new java.awt.Color(10, 10, 10));
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicio");

        javax.swing.GroupLayout btn_inicioLayout = new javax.swing.GroupLayout(btn_inicio);
        btn_inicio.setLayout(btn_inicioLayout);
        btn_inicioLayout.setHorizontalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btn_inicioLayout.setVerticalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn_ribbonMenu.setBackground(new java.awt.Color(54, 54, 54));

        tb_letras.setBackground(new java.awt.Color(54, 54, 54));
        tb_letras.setBorderPainted(false);

        cb_fuente.setBackground(new java.awt.Color(68, 68, 68));
        cb_fuente.setForeground(new java.awt.Color(255, 255, 255));
        cb_fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Times New Roman", "Calibri", "Verdana", "Helvetica", "Courier New", "Georgia", "Tahoma", "Palatino", "Century Gothic", "Comic Sans MS", "Impact" }));
        tb_letras.add(cb_fuente);
        tb_letras.add(jSeparator1);

        cb_estilo.setBackground(new java.awt.Color(68, 68, 68));
        cb_estilo.setForeground(new java.awt.Color(255, 255, 255));
        cb_estilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Bold", "Italic", "Underline" }));
        tb_letras.add(cb_estilo);
        tb_letras.add(jSeparator2);

        cb_size.setBackground(new java.awt.Color(68, 68, 68));
        cb_size.setForeground(new java.awt.Color(255, 255, 255));
        cb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "48", "72" }));
        tb_letras.add(cb_size);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fuente:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tamaño:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estilo de Fuente:");

        jSeparator3.setBackground(new java.awt.Color(68, 68, 68));
        jSeparator3.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setOpaque(true);

        tb_colors1.setBackground(new java.awt.Color(54, 54, 54));
        tb_colors1.setBorderPainted(false);

        btn_black.setBackground(new java.awt.Color(0, 0, 0));
        btn_black.setFocusable(false);
        btn_black.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_black.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_black);
        tb_colors1.add(jSeparator4);

        btn_gray.setBackground(new java.awt.Color(127, 127, 127));
        btn_gray.setFocusable(false);
        btn_gray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_gray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_gray);
        tb_colors1.add(jSeparator5);

        btn_bloodred.setBackground(new java.awt.Color(102, 0, 51));
        btn_bloodred.setFocusable(false);
        btn_bloodred.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_bloodred.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_bloodred);
        tb_colors1.add(jSeparator6);

        btn_red.setBackground(new java.awt.Color(255, 0, 0));
        btn_red.setFocusable(false);
        btn_red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_red.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_red);
        tb_colors1.add(jSeparator7);

        btn_orange.setBackground(new java.awt.Color(255, 102, 0));
        btn_orange.setFocusable(false);
        btn_orange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_orange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_orange);
        tb_colors1.add(jSeparator8);

        btn_yellow.setBackground(new java.awt.Color(255, 255, 0));
        btn_yellow.setFocusable(false);
        btn_yellow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yellow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_yellow);
        tb_colors1.add(jSeparator9);

        btn_green.setBackground(new java.awt.Color(0, 153, 0));
        btn_green.setFocusable(false);
        btn_green.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_green.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_green);
        tb_colors1.add(jSeparator10);

        btn_cyan.setBackground(new java.awt.Color(0, 162, 232));
        btn_cyan.setFocusable(false);
        btn_cyan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_cyan);
        tb_colors1.add(jSeparator11);

        btn_blue.setBackground(new java.awt.Color(63, 72, 204));
        btn_blue.setFocusable(false);
        btn_blue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_blue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_blue);
        tb_colors1.add(jSeparator12);

        btn_purple.setBackground(new java.awt.Color(204, 102, 255));
        btn_purple.setFocusable(false);
        btn_purple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_purple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors1.add(btn_purple);

        tb_colors2.setBackground(new java.awt.Color(54, 54, 54));
        tb_colors2.setBorderPainted(false);

        btn_white.setBackground(new java.awt.Color(255, 255, 255));
        btn_white.setFocusable(false);
        btn_white.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_white.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_white);
        tb_colors2.add(jSeparator13);

        btn_lightgray.setBackground(new java.awt.Color(204, 204, 204));
        btn_lightgray.setFocusable(false);
        btn_lightgray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_lightgray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_lightgray);
        tb_colors2.add(jSeparator14);

        btn_brown.setBackground(new java.awt.Color(153, 102, 0));
        btn_brown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_brown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_brown);
        tb_colors2.add(jSeparator15);

        btn_pink.setBackground(new java.awt.Color(255, 153, 204));
        btn_pink.setFocusable(false);
        btn_pink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pink.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_pink);
        tb_colors2.add(jSeparator16);

        btn_mango.setBackground(new java.awt.Color(255, 204, 0));
        btn_mango.setFocusable(false);
        btn_mango.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mango.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_mango);
        tb_colors2.add(jSeparator17);

        btn_yellowopaque.setBackground(new java.awt.Color(239, 228, 176));
        btn_yellowopaque.setFocusable(false);
        btn_yellowopaque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yellowopaque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_yellowopaque);
        tb_colors2.add(jSeparator18);

        btn_limegreen.setBackground(new java.awt.Color(153, 255, 0));
        btn_limegreen.setFocusable(false);
        btn_limegreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_limegreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_limegreen);
        tb_colors2.add(jSeparator19);

        btn_opaquecyan.setBackground(new java.awt.Color(204, 255, 255));
        btn_opaquecyan.setFocusable(false);
        btn_opaquecyan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaquecyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_opaquecyan);
        tb_colors2.add(jSeparator20);

        btn_opaqueblue.setBackground(new java.awt.Color(0, 102, 153));
        btn_opaqueblue.setFocusable(false);
        btn_opaqueblue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaqueblue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_opaqueblue);
        tb_colors2.add(jSeparator21);

        btn_opaquepurple.setBackground(new java.awt.Color(204, 204, 255));
        btn_opaquepurple.setFocusable(false);
        btn_opaquepurple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaquepurple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_colors2.add(btn_opaquepurple);

        javax.swing.GroupLayout pn_ribbonMenuLayout = new javax.swing.GroupLayout(pn_ribbonMenu);
        pn_ribbonMenu.setLayout(pn_ribbonMenuLayout);
        pn_ribbonMenuLayout.setHorizontalGroup(
            pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addComponent(tb_letras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tb_colors1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(tb_colors2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(372, 372, 372))
        );
        pn_ribbonMenuLayout.setVerticalGroup(
            pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_letras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tb_colors1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_colors2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_diseño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pn_ribbonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(btn_diseño, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_archivo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                            .addComponent(btn_vista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_proceso, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_ribbonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pn_formasMenu.setBackground(new java.awt.Color(38, 38, 38));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        workArea.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Formas");

        jPanel4.setBackground(new java.awt.Color(212, 212, 212));

        btn_proc.setBackground(new java.awt.Color(212, 212, 212));
        btn_proc.setForeground(new java.awt.Color(255, 255, 255));
        btn_proc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_procMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_procMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_procMouseExited(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Proceso");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/Proceso.png"))); // NOI18N

        javax.swing.GroupLayout btn_procLayout = new javax.swing.GroupLayout(btn_proc);
        btn_proc.setLayout(btn_procLayout);
        btn_procLayout.setHorizontalGroup(
            btn_procLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_procLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_procLayout.setVerticalGroup(
            btn_procLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_procLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_procLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_decision.setBackground(new java.awt.Color(212, 212, 212));
        btn_decision.setForeground(new java.awt.Color(255, 255, 255));
        btn_decision.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_decision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_decisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_decisionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_decisionMouseExited(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Decision");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/Decision.png"))); // NOI18N

        javax.swing.GroupLayout btn_decisionLayout = new javax.swing.GroupLayout(btn_decision);
        btn_decision.setLayout(btn_decisionLayout);
        btn_decisionLayout.setHorizontalGroup(
            btn_decisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_decisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_decisionLayout.setVerticalGroup(
            btn_decisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_decisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_decisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btn_subproceso.setBackground(new java.awt.Color(212, 212, 212));
        btn_subproceso.setForeground(new java.awt.Color(255, 255, 255));
        btn_subproceso.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_subproceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_subprocesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_subprocesoMouseExited(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Subproceso");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/Subproceso.png"))); // NOI18N

        javax.swing.GroupLayout btn_subprocesoLayout = new javax.swing.GroupLayout(btn_subproceso);
        btn_subproceso.setLayout(btn_subprocesoLayout);
        btn_subprocesoLayout.setHorizontalGroup(
            btn_subprocesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_subprocesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        btn_subprocesoLayout.setVerticalGroup(
            btn_subprocesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_subprocesoLayout.createSequentialGroup()
                .addGroup(btn_subprocesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        btn_iniofin.setBackground(new java.awt.Color(212, 212, 212));
        btn_iniofin.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniofin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_iniofinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_iniofinMouseExited(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Inicio o ");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/iniciofinalizacion.png"))); // NOI18N

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Finalizacion");

        javax.swing.GroupLayout btn_iniofinLayout = new javax.swing.GroupLayout(btn_iniofin);
        btn_iniofin.setLayout(btn_iniofinLayout);
        btn_iniofinLayout.setHorizontalGroup(
            btn_iniofinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_iniofinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_iniofinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_iniofinLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(btn_iniofinLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        btn_iniofinLayout.setVerticalGroup(
            btn_iniofinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_iniofinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_iniofinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btn_iniofinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        btn_doc.setBackground(new java.awt.Color(212, 212, 212));
        btn_doc.setForeground(new java.awt.Color(255, 255, 255));
        btn_doc.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_docMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_docMouseExited(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Documento");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/documento.png"))); // NOI18N

        javax.swing.GroupLayout btn_docLayout = new javax.swing.GroupLayout(btn_doc);
        btn_doc.setLayout(btn_docLayout);
        btn_docLayout.setHorizontalGroup(
            btn_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_docLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        btn_docLayout.setVerticalGroup(
            btn_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_docLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_docLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn_dat.setBackground(new java.awt.Color(212, 212, 212));
        btn_dat.setForeground(new java.awt.Color(255, 255, 255));
        btn_dat.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_dat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_datMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_datMouseExited(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Datos");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/datos.png"))); // NOI18N

        javax.swing.GroupLayout btn_datLayout = new javax.swing.GroupLayout(btn_dat);
        btn_dat.setLayout(btn_datLayout);
        btn_datLayout.setHorizontalGroup(
            btn_datLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_datLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_datLayout.setVerticalGroup(
            btn_datLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_datLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        btn_separador.setBackground(new java.awt.Color(212, 212, 212));
        btn_separador.setForeground(new java.awt.Color(255, 255, 255));
        btn_separador.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_separador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_separadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_separadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_separadorMouseExited(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Separador");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/separador.jpg"))); // NOI18N

        javax.swing.GroupLayout btn_separadorLayout = new javax.swing.GroupLayout(btn_separador);
        btn_separador.setLayout(btn_separadorLayout);
        btn_separadorLayout.setHorizontalGroup(
            btn_separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_separadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_separadorLayout.setVerticalGroup(
            btn_separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_separadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btn_sepVertical.setBackground(new java.awt.Color(212, 212, 212));
        btn_sepVertical.setForeground(new java.awt.Color(255, 255, 255));
        btn_sepVertical.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_sepVertical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sepVerticalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sepVerticalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sepVerticalMouseExited(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Separador");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/separadorVert.png"))); // NOI18N

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("(Vertical)");

        javax.swing.GroupLayout btn_sepVerticalLayout = new javax.swing.GroupLayout(btn_sepVertical);
        btn_sepVertical.setLayout(btn_sepVerticalLayout);
        btn_sepVerticalLayout.setHorizontalGroup(
            btn_sepVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_sepVerticalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btn_sepVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_sepVerticalLayout.setVerticalGroup(
            btn_sepVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_sepVerticalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_sepVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btn_sepVerticalLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_subproceso, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(btn_proc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_doc, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(btn_separador, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_decision, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btn_iniofin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dat, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btn_sepVertical, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_proc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_decision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_subproceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniofin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sepVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_formasMenuLayout = new javax.swing.GroupLayout(pn_formasMenu);
        pn_formasMenu.setLayout(pn_formasMenuLayout);
        pn_formasMenuLayout.setHorizontalGroup(
            pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formasMenuLayout.createSequentialGroup()
                .addGroup(pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addGroup(pn_formasMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(616, 616, 616))
            .addGroup(pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_formasMenuLayout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pn_formasMenuLayout.setVerticalGroup(
            pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formasMenuLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_formasMenuLayout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout bg_flujoLayout = new javax.swing.GroupLayout(bg_flujo);
        bg_flujo.setLayout(bg_flujoLayout);
        bg_flujoLayout.setHorizontalGroup(
            bg_flujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg_flujoLayout.createSequentialGroup()
                .addComponent(pn_formasMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_flujoLayout.setVerticalGroup(
            bg_flujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_flujoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_formasMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg_flujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg_flujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_archivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivoMouseEntered
        btn_archivo.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_archivoMouseEntered

    private void btn_archivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivoMouseExited
        btn_archivo.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_archivoMouseExited

    private void btn_insertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insertarMouseEntered
        btn_insertar.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_insertarMouseEntered

    private void btn_insertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insertarMouseExited
        btn_insertar.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_insertarMouseExited

    private void btn_diseñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diseñoMouseEntered
        btn_diseño.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_diseñoMouseEntered

    private void btn_diseñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_diseñoMouseExited
        btn_diseño.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_diseñoMouseExited

    private void btn_datosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datosMouseEntered
        btn_datos.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_datosMouseEntered

    private void btn_datosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datosMouseExited
        btn_datos.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_datosMouseExited

    private void btn_vistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vistaMouseEntered
        btn_vista.setBackground(new Color(54, 54, 54));

    }//GEN-LAST:event_btn_vistaMouseEntered

    private void btn_vistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vistaMouseExited
        btn_vista.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_vistaMouseExited

    private void btn_procesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procesoMouseEntered
        btn_proceso.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_procesoMouseEntered

    private void btn_procesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procesoMouseExited
        btn_proceso.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_procesoMouseExited

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        btn_inicio.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_procMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procMouseEntered
        btn_proc.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_procMouseEntered

    private void btn_procMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procMouseExited
        btn_proc.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_procMouseExited

    private void btn_decisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_decisionMouseEntered
        btn_decision.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_decisionMouseEntered

    private void btn_decisionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_decisionMouseExited
        btn_decision.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_decisionMouseExited

    private void btn_subprocesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subprocesoMouseEntered
        btn_subproceso.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_subprocesoMouseEntered

    private void btn_subprocesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subprocesoMouseExited
        btn_subproceso.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_subprocesoMouseExited

    private void btn_iniofinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniofinMouseEntered
        btn_iniofin.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_iniofinMouseEntered

    private void btn_iniofinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniofinMouseExited
        btn_iniofin.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_iniofinMouseExited

    private void btn_docMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_docMouseEntered
        btn_doc.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_docMouseEntered

    private void btn_docMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_docMouseExited
        btn_doc.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_docMouseExited

    private void btn_datMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMouseEntered
        btn_dat.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_datMouseEntered

    private void btn_datMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMouseExited
        btn_dat.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_datMouseExited

    private void btn_separadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_separadorMouseEntered
        btn_separador.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_separadorMouseEntered

    private void btn_separadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_separadorMouseExited
        btn_separador.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_separadorMouseExited

    private void btn_sepVerticalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sepVerticalMouseEntered
        btn_sepVertical.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_sepVerticalMouseEntered

    private void btn_sepVerticalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sepVerticalMouseExited
        btn_sepVertical.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_sepVerticalMouseExited

    private void btn_procMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procMouseClicked
        createShape();
    }//GEN-LAST:event_btn_procMouseClicked

    private void btn_decisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_decisionMouseClicked
        
        
    }//GEN-LAST:event_btn_decisionMouseClicked

    private void btn_separadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_separadorMouseClicked
        
    }//GEN-LAST:event_btn_separadorMouseClicked

    private void btn_sepVerticalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sepVerticalMouseClicked
        g.drawLine(500, 500, 500, 350);
    }//GEN-LAST:event_btn_sepVerticalMouseClicked

    public void createShape() {

        shape = new JPanel();
        textP = new JTextPane();
        shape.setBackground(new Color(70, 114, 196));
        shape.setSize(70, 60);
        shape.setLocation(workArea.getWidth() / 2, workArea.getHeight() / 2);

        workArea.add(shape);
        shape.add(textP);

        shape.addMouseListener(this);
        shape.addMouseMotionListener(this);
        
        shape.revalidate();
        workArea.repaint();
    }
    
    public boolean isSelected(int mouseX, int mouseY){
        return mouseX >= shape.getX() && mouseX <= (shape.getX() + mouseX) 
                && mouseY >= shape.getY() && mouseY <= (shape.getY() + mouseY);
        
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Darcula".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Flujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flujo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flujo().setVisible(true);
            }
        });
    }

    
    Point startPoint;
    ArrayList<JPanel> shapes = new ArrayList<>();
    JPanel shape;
    JTextPane textP;
    Component source;
    Graphics g;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_flujo;
    private javax.swing.JPanel btn_archivo;
    private javax.swing.JButton btn_black;
    private javax.swing.JButton btn_bloodred;
    private javax.swing.JButton btn_blue;
    private javax.swing.JButton btn_brown;
    private javax.swing.JButton btn_cyan;
    private javax.swing.JPanel btn_dat;
    private javax.swing.JPanel btn_datos;
    private javax.swing.JPanel btn_decision;
    private javax.swing.JPanel btn_diseño;
    private javax.swing.JPanel btn_doc;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JButton btn_gray;
    private javax.swing.JButton btn_green;
    private javax.swing.JPanel btn_inicio;
    private javax.swing.JPanel btn_iniofin;
    private javax.swing.JPanel btn_insertar;
    private javax.swing.JButton btn_lightgray;
    private javax.swing.JButton btn_limegreen;
    private javax.swing.JButton btn_mango;
    private javax.swing.JButton btn_opaqueblue;
    private javax.swing.JButton btn_opaquecyan;
    private javax.swing.JButton btn_opaquepurple;
    private javax.swing.JButton btn_orange;
    private javax.swing.JButton btn_pink;
    private javax.swing.JPanel btn_proc;
    private javax.swing.JPanel btn_proceso;
    private javax.swing.JButton btn_purple;
    private javax.swing.JButton btn_red;
    private javax.swing.JPanel btn_sepVertical;
    private javax.swing.JPanel btn_separador;
    private javax.swing.JPanel btn_subproceso;
    private javax.swing.JPanel btn_vista;
    private javax.swing.JButton btn_white;
    private javax.swing.JButton btn_yellow;
    private javax.swing.JButton btn_yellowopaque;
    private javax.swing.JComboBox<String> cb_estilo;
    private javax.swing.JComboBox<String> cb_fuente;
    private javax.swing.JComboBox<String> cb_size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JPanel pn_formasMenu;
    private javax.swing.JPanel pn_ribbonMenu;
    private javax.swing.JToolBar tb_colors1;
    private javax.swing.JToolBar tb_colors2;
    private javax.swing.JToolBar tb_letras;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //codigo para verificar si el objeto ha sido seleccionado
        
        /*
        source = e.getComponent();
        Point convertedPoint = SwingUtilities.convertPoint(source, e.getPoint(), source.getParent());
        if (isSelected(convertedPoint.x, convertedPoint.y)) {
            JOptionPane.showMessageDialog(this, "Objeto seleccionado");
        }*/
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // dice a la computadora, donde esta el objeto con relacion a "la pantalla" que lo contiene.
        source = e.getComponent(); //guarda el objeto de donde se origina el evento

        startPoint = SwingUtilities.convertPoint(source, e.getPoint(), source.getParent());

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        startPoint = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        source = e.getComponent();
        
        Point location = SwingUtilities.convertPoint(source, e.getPoint(), source.getParent());
        
        
        Point newLocation = source.getLocation();
        newLocation.translate(location.x - startPoint.x, location.y - startPoint.y);
        newLocation.x = Math.max(newLocation.x, 0);
        newLocation.y = Math.max(newLocation.y, 0);
        newLocation.x = Math.min(newLocation.x, source.getParent().getWidth() - source.getWidth());
        newLocation.y = Math.min(newLocation.y, source.getParent().getHeight() - source.getHeight());
        source.setLocation(newLocation);
        startPoint = location;

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
