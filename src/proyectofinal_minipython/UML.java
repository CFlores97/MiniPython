package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.Border;

public class UML extends javax.swing.JFrame implements MouseListener, MouseMotionListener {

    public UML() {
        initComponents();
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setLocation(0, 0);
        this.setSize(r.width, r.height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_menu = new javax.swing.JPopupMenu();
        mi_pegar = new javax.swing.JMenuItem();
        mi_help = new javax.swing.JMenuItem();
        bg_UML = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_archivo7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_insertar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_diseño = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_datos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_vista = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_proceso = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pn_ribbonMenu = new javax.swing.JPanel();
        tb_letras = new javax.swing.JToolBar();
        cb_fuente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        cb_estilo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cb_size = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
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
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_clase = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_interfaz = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btn_abstract = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btn_nota = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        js_workArea = new javax.swing.JScrollPane();
        jp_workArea = new javax.swing.JPanel();

        mi_pegar.setText("Pegar");
        mi_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_pegarActionPerformed(evt);
            }
        });
        pm_menu.add(mi_pegar);

        mi_help.setText("Ayuda");
        pm_menu.add(mi_help);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_UML.setBackground(new java.awt.Color(38, 38, 38));

        jPanel8.setBackground(new java.awt.Color(10, 10, 10));

        btn_archivo7.setBackground(new java.awt.Color(10, 10, 10));
        btn_archivo7.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_archivo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_archivo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_archivo7MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Archivo");

        javax.swing.GroupLayout btn_archivo7Layout = new javax.swing.GroupLayout(btn_archivo7);
        btn_archivo7.setLayout(btn_archivo7Layout);
        btn_archivo7Layout.setHorizontalGroup(
            btn_archivo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivo7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_archivo7Layout.setVerticalGroup(
            btn_archivo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_archivo7Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Insertar");
        jLabel9.setPreferredSize(new java.awt.Dimension(37, 16));

        javax.swing.GroupLayout btn_insertarLayout = new javax.swing.GroupLayout(btn_insertar);
        btn_insertar.setLayout(btn_insertarLayout);
        btn_insertarLayout.setHorizontalGroup(
            btn_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_insertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_insertarLayout.setVerticalGroup(
            btn_insertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_insertarLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Diseño");

        javax.swing.GroupLayout btn_diseñoLayout = new javax.swing.GroupLayout(btn_diseño);
        btn_diseño.setLayout(btn_diseñoLayout);
        btn_diseñoLayout.setHorizontalGroup(
            btn_diseñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_diseñoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_diseñoLayout.setVerticalGroup(
            btn_diseñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_diseñoLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Datos");

        javax.swing.GroupLayout btn_datosLayout = new javax.swing.GroupLayout(btn_datos);
        btn_datos.setLayout(btn_datosLayout);
        btn_datosLayout.setHorizontalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        btn_datosLayout.setVerticalGroup(
            btn_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_datosLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Vista");

        javax.swing.GroupLayout btn_vistaLayout = new javax.swing.GroupLayout(btn_vista);
        btn_vista.setLayout(btn_vistaLayout);
        btn_vistaLayout.setHorizontalGroup(
            btn_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_vistaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btn_vistaLayout.setVerticalGroup(
            btn_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_vistaLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Proceso");

        javax.swing.GroupLayout btn_procesoLayout = new javax.swing.GroupLayout(btn_proceso);
        btn_proceso.setLayout(btn_procesoLayout);
        btn_procesoLayout.setHorizontalGroup(
            btn_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_procesoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_procesoLayout.setVerticalGroup(
            btn_procesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_procesoLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Inicio");

        javax.swing.GroupLayout btn_inicioLayout = new javax.swing.GroupLayout(btn_inicio);
        btn_inicio.setLayout(btn_inicioLayout);
        btn_inicioLayout.setHorizontalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btn_inicioLayout.setVerticalGroup(
            btn_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_inicioLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pn_ribbonMenu.setBackground(new java.awt.Color(54, 54, 54));

        tb_letras.setBackground(new java.awt.Color(54, 54, 54));
        tb_letras.setBorderPainted(false);

        cb_fuente.setBackground(new java.awt.Color(68, 68, 68));
        cb_fuente.setForeground(new java.awt.Color(255, 255, 255));
        cb_fuente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Times New Roman", "Calibri", "Verdana", "Helvetica", "Courier New", "Georgia", "Tahoma", "Palatino", "Century Gothic", "Comic Sans MS", "Impact" }));
        cb_fuente.setSelectedIndex(-1);
        tb_letras.add(cb_fuente);
        tb_letras.add(jSeparator1);

        cb_estilo.setBackground(new java.awt.Color(68, 68, 68));
        cb_estilo.setForeground(new java.awt.Color(255, 255, 255));
        cb_estilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Bold", "Italic", "Underline" }));
        cb_estilo.setSelectedIndex(-1);
        tb_letras.add(cb_estilo);
        tb_letras.add(jSeparator2);

        cb_size.setBackground(new java.awt.Color(68, 68, 68));
        cb_size.setForeground(new java.awt.Color(255, 255, 255));
        cb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "48", "72" }));
        cb_size.setSelectedIndex(-1);
        tb_letras.add(cb_size);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fuente:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tamaño:");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Estilo de Fuente:");

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
        btn_gray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_grayMouseClicked(evt);
            }
        });
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
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
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
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_letras, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tb_colors1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_colors2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btn_archivo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pn_ribbonMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(btn_diseño, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addComponent(btn_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_archivo7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                            .addComponent(btn_vista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_proceso, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_ribbonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pn_formasMenu.setBackground(new java.awt.Color(38, 38, 38));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Formas");

        jPanel4.setBackground(new java.awt.Color(212, 212, 212));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        btn_clase.setBackground(new java.awt.Color(212, 212, 212));
        btn_clase.setForeground(new java.awt.Color(255, 255, 255));
        btn_clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_claseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_claseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_claseMouseExited(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Clase");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/clase.png"))); // NOI18N

        javax.swing.GroupLayout btn_claseLayout = new javax.swing.GroupLayout(btn_clase);
        btn_clase.setLayout(btn_claseLayout);
        btn_claseLayout.setHorizontalGroup(
            btn_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_claseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_claseLayout.setVerticalGroup(
            btn_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_claseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_claseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btn_interfaz.setBackground(new java.awt.Color(212, 212, 212));
        btn_interfaz.setForeground(new java.awt.Color(255, 255, 255));
        btn_interfaz.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_interfaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_interfazMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_interfazMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_interfazMouseExited(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Interfaz");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/interfaz.png"))); // NOI18N

        javax.swing.GroupLayout btn_interfazLayout = new javax.swing.GroupLayout(btn_interfaz);
        btn_interfaz.setLayout(btn_interfazLayout);
        btn_interfazLayout.setHorizontalGroup(
            btn_interfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_interfazLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btn_interfazLayout.setVerticalGroup(
            btn_interfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_interfazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_interfazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btn_abstract.setBackground(new java.awt.Color(212, 212, 212));
        btn_abstract.setForeground(new java.awt.Color(255, 255, 255));
        btn_abstract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abstractMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_abstractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_abstractMouseExited(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Abstracta ");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/interfaz.png"))); // NOI18N

        javax.swing.GroupLayout btn_abstractLayout = new javax.swing.GroupLayout(btn_abstract);
        btn_abstract.setLayout(btn_abstractLayout);
        btn_abstractLayout.setHorizontalGroup(
            btn_abstractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_abstractLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        btn_abstractLayout.setVerticalGroup(
            btn_abstractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_abstractLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_abstractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_nota.setBackground(new java.awt.Color(212, 212, 212));
        btn_nota.setForeground(new java.awt.Color(255, 255, 255));
        btn_nota.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_nota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_notaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_notaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_notaMouseExited(evt);
            }
        });

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Nota");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/comentario.png"))); // NOI18N

        javax.swing.GroupLayout btn_notaLayout = new javax.swing.GroupLayout(btn_nota);
        btn_nota.setLayout(btn_notaLayout);
        btn_notaLayout.setHorizontalGroup(
            btn_notaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_notaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_notaLayout.setVerticalGroup(
            btn_notaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_notaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_notaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btn_clase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_abstract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_nota, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_clase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_abstract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_nota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(227, 227, 227))
        );

        javax.swing.GroupLayout pn_formasMenuLayout = new javax.swing.GroupLayout(pn_formasMenu);
        pn_formasMenu.setLayout(pn_formasMenuLayout);
        pn_formasMenuLayout.setHorizontalGroup(
            pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formasMenuLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_formasMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_formasMenuLayout.setVerticalGroup(
            pn_formasMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_formasMenuLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(586, 431));

        js_workArea.setBackground(new java.awt.Color(255, 255, 255));

        jp_workArea.setBackground(new java.awt.Color(255, 255, 255));
        jp_workArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_workAreaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_workAreaLayout = new javax.swing.GroupLayout(jp_workArea);
        jp_workArea.setLayout(jp_workAreaLayout);
        jp_workAreaLayout.setHorizontalGroup(
            jp_workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        jp_workAreaLayout.setVerticalGroup(
            jp_workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        js_workArea.setViewportView(jp_workArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(js_workArea)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(js_workArea)
                .addContainerGap())
        );

        javax.swing.GroupLayout bg_UMLLayout = new javax.swing.GroupLayout(bg_UML);
        bg_UML.setLayout(bg_UMLLayout);
        bg_UMLLayout.setHorizontalGroup(
            bg_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg_UMLLayout.createSequentialGroup()
                .addComponent(pn_formasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        bg_UMLLayout.setVerticalGroup(
            bg_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_UMLLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bg_UMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_formasMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_UMLLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_UML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_UML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_archivo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivo7MouseEntered
        btn_archivo7.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_archivo7MouseEntered

    private void btn_archivo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivo7MouseExited
        btn_archivo7.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_archivo7MouseExited

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_exitMouseExited

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

    private void btn_claseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_claseMouseClicked
        createClase();
    }//GEN-LAST:event_btn_claseMouseClicked

    private void btn_claseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_claseMouseEntered
        btn_clase.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_claseMouseEntered

    private void btn_claseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_claseMouseExited
        btn_clase.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_claseMouseExited

    private void btn_interfazMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interfazMouseEntered
        btn_interfaz.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_interfazMouseEntered

    private void btn_interfazMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interfazMouseExited
        btn_interfaz.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_interfazMouseExited

    private void btn_abstractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abstractMouseEntered
        btn_abstract.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_abstractMouseEntered

    private void btn_abstractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abstractMouseExited
        btn_abstract.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_abstractMouseExited

    private void btn_notaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notaMouseClicked

    }//GEN-LAST:event_btn_notaMouseClicked

    private void btn_notaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notaMouseEntered
        btn_nota.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_notaMouseEntered

    private void btn_notaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notaMouseExited
        btn_nota.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_notaMouseExited

    private void btn_abstractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abstractMouseClicked
        createAbstract();
    }//GEN-LAST:event_btn_abstractMouseClicked

    private void btn_interfazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_interfazMouseClicked
        createInterfaz();
    }//GEN-LAST:event_btn_interfazMouseClicked

    private void jp_workAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_workAreaMouseClicked

        //mostrar el popmenu
        if (evt.isMetaDown()) {
            pm_menu.show(jp_workArea, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jp_workAreaMouseClicked

    private void mi_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_pegarActionPerformed

        //Pegar el elemento copiado
        try {
            toPasteFig = copiedFigures.get(copiedFigures.size() - 1);
            
            toPasteFig.addMouseListener(this);
            toPasteFig.addMouseMotionListener(this);

            jp_workArea.add(toPasteFig);
            toPasteFig.setLocation(jp_workArea.getWidth() / 2 + 10, jp_workArea.getHeight() / 2 + 10);
            copiedFigures.remove(toPasteFig);

            jp_workArea.revalidate();
            jp_workArea.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay nada copiado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mi_pegarActionPerformed

    private void btn_grayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grayMouseClicked
        
    }//GEN-LAST:event_btn_grayMouseClicked

    // metodos personales
    public void createInheritance(ClasseFigura selected) {

        InheritanceFigura herencia = new InheritanceFigura(
                150,
                100,
                selected.getX(),
                selected.getY() + 30,
                f,
                selected.getTitulo());

        //Agregar mouseListeners
        herencia.addMouseListener(this);
        herencia.addMouseMotionListener(this);

        jp_workArea.add(herencia);

        herencia.revalidate();
        jp_workArea.repaint();
    }

    public void createClase() {

        ClasseFigura clase = new ClasseFigura(
                200,
                100,
                jp_workArea.getWidth(),
                jp_workArea.getHeight(),
                f);

        //Agregar mouseListeners
        clase.addMouseListener(this);
        clase.addMouseMotionListener(this);

        jp_workArea.add(clase);

        clase.revalidate();
        jp_workArea.repaint();

    }

    public void createAbstract() {

        AbstractaFigura abs = new AbstractaFigura(
                200,
                180,
                jp_workArea.getWidth(),
                jp_workArea.getHeight(),
                f);

        //Agregar mouseListeners
        abs.addMouseListener(this);
        abs.addMouseMotionListener(this);

        jp_workArea.add(abs);

        abs.revalidate();
        jp_workArea.repaint();

    }

    public void createInterfaz() {

        InterfazFigura interfaz = new InterfazFigura(
                200,
                180,
                jp_workArea.getWidth(),
                jp_workArea.getHeight(),
                f);

        //Agregar mouseListeners
        interfaz.addMouseListener(this);
        interfaz.addMouseMotionListener(this);

        jp_workArea.add(interfaz);

        interfaz.revalidate();
        jp_workArea.repaint();

    }

    public void seleccion(ClasseFigura selected, boolean isClicked) {

        if (isClicked) {
            Border borde = BorderFactory.createLineBorder(new Color(147, 147, 147), 1);
            selected.setBorder(borde);
        } else {
            selected.setBorder(null);
        }

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
            java.util.logging.Logger.getLogger(UML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UML().setVisible(true);
            }
        });
    }

    Font f = new Font("Title", 1, 16);
    Point startPoint;
    ClasseFigura currentSel = null;
    ClasseFigura toPasteFig = null;
    ArrayList<ClasseFigura> copiedFigures = new ArrayList<>();
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_UML;
    private javax.swing.JPanel btn_abstract;
    private javax.swing.JPanel btn_archivo7;
    private javax.swing.JButton btn_black;
    private javax.swing.JButton btn_bloodred;
    private javax.swing.JButton btn_blue;
    private javax.swing.JButton btn_brown;
    private javax.swing.JPanel btn_clase;
    private javax.swing.JButton btn_cyan;
    private javax.swing.JPanel btn_datos;
    private javax.swing.JPanel btn_diseño;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JButton btn_gray;
    private javax.swing.JButton btn_green;
    private javax.swing.JPanel btn_inicio;
    private javax.swing.JPanel btn_insertar;
    private javax.swing.JPanel btn_interfaz;
    private javax.swing.JButton btn_lightgray;
    private javax.swing.JButton btn_limegreen;
    private javax.swing.JButton btn_mango;
    private javax.swing.JPanel btn_nota;
    private javax.swing.JButton btn_opaqueblue;
    private javax.swing.JButton btn_opaquecyan;
    private javax.swing.JButton btn_opaquepurple;
    private javax.swing.JButton btn_orange;
    private javax.swing.JButton btn_pink;
    private javax.swing.JPanel btn_proceso;
    private javax.swing.JButton btn_purple;
    private javax.swing.JButton btn_red;
    private javax.swing.JPanel btn_vista;
    private javax.swing.JButton btn_white;
    private javax.swing.JButton btn_yellow;
    private javax.swing.JButton btn_yellowopaque;
    private javax.swing.JComboBox<String> cb_estilo;
    private javax.swing.JComboBox<String> cb_fuente;
    private javax.swing.JComboBox<String> cb_size;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JPanel jp_workArea;
    private javax.swing.JScrollPane js_workArea;
    private javax.swing.JMenuItem mi_help;
    private javax.swing.JMenuItem mi_pegar;
    private javax.swing.JPopupMenu pm_menu;
    private javax.swing.JPanel pn_formasMenu;
    private javax.swing.JPanel pn_ribbonMenu;
    private javax.swing.JToolBar tb_colors1;
    private javax.swing.JToolBar tb_colors2;
    private javax.swing.JToolBar tb_letras;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {

        Component source = e.getComponent();

        //verificar si lo clickeado es una figura
        if (currentSel != null && currentSel != source) {
            seleccion(currentSel, false);
        }

        // Seleccionar figura
        if (e.getButton() == MouseEvent.BUTTON1) {
            if (source instanceof ClasseFigura) {

                ClasseFigura selected = (ClasseFigura) source;
                boolean isClicked = false;

                if (currentSel != selected) {
                    isClicked = true;
                }

                seleccion(selected, isClicked);

                if (isClicked) {
                    currentSel = selected;
                } else {
                    currentSel = null;
                }

            }
        }

        // Click derecho
        if (e.isMetaDown()) {
            try {
                JMenuItem addAttribute = new JMenuItem("Agregar miembro");
                JMenuItem makeInheritance = new JMenuItem("Crear clase hija");
                JMenuItem copy = new JMenuItem("Copiar");
                JMenuItem delete = new JMenuItem("Eliminar");

                //Agrega el pop menu y los items
                JPopupMenu rCMenu = new JPopupMenu();
                rCMenu.add(addAttribute);
                rCMenu.add(makeInheritance);
                rCMenu.add(copy);
                rCMenu.add(delete);

                //agrega los actionlisteners de cada menuitem
                
                // Agregar atributos
                addAttribute.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof ClasseFigura) {

                            ClasseFigura selected = (ClasseFigura) source;
                            JTextArea newMiembro = new JTextArea(1, 10);
                            selected.add(newMiembro);
                            selected.getMiembros().add(newMiembro);
                            selected.setSize(selected.getWidth(), selected.getHeight() + 20);
                            selected.repaint();
                            jp_workArea.revalidate();
                            jp_workArea.repaint();
                        }

                    }
                });

                // Agregar Herencia
                makeInheritance.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof ClasseFigura) {
                            ClasseFigura selected = (ClasseFigura) source;

                            createInheritance(selected);

                            jp_workArea.revalidate();
                            jp_workArea.repaint();

                        }
                    }
                });

                // Copiar 
                copy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {

                            ClasseFigura claseCopiada = new ClasseFigura(currentSel);

                            copiedFigures.add(claseCopiada);

                            jp_workArea.revalidate();
                            jp_workArea.repaint();

                            if (!copiedFigures.isEmpty()) {
                                JOptionPane.showMessageDialog(bg_UML, "Copiado!");
                            }
                        } catch (NullPointerException ex) {
                            JOptionPane.showMessageDialog(bg_UML, "Debe seleccionar primero la figura", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

                // Eliminar
                delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof ClasseFigura) {

                            int op = JOptionPane.showConfirmDialog(bg_UML, "Esta seguro que desea eliminar?");

                            if (op == JOptionPane.YES_OPTION) {
                                ClasseFigura selected = (ClasseFigura) source;
                                jp_workArea.remove(selected);
                                jp_workArea.revalidate();
                                jp_workArea.repaint();

                            }

                        }
                    }
                });

                rCMenu.show(source, e.getX(), e.getY());
            } catch (Exception ex) {

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        Component source = e.getComponent(); //guarda el objeto de donde se origina el evento

        if (e.getButton() == MouseEvent.BUTTON1) {
            startPoint = SwingUtilities.convertPoint(source, e.getPoint(), source.getParent());
        }

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

        //logica del drag and drop
        try {
            Component source = e.getComponent();

            Point location = SwingUtilities.convertPoint(source, e.getPoint(), source.getParent());

            Point newLocation = source.getLocation();
            newLocation.translate(location.x - startPoint.x, location.y - startPoint.y);
            newLocation.x = Math.max(newLocation.x, 0);
            newLocation.y = Math.max(newLocation.y, 0);
            newLocation.x = Math.min(newLocation.x, source.getParent().getWidth() - source.getWidth());
            newLocation.y = Math.min(newLocation.y, source.getParent().getHeight() - source.getHeight());
            source.setLocation(newLocation);
            startPoint = location;

        } catch (Exception ex) {

        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
