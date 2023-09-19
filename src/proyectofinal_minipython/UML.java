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
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class UML extends javax.swing.JFrame implements MouseListener, MouseMotionListener {

    public UML() {
        initComponents();

        Rectangle r = ge.getMaximumWindowBounds();
        this.setLocation(0, 0);
        this.setSize(r.width, r.height);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_fuente.getModel();

        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (String fontName : fontNames) {
            modelo.addElement(fontName);
        }

        cb_fuente.setModel(modelo);
        cb_fuente.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_menu = new javax.swing.JPopupMenu();
        mi_pegar = new javax.swing.JMenuItem();
        mi_help = new javax.swing.JMenuItem();
        jd_arbol = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_arbolClases = new javax.swing.JTree();
        jd_python = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp_pyIDE = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        btn_exitPython = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        m_menu = new javax.swing.JMenu();
        pp_menu = new javax.swing.JPopupMenu();
        mi_guardar = new javax.swing.JMenuItem();
        mi_cargar = new javax.swing.JMenuItem();
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
        jSeparator22 = new javax.swing.JSeparator();
        btn_python = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        btn_showTree = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
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

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("UML");
        jt_arbolClases.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_arbolClases);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jd_python.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));

        tp_pyIDE.setBackground(new java.awt.Color(30, 31, 34));
        tp_pyIDE.setForeground(new java.awt.Color(187, 179, 172));
        jScrollPane2.setViewportView(tp_pyIDE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo en Python");

        btn_exitPython.setBackground(new java.awt.Color(38, 38, 38));
        btn_exitPython.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitPythonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitPythonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitPythonMouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("X");

        javax.swing.GroupLayout btn_exitPythonLayout = new javax.swing.GroupLayout(btn_exitPython);
        btn_exitPython.setLayout(btn_exitPythonLayout);
        btn_exitPythonLayout.setHorizontalGroup(
            btn_exitPythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_exitPythonLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(17, 17, 17))
        );
        btn_exitPythonLayout.setVerticalGroup(
            btn_exitPythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_exitPythonLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_exitPython, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_exitPython, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jd_pythonLayout = new javax.swing.GroupLayout(jd_python.getContentPane());
        jd_python.getContentPane().setLayout(jd_pythonLayout);
        jd_pythonLayout.setHorizontalGroup(
            jd_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_pythonLayout.setVerticalGroup(
            jd_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        m_menu.setText("jMenu1");

        mi_guardar.setText("Guardar");
        mi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarActionPerformed(evt);
            }
        });
        pp_menu.add(mi_guardar);

        mi_cargar.setText("Cargar");
        mi_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cargarActionPerformed(evt);
            }
        });
        pp_menu.add(mi_cargar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_UML.setBackground(new java.awt.Color(38, 38, 38));

        jPanel8.setBackground(new java.awt.Color(10, 10, 10));

        btn_archivo7.setBackground(new java.awt.Color(10, 10, 10));
        btn_archivo7.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_archivo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_archivo7MouseClicked(evt);
            }
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
        cb_fuente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_fuenteItemStateChanged(evt);
            }
        });
        tb_letras.add(cb_fuente);
        tb_letras.add(jSeparator1);

        cb_estilo.setBackground(new java.awt.Color(68, 68, 68));
        cb_estilo.setForeground(new java.awt.Color(255, 255, 255));
        cb_estilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Bold", "Italic", "Underline" }));
        cb_estilo.setSelectedIndex(-1);
        cb_estilo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_estiloItemStateChanged(evt);
            }
        });
        tb_letras.add(cb_estilo);
        tb_letras.add(jSeparator2);

        cb_size.setBackground(new java.awt.Color(68, 68, 68));
        cb_size.setForeground(new java.awt.Color(255, 255, 255));
        cb_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "48", "72" }));
        cb_size.setSelectedIndex(2);
        cb_size.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_sizeItemStateChanged(evt);
            }
        });
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
        btn_black.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_blackMouseClicked(evt);
            }
        });
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
        btn_bloodred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bloodredMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_bloodred);
        tb_colors1.add(jSeparator6);

        btn_red.setBackground(new java.awt.Color(255, 0, 0));
        btn_red.setFocusable(false);
        btn_red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_red.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_redMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_red);
        tb_colors1.add(jSeparator7);

        btn_orange.setBackground(new java.awt.Color(255, 102, 0));
        btn_orange.setFocusable(false);
        btn_orange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_orange.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_orangeMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_orange);
        tb_colors1.add(jSeparator8);

        btn_yellow.setBackground(new java.awt.Color(255, 255, 0));
        btn_yellow.setFocusable(false);
        btn_yellow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yellow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_yellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_yellowMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_yellow);
        tb_colors1.add(jSeparator9);

        btn_green.setBackground(new java.awt.Color(0, 153, 0));
        btn_green.setFocusable(false);
        btn_green.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_green.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_greenMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_green);
        tb_colors1.add(jSeparator10);

        btn_cyan.setBackground(new java.awt.Color(0, 162, 232));
        btn_cyan.setFocusable(false);
        btn_cyan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cyan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cyanMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_cyan);
        tb_colors1.add(jSeparator11);

        btn_blue.setBackground(new java.awt.Color(63, 72, 204));
        btn_blue.setFocusable(false);
        btn_blue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_blue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_blueMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_blue);
        tb_colors1.add(jSeparator12);

        btn_purple.setBackground(new java.awt.Color(204, 102, 255));
        btn_purple.setFocusable(false);
        btn_purple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_purple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_purple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_purpleMouseClicked(evt);
            }
        });
        tb_colors1.add(btn_purple);

        tb_colors2.setBackground(new java.awt.Color(54, 54, 54));
        tb_colors2.setBorderPainted(false);

        btn_white.setBackground(new java.awt.Color(255, 255, 255));
        btn_white.setFocusable(false);
        btn_white.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_white.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_white.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_whiteMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_white);
        tb_colors2.add(jSeparator13);

        btn_lightgray.setBackground(new java.awt.Color(204, 204, 204));
        btn_lightgray.setFocusable(false);
        btn_lightgray.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_lightgray.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_lightgray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_lightgrayMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_lightgray);
        tb_colors2.add(jSeparator14);

        btn_brown.setBackground(new java.awt.Color(153, 102, 0));
        btn_brown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_brown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_brown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_brownMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_brown);
        tb_colors2.add(jSeparator15);

        btn_pink.setBackground(new java.awt.Color(255, 153, 204));
        btn_pink.setFocusable(false);
        btn_pink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pink.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pinkMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_pink);
        tb_colors2.add(jSeparator16);

        btn_mango.setBackground(new java.awt.Color(255, 204, 0));
        btn_mango.setFocusable(false);
        btn_mango.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mango.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mangoMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_mango);
        tb_colors2.add(jSeparator17);

        btn_yellowopaque.setBackground(new java.awt.Color(239, 228, 176));
        btn_yellowopaque.setFocusable(false);
        btn_yellowopaque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_yellowopaque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_yellowopaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_yellowopaqueMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_yellowopaque);
        tb_colors2.add(jSeparator18);

        btn_limegreen.setBackground(new java.awt.Color(153, 255, 0));
        btn_limegreen.setFocusable(false);
        btn_limegreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_limegreen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_limegreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limegreenMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_limegreen);
        tb_colors2.add(jSeparator19);

        btn_opaquecyan.setBackground(new java.awt.Color(204, 255, 255));
        btn_opaquecyan.setFocusable(false);
        btn_opaquecyan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaquecyan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_opaquecyan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_opaquecyanMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_opaquecyan);
        tb_colors2.add(jSeparator20);

        btn_opaqueblue.setBackground(new java.awt.Color(0, 102, 153));
        btn_opaqueblue.setFocusable(false);
        btn_opaqueblue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaqueblue.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_opaqueblue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_opaqueblueMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_opaqueblue);
        tb_colors2.add(jSeparator21);

        btn_opaquepurple.setBackground(new java.awt.Color(204, 204, 255));
        btn_opaquepurple.setFocusable(false);
        btn_opaquepurple.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_opaquepurple.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_opaquepurple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_opaquepurpleMouseClicked(evt);
            }
        });
        tb_colors2.add(btn_opaquepurple);

        jSeparator22.setBackground(new java.awt.Color(68, 68, 68));
        jSeparator22.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_python.setBackground(new java.awt.Color(54, 54, 54));
        btn_python.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pythonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pythonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pythonMouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/Python logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Convertir ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("a Python");

        javax.swing.GroupLayout btn_pythonLayout = new javax.swing.GroupLayout(btn_python);
        btn_python.setLayout(btn_pythonLayout);
        btn_pythonLayout.setHorizontalGroup(
            btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pythonLayout.createSequentialGroup()
                .addGroup(btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_pythonLayout.setVerticalGroup(
            btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pythonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_ribbonMenuLayout = new javax.swing.GroupLayout(pn_ribbonMenu);
        pn_ribbonMenu.setLayout(pn_ribbonMenuLayout);
        pn_ribbonMenuLayout.setHorizontalGroup(
            pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addComponent(tb_letras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(214, 214, 214)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tb_colors1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(tb_colors2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_python, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
                        .addComponent(tb_letras, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tb_colors1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_colors2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_ribbonMenuLayout.createSequentialGroup()
                        .addComponent(btn_python, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator22))
                .addContainerGap())
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
                .addContainerGap(32, Short.MAX_VALUE))
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

        btn_showTree.setText("Ver Arbol");
        btn_showTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_showTreeMouseClicked(evt);
            }
        });

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
                    .addComponent(btn_nota, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btn_showTree, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(93, 93, 93)
                .addComponent(btn_showTree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(586, 431));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1200, 1200));

        jp_workArea.setBackground(new java.awt.Color(255, 255, 255));
        jp_workArea.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jp_workArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_workAreaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_workAreaLayout = new javax.swing.GroupLayout(jp_workArea);
        jp_workArea.setLayout(jp_workAreaLayout);
        jp_workAreaLayout.setHorizontalGroup(
            jp_workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jp_workAreaLayout.setVerticalGroup(
            jp_workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jp_workArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
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

    private void mi_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_pegarActionPerformed

        //Pegar el elemento copiado
        try {

            //toPasteFig = copiedSimps.get(copiedSimps.size() - 1);
            if (!copiedHerencias.isEmpty()) {

                InheritanceFigura toPasteInh = copiedHerencias.get(copiedHerencias.size() - 1);

                toPasteInh.addMouseListener(this);
                toPasteInh.addMouseMotionListener(this);

                jp_workArea.add(toPasteInh);
                toPasteInh.setLocation(jp_workArea.getWidth() / 2 + 10, jp_workArea.getHeight() / 2 + 10);
                copiedHerencias.remove(toPasteInh);

                jp_workArea.revalidate();
                jp_workArea.repaint();
            }
            if (!copiedAbstractos.isEmpty()) {

                AbstractaFigura toPasteAbs = copiedAbstractos.get(copiedAbstractos.size() - 1);

                toPasteAbs.addMouseListener(this);
                toPasteAbs.addMouseMotionListener(this);

                jp_workArea.add(toPasteAbs);
                toPasteAbs.setLocation(jp_workArea.getWidth() / 2 + 10, jp_workArea.getHeight() / 2 + 10);
                copiedAbstractos.remove(toPasteAbs);

                jp_workArea.revalidate();
                jp_workArea.repaint();
            }
            if (!copiedSimps.isEmpty()) {

                ClasseFigura toPasteSimp = copiedSimps.get(copiedSimps.size() - 1);

                toPasteSimp.addMouseListener(this);
                toPasteSimp.addMouseMotionListener(this);

                jp_workArea.add(toPasteSimp);
                toPasteSimp.setLocation(jp_workArea.getWidth() / 2 + 10, jp_workArea.getHeight() / 2 + 10);
                copiedSimps.remove(toPasteSimp);

                jp_workArea.revalidate();
                jp_workArea.repaint();
            }
            if (!copiedInterfaces.isEmpty()) {

                InterfazFigura toPasteInt = copiedInterfaces.get(copiedInterfaces.size() - 1);

                toPasteInt.addMouseListener(this);
                toPasteInt.addMouseMotionListener(this);

                jp_workArea.add(toPasteInt);
                toPasteInt.setLocation(jp_workArea.getWidth() / 2 + 10, jp_workArea.getHeight() / 2 + 10);
                copiedInterfaces.remove(toPasteInt);

                jp_workArea.revalidate();
                jp_workArea.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay nada copiado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mi_pegarActionPerformed

    private void btn_grayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grayMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_gray.getBackground());
        }
    }//GEN-LAST:event_btn_grayMouseClicked

    private void btn_bloodredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bloodredMouseClicked
        // TODO add your handling code here:

        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_bloodred.getBackground());
        }
    }//GEN-LAST:event_btn_bloodredMouseClicked

    private void btn_redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_redMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_red.getBackground());
        }
    }//GEN-LAST:event_btn_redMouseClicked

    private void btn_orangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orangeMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_orange.getBackground());
        }
    }//GEN-LAST:event_btn_orangeMouseClicked

    private void btn_yellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yellowMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_yellow.getBackground());
        }
    }//GEN-LAST:event_btn_yellowMouseClicked

    private void btn_greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_greenMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_green.getBackground());
        }
    }//GEN-LAST:event_btn_greenMouseClicked

    private void btn_cyanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cyanMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_cyan.getBackground());
        }
    }//GEN-LAST:event_btn_cyanMouseClicked

    private void btn_blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blueMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_blue.getBackground());
        }
    }//GEN-LAST:event_btn_blueMouseClicked

    private void btn_purpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_purpleMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_purple.getBackground());
        }
    }//GEN-LAST:event_btn_purpleMouseClicked

    private void btn_blackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blackMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_black.getBackground());
        }
    }//GEN-LAST:event_btn_blackMouseClicked

    private void btn_whiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_whiteMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_white.getBackground());
        }
    }//GEN-LAST:event_btn_whiteMouseClicked

    private void btn_lightgrayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lightgrayMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_lightgray.getBackground());
        }
    }//GEN-LAST:event_btn_lightgrayMouseClicked

    private void btn_brownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brownMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_brown.getBackground());
        }
    }//GEN-LAST:event_btn_brownMouseClicked

    private void btn_pinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pinkMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_pink.getBackground());
        }
    }//GEN-LAST:event_btn_pinkMouseClicked

    private void btn_mangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mangoMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_mango.getBackground());
        }
    }//GEN-LAST:event_btn_mangoMouseClicked

    private void btn_yellowopaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yellowopaqueMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_yellowopaque.getBackground());
        }
    }//GEN-LAST:event_btn_yellowopaqueMouseClicked

    private void btn_limegreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limegreenMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_limegreen.getBackground());
        }
    }//GEN-LAST:event_btn_limegreenMouseClicked

    private void btn_opaquecyanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaquecyanMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_opaquecyan.getBackground());
        }
    }//GEN-LAST:event_btn_opaquecyanMouseClicked

    private void btn_opaqueblueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaqueblueMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_opaqueblue.getBackground());
        }
    }//GEN-LAST:event_btn_opaqueblueMouseClicked

    private void btn_opaquepurpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaquepurpleMouseClicked
        if (currentSel instanceof ClasseFigura) {
            changeColor(currentSel, btn_opaquepurple.getBackground());
        }
    }//GEN-LAST:event_btn_opaquepurpleMouseClicked

    private void cb_fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fuenteItemStateChanged
        try {

            if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                // declara variables
                docTitle = currentSel.getTitulo().getStyledDocument();
                docText = currentSel.getTextA().getStyledDocument();
                styleTitle = currentSel.getTitulo().addStyle("myStyle", null);
                styleText = currentSel.getTextA().addStyle("myStyleText", null);

                // Asigna el font a la variable styleTitle
                StyleConstants.setFontFamily(styleTitle, cb_fuente.getSelectedItem().toString());

                //Cambia el font de "myStyle" al que se selecciono
                docTitle.setCharacterAttributes(0, docTitle.getLength(), styleTitle, true);

                //Asigna el font a la variable styleText
                StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                //Cambia el font de "myStyleText" al que se selecciono
                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                //Aplica el font a todos los miembros de la figura
                for (JTextPane miembro : currentSel.getAtributos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempStyleText = miembro.addStyle("myTempStyle", null);

                    StyleConstants.setFontFamily(tempStyleText, cb_fuente.getSelectedItem().toString());
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempStyleText, true);

                }
                for (JTextPane miembro : currentSel.getMetodos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempStyleText = miembro.addStyle("myTempStyle", null);

                    StyleConstants.setFontFamily(tempStyleText, cb_fuente.getSelectedItem().toString());
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempStyleText, true);

                }

                DatosClasse datos = convertirDatosSimp(currentSel);
                //datos.setFont(currentSel.getTitulo().getFont());

            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cb_fuenteItemStateChanged

    private void cb_estiloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_estiloItemStateChanged
        try {
            if (currentSel != null) {
                docTitle = currentSel.getTitulo().getStyledDocument();
                docText = currentSel.getTextA().getStyledDocument();
                styleTitle = currentSel.getTitulo().addStyle("myStyle", null);
                styleText = currentSel.getTextA().addStyle("myStyleText", null);

                //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                changeFont();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_cb_estiloItemStateChanged

    private void cb_sizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_sizeItemStateChanged

        try {
            if (currentSel != null) {
                docTitle = currentSel.getTitulo().getStyledDocument();
                docText = currentSel.getTextA().getStyledDocument();
                styleTitle = currentSel.getTitulo().addStyle("myStyle", null);
                styleText = currentSel.getTextA().addStyle("myStyleText", null);

                StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                docText.setCharacterAttributes(0,
                        docText.getLength(),
                        styleText,
                        true);

                for (JTextPane miembro : currentSel.getAtributos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempTextStlye = miembro.addStyle("myStyleText", null);

                    StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                }

                changeFont();

            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_cb_sizeItemStateChanged

    private void btn_pythonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseEntered
        btn_python.setBackground(new Color(68, 68, 68));
    }//GEN-LAST:event_btn_pythonMouseEntered

    private void btn_pythonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseExited
        btn_python.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_pythonMouseExited

    private void btn_pythonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseClicked

        int confirmacion = JOptionPane.showConfirmDialog(this, "Procedera a generarse codigo de python, verifique que todo este correcto");

        if (confirmacion == JOptionPane.YES_OPTION) {

            jd_python.pack();
            jd_python.setModal(true);
            jd_python.setLocationRelativeTo(this);
            jd_python.setVisible(true);

            if (currentSel != null) {
                try {
                    //generarArbol(currentSel);

                    Document doc = tp_pyIDE.getDocument();
                    try {
                        doc.remove(0, doc.getLength());
                    } catch (BadLocationException ex) {
                        Logger.getLogger(UML.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    DefaultTreeModel m = (DefaultTreeModel) jt_arbolClases.getModel();

                    DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

                    AdminTree tree = new AdminTree();
                    try {
                        tree.translate(raiz, tp_pyIDE);
                    } catch (BadLocationException ex) {

                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "seleccione la clase para generar codigo");
                }
            }
        }

        //m.reload();
    }//GEN-LAST:event_btn_pythonMouseClicked

    private void btn_exitPythonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPythonMouseClicked
        jd_python.setVisible(false);
    }//GEN-LAST:event_btn_exitPythonMouseClicked

    private void btn_exitPythonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPythonMouseEntered
        btn_exitPython.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_exitPythonMouseEntered

    private void btn_exitPythonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPythonMouseExited
        btn_exitPython.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_btn_exitPythonMouseExited

    private void btn_showTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showTreeMouseClicked
        jd_arbol.pack();
        jd_arbol.setModal(true);
        jd_arbol.setLocationRelativeTo(this);
        jd_arbol.setVisible(true);
    }//GEN-LAST:event_btn_showTreeMouseClicked

    private void mi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_guardarActionPerformed
        JFileChooser jfc = new JFileChooser();

        jfc.setCurrentDirectory(new File("C:\\Users\\carlo\\Desktop\\MiniPython Projects"));

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Archivos karu",
                "karu");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            try {
                File file = null;
                if (jfc.getFileFilter().getDescription().equals("Archivos karu")) {
                    file = new File(jfc.getSelectedFile().getPath());
                } else {
                    file = jfc.getSelectedFile();
                }
                fw = new FileOutputStream(file);
                bw = new ObjectOutputStream(fw);

                for (Object figura : Figuras) {

                    if (figura instanceof InheritanceFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Herenciafigura....");
                        
                        InheritanceFigura temp = (InheritanceFigura) figura;
                        
                        DatosInheritance dat = convertirDatosInh(temp);
                        
                        bw.writeObject(dat);
                        
                        bw.flush();
                        
                    } else if (figura instanceof AbstractaFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Abstractafigura....");
                        AbstractaFigura temp = (AbstractaFigura) figura;
                        DatosAbstract dat = convertirDatosAbs(temp);
                        bw.writeObject(dat);
                        bw.flush();

                    } else if (figura instanceof InterfazFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Interfazfigura....");
                        InterfazFigura temp = (InterfazFigura) figura;
                        DatosInterfaz dat = convertirDatosInt(temp);
                        bw.writeObject(dat);
                        bw.flush();

                    } else if (figura instanceof ClasseFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Simplefigura....");
                        ClasseFigura temp = (ClasseFigura) figura;
                        DatosClasse dat = convertirDatosSimp(temp);
                        bw.writeObject(dat);
                        bw.flush();
                    }

                }

                JOptionPane.showMessageDialog(this, "Guardado exitosamente!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error");
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_mi_guardarActionPerformed

    private void btn_archivo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivo7MouseClicked
        pp_menu.show(btn_archivo7, evt.getX(), evt.getY());
    }//GEN-LAST:event_btn_archivo7MouseClicked

    private void mi_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cargarActionPerformed
        File file = null;
        FileInputStream input = null;
        ObjectInputStream obj = null;

        try {
            JFileChooser jfc = new JFileChooser();

            jfc.setCurrentDirectory(new File("C:\\Users\\carlo\\Desktop\\MiniPython Projects"));

            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos karu", "karu");

            jfc.setFileFilter(filtro);

            int sel = jfc.showOpenDialog(this);

            if (sel == JFileChooser.APPROVE_OPTION) {
                file = jfc.getSelectedFile();
                input = new FileInputStream(file);
                obj = new ObjectInputStream(input);
                
                int wannaCopy = JOptionPane.showConfirmDialog(this, "Desea copiar el diagrama seleccionado a este proyecto?");
                
                if(wannaCopy != JOptionPane.YES_OPTION){
                    jp_workArea.removeAll();
                }
                

                try {
                    //continuar deserializando
                    while (true) {
                        Object objectDeserializado = obj.readObject();

                        if (objectDeserializado instanceof DatosInheritance) {
                            JOptionPane.showMessageDialog(this, "Deserializando Herenciafigura....");
                            DatosInheritance tempClass = (DatosInheritance) objectDeserializado;
                            InheritanceFigura clas = datosToFigInh(tempClass);

                            clas.addMouseListener(this);
                            clas.addMouseMotionListener(this);

                            deserializedFiguras.add(clas);
//                            jp_workArea.add(clas);

                        } else if (objectDeserializado instanceof DatosAbstract) {
                            JOptionPane.showMessageDialog(this, "Deserializando Abstractfigura....");
                            DatosAbstract tempClass = (DatosAbstract) objectDeserializado;
                            AbstractaFigura clas = datosToFigAbs(tempClass);
                            clas.setLocation(ajustarPosicion(clas.getLocation(), jp_workArea.getSize(), clas.getSize()));

                            clas.addMouseListener(this);
                            clas.addMouseMotionListener(this);

                            deserializedFiguras.add(clas);
//                            jp_workArea.add(clas);
                        } else if (objectDeserializado instanceof DatosInterfaz) {
                            JOptionPane.showMessageDialog(this, "Deserializando Interfazfigura....");
                            DatosInterfaz tempClass = (DatosInterfaz) objectDeserializado;
                            InterfazFigura clas = datosToFigInt(tempClass);
                            clas.setLocation(ajustarPosicion(clas.getLocation(), jp_workArea.getSize(), clas.getSize()));

                            clas.addMouseListener(this);
                            clas.addMouseMotionListener(this);

                            deserializedFiguras.add(clas);
//                            jp_workArea.add(clas);
                        } else if (objectDeserializado instanceof DatosClasse) {
                            JOptionPane.showMessageDialog(this, "Deserializando Simpfigura....");
                            DatosClasse tempClass = (DatosClasse) objectDeserializado;
                            ClasseFigura clas = datosToFig(tempClass);
                            clas.setLocation(ajustarPosicion(clas.getLocation(), jp_workArea.getSize(), clas.getSize()));

                            clas.addMouseListener(this);
                            clas.addMouseMotionListener(this);

                            deserializedFiguras.add(clas);
//                            jp_workArea.add(clas);
                        }

                    }
                } catch (EOFException e) {
                    //llega al final del archivo
                }
                for (Object desFig : deserializedFiguras) {
                    if (desFig instanceof InheritanceFigura) {
                        InheritanceFigura temp = (InheritanceFigura) desFig;
                        temp.setLocation(ajustarPosicion(temp.getLocation(), jp_workArea.getSize(), temp.getSize()));

                        jp_workArea.add(temp);
                        temp.revalidate();
                        temp.repaint();
                        temp.setVisible(true);
                        jp_workArea.revalidate();
                        jp_workArea.repaint();
                    } else if (desFig instanceof AbstractaFigura) {
                        AbstractaFigura temp = (AbstractaFigura) desFig;
                        temp.setLocation(ajustarPosicion(temp.getLocation(), jp_workArea.getSize(), temp.getSize()));

                        jp_workArea.add(temp);
                        temp.revalidate();
                        temp.repaint();
                        temp.setVisible(true);
                        jp_workArea.revalidate();
                        jp_workArea.repaint();
                    } else if (desFig instanceof InterfazFigura) {
                        InterfazFigura temp = (InterfazFigura) desFig;
                        temp.setLocation(ajustarPosicion(temp.getLocation(), jp_workArea.getSize(), temp.getSize()));

                        jp_workArea.add(temp);
                        temp.revalidate();
                        temp.repaint();
                        temp.setVisible(true);
                        jp_workArea.revalidate();
                        jp_workArea.repaint();
                    } else if (desFig instanceof ClasseFigura) {
                        ClasseFigura temp = (ClasseFigura) desFig;
                        temp.setLocation(ajustarPosicion(temp.getLocation(), jp_workArea.getSize(), temp.getSize()));

                        jp_workArea.add(temp);
                        temp.revalidate();
                        temp.repaint();
                        temp.setVisible(true);
                        jp_workArea.revalidate();
                        jp_workArea.repaint();
                    }
                }

                System.out.println(deserializedFiguras);
                JOptionPane.showMessageDialog(this, jp_workArea.getComponentCount());

                for (Component component : jp_workArea.getComponents()) {
                    seleccion((ClasseFigura) component, true);
                }
                jp_workArea.revalidate();
                jp_workArea.repaint();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar archivo");
            e.printStackTrace();
        }

        try {
            input.close();
            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mi_cargarActionPerformed

    private void jp_workAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_workAreaMouseClicked
        if(evt.isMetaDown()){
            pm_menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jp_workAreaMouseClicked

    // metodos personales
    //posicion
    public Point ajustarPosicion(Point original, Dimension panelSize, Dimension componentSize) {
        int maxX = panelSize.width - componentSize.width;
        int maxY = panelSize.height - componentSize.height;

        int x = original.x;
        int y = original.y;

        if (x > maxX) {
            x = maxX;
        }
        if (y > maxY) {
            y = maxY;
        }

        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }

        return new Point(x, y);
    }

    //metodos para deserializar
    public ClasseFigura datosToFig(DatosClasse c) {

        ClasseFigura clasSimp = new ClasseFigura(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), f, c.getColor());
        clasSimp.remove(clasSimp.getTextA());
        clasSimp.remove(clasSimp.getTextM());

        clasSimp.getTitulo().setText(c.getTitulo());
        clasSimp.getTitulo().setBackground(c.getColor());

        /*
        Style newStyle = clasSimp.getTitulo().addStyle("newStlye", null);
        StyleConstants.setFontFamily(newStyle, c.getFontFamily());
        StyleConstants.setFontSize(newStyle, c.getFontSize());
        
        
        StyledDocument doc = clasSimp.getTitulo().getStyledDocument();
        doc.setCharacterAttributes(0, doc.getLength(), newStyle, false);*/
        //clasSimp.getTitulo().setStyledDocument(newStyle);
        changeColor(clasSimp, c.getColor());
        //clasSimp.getTextA().setText(c.getT);

        for (String atributo : c.getAtributos()) {
            JTextPane atr = new JTextPane();
            atr.setText(atributo);
            atr.setFont(c.getFont());
            atr.setForeground(c.getFontColor());
            clasSimp.getAtributos().add(atr);
        }
        for (String metodo : c.getMetodos()) {
            JTextPane met = new JTextPane();
            met.setText(metodo);
            met.setFont(c.getFont());
            met.setForeground(c.getFontColor());
            clasSimp.getMetodos().add(met);
        }

        for (JTextPane atributo : clasSimp.getAtributos()) {
            clasSimp.add(atributo);
        }
        for (JTextPane metodo : clasSimp.getMetodos()) {
            clasSimp.add(metodo);
        }

        return clasSimp;
    }

    public InheritanceFigura datosToFigInh(DatosInheritance c) {

        JTextPane tempTA = new JTextPane();
        tempTA.setText(c.gettA());

        InheritanceFigura clasSimp = new InheritanceFigura(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), f, tempTA, c.getColor());

        clasSimp.remove(clasSimp.getTextA());
        clasSimp.remove(clasSimp.getTextM());
        

        clasSimp.getTitulo().setText(c.getTitulo());
        clasSimp.getTitulo().setBackground(c.getColor());
        
        JOptionPane.showMessageDialog(this, textPadre);

        
//        clasSimp.getTit().setText(textPadre.get(0));
//        textPadre.remove(0);
        /*
        Style newStyle = clasSimp.getTitulo().addStyle("newStlye", null);
        StyleConstants.setFontFamily(newStyle, c.getFontFamily());
        StyleConstants.setFontSize(newStyle, c.getFontSize());
        
        
        StyledDocument doc = clasSimp.getTitulo().getStyledDocument();
        doc.setCharacterAttributes(0, doc.getLength(), newStyle, false);*/
        //clasSimp.getTitulo().setStyledDocument(newStyle);
        changeColor(clasSimp, c.getColor());
        //clasSimp.getTextA().setText(c.getT);

        for (String atributo : c.getAtributos()) {
            JTextPane atr = new JTextPane();
            atr.setText(atributo);
            atr.setFont(c.getFont());
            atr.setForeground(c.getFontColor());
            clasSimp.getAtributos().add(atr);
        }
        for (String metodo : c.getMetodos()) {
            JTextPane met = new JTextPane();
            met.setText(metodo);
            met.setFont(c.getFont());
            met.setForeground(c.getFontColor());
            clasSimp.getMetodos().add(met);
        }

        for (JTextPane atributo : clasSimp.getAtributos()) {
            clasSimp.add(atributo);
        }
        for (JTextPane metodo : clasSimp.getMetodos()) {
            clasSimp.add(metodo);
        }

        return clasSimp;
    }

    public AbstractaFigura datosToFigAbs(DatosAbstract c) {

        AbstractaFigura clasSimp = new AbstractaFigura(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), f, c.getColor());
        clasSimp.remove(clasSimp.getTextA());
        clasSimp.remove(clasSimp.getTextM());

        clasSimp.getTitulo().setText(c.getTitulo());
        clasSimp.getTitulo().setBackground(c.getColor());

        /*
        Style newStyle = clasSimp.getTitulo().addStyle("newStlye", null);
        StyleConstants.setFontFamily(newStyle, c.getFontFamily());
        StyleConstants.setFontSize(newStyle, c.getFontSize());
        
        
        StyledDocument doc = clasSimp.getTitulo().getStyledDocument();
        doc.setCharacterAttributes(0, doc.getLength(), newStyle, false);*/
        //clasSimp.getTitulo().setStyledDocument(newStyle);
        changeColor(clasSimp, c.getColor());
        //clasSimp.getTextA().setText(c.getT);

        for (String atributo : c.getAtributos()) {
            JTextPane atr = new JTextPane();
            atr.setText(atributo);
            atr.setFont(c.getFont());
            atr.setForeground(c.getFontColor());
            clasSimp.getAtributos().add(atr);
        }
        for (String metodo : c.getMetodos()) {
            JTextPane met = new JTextPane();
            met.setText(metodo);
            met.setFont(c.getFont());
            met.setForeground(c.getFontColor());
            clasSimp.getMetodos().add(met);
        }

        for (JTextPane atributo : clasSimp.getAtributos()) {
            clasSimp.add(atributo);
        }
        for (JTextPane metodo : clasSimp.getMetodos()) {
            clasSimp.add(metodo);
        }

        return clasSimp;
    }

    public InterfazFigura datosToFigInt(DatosInterfaz c) {

        InterfazFigura clasSimp = new InterfazFigura(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), f, c.getColor());
        clasSimp.remove(clasSimp.getTextA());
        clasSimp.remove(clasSimp.getTextM());

        clasSimp.getTitulo().setText(c.getTitulo());
        clasSimp.getTitulo().setBackground(c.getColor());

        /*
        Style newStyle = clasSimp.getTitulo().addStyle("newStlye", null);
        StyleConstants.setFontFamily(newStyle, c.getFontFamily());
        StyleConstants.setFontSize(newStyle, c.getFontSize());
        
        
        StyledDocument doc = clasSimp.getTitulo().getStyledDocument();
        doc.setCharacterAttributes(0, doc.getLength(), newStyle, false);*/
        //clasSimp.getTitulo().setStyledDocument(newStyle);
        changeColor(clasSimp, c.getColor());
        //clasSimp.getTextA().setText(c.getT);

        for (String atributo : c.getAtributos()) {
            JTextPane atr = new JTextPane();
            atr.setText(atributo);
            atr.setFont(c.getFont());
            atr.setForeground(c.getFontColor());
            clasSimp.getAtributos().add(atr);
        }
        for (String metodo : c.getMetodos()) {
            JTextPane met = new JTextPane();
            met.setText(metodo);
            met.setFont(c.getFont());
            met.setForeground(c.getFontColor());
            clasSimp.getMetodos().add(met);
        }

        for (JTextPane atributo : clasSimp.getAtributos()) {
            clasSimp.add(atributo);
        }
        for (JTextPane metodo : clasSimp.getMetodos()) {
            clasSimp.add(metodo);
        }

        return clasSimp;
    }

    //metodos para serializar
    public DatosInterfaz convertirDatosInt(InterfazFigura c) {

        DatosInterfaz datos = new DatosInterfaz(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), c.getTitulo().getText(), c.getTitleBG().getBackground());

        datos.setFontColor(c.getFontColor());
        Style styleTit = c.getTitulo().getStyle("myStyle");

        //Style styleText = c.getTextA().getStyle("myStileText");
        if (styleTit != null) {
            datos.setFontFamily(StyleConstants.getFontFamily(styleTit));
            datos.setFontSize(StyleConstants.getFontSize(styleTit));
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));
        }

        /*if(styleText != null){
            datos.setFontAtrFamily(StyleConstants.getFontFamily(styleText));
            datos.setFontAtrSize(StyleConstants.getFontSize(styleText));
            
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));*
        }*/
        datos.setFont(c.getTitulo().getFont());

        for (JTextPane atributo : c.getAtributos()) {

            Style tempStyleText = atributo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }

            datos.getAtributos().add(atributo.getText());
        }
        for (JTextPane metodo : c.getMetodos()) {

            Style tempStyleText = metodo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }
            datos.getMetodos().add(metodo.getText());
        }

        return datos;
    }

    public DatosInheritance convertirDatosInh(InheritanceFigura c) {

        DatosInheritance datos = new DatosInheritance(
                c.getSizeX(),
                c.getSizeY(),
                c.getLocX(),
                c.getLocY(),
                c.getTitulo().getText(),
                c.getTit().getText(),
                c.getTitleBG().getBackground());
        
        datos.settA(c.getTit().getText());
        
        textPadre.add(c.gettA().getText());
        
        //JOptionPane.showMessageDialog(this, c.gettA().getText());

        datos.setFontColor(c.getFontColor());
        Style styleTit = c.getTitulo().getStyle("myStyle");

        //Style styleText = c.getTextA().getStyle("myStileText");
        if (styleTit != null) {
            datos.setFontFamily(StyleConstants.getFontFamily(styleTit));
            datos.setFontSize(StyleConstants.getFontSize(styleTit));
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));
        }

        /*if(styleText != null){
            datos.setFontAtrFamily(StyleConstants.getFontFamily(styleText));
            datos.setFontAtrSize(StyleConstants.getFontSize(styleText));
            
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));*
        }*/
        datos.setFont(c.getTitulo().getFont());

        for (JTextPane atributo : c.getAtributos()) {

            Style tempStyleText = atributo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }

            datos.getAtributos().add(atributo.getText());
        }
        for (JTextPane metodo : c.getMetodos()) {

            Style tempStyleText = metodo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }
            datos.getMetodos().add(metodo.getText());
        }

        return datos;
    }

    public DatosAbstract convertirDatosAbs(AbstractaFigura c) {

        DatosAbstract datos = new DatosAbstract(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), c.getTitulo().getText(), c.getTitleBG().getBackground());

        datos.setFontColor(c.getFontColor());
        Style styleTit = c.getTitulo().getStyle("myStyle");

        //Style styleText = c.getTextA().getStyle("myStileText");
        if (styleTit != null) {
            datos.setFontFamily(StyleConstants.getFontFamily(styleTit));
            datos.setFontSize(StyleConstants.getFontSize(styleTit));
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));
        }

        /*if(styleText != null){
            datos.setFontAtrFamily(StyleConstants.getFontFamily(styleText));
            datos.setFontAtrSize(StyleConstants.getFontSize(styleText));
            
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));*
        }*/
        datos.setFont(c.getTitulo().getFont());

        for (JTextPane atributo : c.getAtributos()) {

            Style tempStyleText = atributo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }

            datos.getAtributos().add(atributo.getText());
        }
        for (JTextPane metodo : c.getMetodos()) {

            Style tempStyleText = metodo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }
            datos.getMetodos().add(metodo.getText());
        }

        return datos;
    }

    public DatosClasse convertirDatosSimp(ClasseFigura c) {

        DatosClasse datos = new DatosClasse(c.getSizeX(), c.getSizeY(), c.getLocX(), c.getLocY(), c.getTitulo().getText(), c.getTitleBG().getBackground());

        datos.setFontColor(c.getFontColor());
        Style styleTit = c.getTitulo().getStyle("myStyle");

        //Style styleText = c.getTextA().getStyle("myStileText");
        if (styleTit != null) {
            datos.setFontFamily(StyleConstants.getFontFamily(styleTit));
            datos.setFontSize(StyleConstants.getFontSize(styleTit));
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));
        }

        /*if(styleText != null){
            datos.setFontAtrFamily(StyleConstants.getFontFamily(styleText));
            datos.setFontAtrSize(StyleConstants.getFontSize(styleText));
            
            datos.setFgColor(StyleConstants.getForeground(styleTit));
            datos.setBgColor(StyleConstants.getBackground(styleTit));*
        }*/
        datos.setFont(c.getTitulo().getFont());

        for (JTextPane atributo : c.getAtributos()) {

            Style tempStyleText = atributo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }

            datos.getAtributos().add(atributo.getText());
        }
        for (JTextPane metodo : c.getMetodos()) {

            Style tempStyleText = metodo.getStyle("myStyleText");

            if (tempStyleText != null) {
                datos.setFontAtrFamily(StyleConstants.getFontFamily(tempStyleText));
                datos.setFontAtrSize(StyleConstants.getFontSize(tempStyleText));
            }
            datos.getMetodos().add(metodo.getText());
        }

        return datos;
    }

    //metodos para crear figuras
    public void createInheritance(ClasseFigura selected) {

        InheritanceFigura herencia = new InheritanceFigura(
                200,
                150,
                selected.getX(),
                selected.getY() + 30,
                f,
                selected.getTitulo(),
                new Color(70, 114, 196));

        if (selected instanceof AbstractaFigura) {

            for (JTextPane metodo : selected.getMetodos()) {
                if (metodo.getText().contains("@")) {
                    JTextPane copiedMethod = new JTextPane();
                    copiedMethod.setText(metodo.getText());

                    herencia.add(copiedMethod);
                }

            }

        } else if (selected instanceof InterfazFigura) {
            for (JTextPane metodo : selected.getMetodos()) {
                if (metodo.getText().contains("@")) {
                    JTextPane copiedMethod = new JTextPane();
                    copiedMethod.setText(metodo.getText());
                    //copiedMethod.setBounds(metodo.getX(), metodo.getY() + 10, metodo.getWidth(), metodo.getHeight());

                    herencia.add(copiedMethod);
                    //herencia.setSizeY(herencia.getSizeY() + 30);
                }

            }
        }

        herencia.setClasePadre(selected);

        //Agregar mouseListeners
        herencia.addMouseListener(this);
        herencia.addMouseMotionListener(this);

        Figuras.add(herencia);

        jp_workArea.add(herencia);

        herencia.revalidate();
        jp_workArea.repaint();

    }

    public void createClase() {

        ClasseFigura clase = new ClasseFigura(
                200,
                150,
                jp_workArea.getWidth(),
                jp_workArea.getHeight(),
                f,
                new Color(70, 114, 196));

        //Agregar mouseListeners
        clase.addMouseListener(this);
        clase.addMouseMotionListener(this);

        Figuras.add(clase);
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
                f, new Color(70, 114, 196));

        //Agregar mouseListeners
        abs.addMouseListener(this);
        abs.addMouseMotionListener(this);

        Figuras.add(abs);
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
                f, new Color(70, 114, 196));

        interfaz.getTextM().setText("@NombreMetodo");

        //Agregar mouseListeners
        interfaz.addMouseListener(this);
        interfaz.addMouseMotionListener(this);

        Figuras.add(interfaz);
        jp_workArea.add(interfaz);

        interfaz.revalidate();
        jp_workArea.repaint();

    }

    //mestos para arbol
    public void generarArbol(ClasseFigura clase) {
        //Arbol para generar codigo
        DefaultTreeModel modelo = (DefaultTreeModel) jt_arbolClases.getModel();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();

        //Nombre de la clase
        JTextPane tP = (JTextPane) clase.getTitulo();
        JLabel jl = (JLabel) clase.getTit();
        String classTit = tP.getText();
        String inheritClass = jl.getText();
        ClasseFigura clasePadre = null;

        if (clase instanceof InheritanceFigura) {
            classTit = "Herencia: " + classTit + "(" + inheritClass + ")";
        } else if (clase instanceof AbstractaFigura) {
            classTit = "Abstracta: " + classTit;
        } else if (clase instanceof InterfazFigura) {
            classTit = "Interfaz: " + classTit;
        } else if (clase instanceof ClasseFigura) {
            classTit = "Simple: " + classTit;
        }

        DefaultMutableTreeNode className = new DefaultMutableTreeNode(classTit);

        //nodos atributo y metodo como hijos de la clase
        DefaultMutableTreeNode classAttributes = new DefaultMutableTreeNode("Atributos");

        DefaultMutableTreeNode classMethods = new DefaultMutableTreeNode("Metodos");

        //agrega a la raiz 
        if (clase instanceof InheritanceFigura) {
            clasePadre = ((InheritanceFigura) clase).getClasePadre();
            DefaultMutableTreeNode parentClass = new DefaultMutableTreeNode(clasePadre.getTitulo().getText());
            DefaultMutableTreeNode parentClassAtr = new DefaultMutableTreeNode("Atributos Padre");
            DefaultMutableTreeNode parentClassMet = new DefaultMutableTreeNode("Metodos Padre");

            root.add(className);
            parentClass.add(parentClassAtr);
            parentClass.add(parentClassMet);
            className.add(parentClass);

            for (JTextPane atributo : clasePadre.getAtributos()) {
                DefaultMutableTreeNode atr = new DefaultMutableTreeNode(atributo.getText());
                parentClassAtr.add(atr);
            }
            for (JTextPane metodo : clasePadre.getMetodos()) {
                if (metodo.getText().contains("@")) {
                    DefaultMutableTreeNode met = new DefaultMutableTreeNode(metodo.getText());
                    parentClassMet.add(met);
                }

            }

            className.add(classAttributes);
            className.add(classMethods);
        } else {
            root.add(className);
            className.add(classAttributes);
            className.add(classMethods);
        }

        //agrega atributos y metodos a sus respectivos nodos
        for (JTextPane atributo : clase.getAtributos()) {
            DefaultMutableTreeNode atr = new DefaultMutableTreeNode(atributo.getText());
            classAttributes.add(atr);
        }
        for (JTextPane metodo : clase.getMetodos()) {
            DefaultMutableTreeNode met = new DefaultMutableTreeNode(metodo.getText());
            classMethods.add(met);
        }

        modelo.reload();
    }

    public void eliminarNodo(ClasseFigura c) {
        DefaultTreeModel m = (DefaultTreeModel) jt_arbolClases.getModel();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) m.getRoot();

        JTextPane tP = (JTextPane) c.getTitulo();
        JLabel jl = (JLabel) c.getTit();

        String figToDelete = "";
        String inheritClass = jl.getText();

        if (c instanceof InheritanceFigura) {
            figToDelete = "Herencia: " + tP.getText() + "(" + inheritClass + ")";
        } else if (c instanceof AbstractaFigura) {
            figToDelete = "Abstracta: " + tP.getText();
        } else if (c instanceof InterfazFigura) {
            figToDelete = "Interfaz: " + tP.getText();
        } else if (c instanceof ClasseFigura) {
            figToDelete = "Simple: " + tP.getText();
        }

        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode tempNode = (DefaultMutableTreeNode) root.getChildAt(i);

            if (tempNode.getUserObject().equals(figToDelete)) {
                tempNode.removeFromParent();
                //JOptionPane.showMessageDialog(this, "Eliminado del arbol!");
                break;
            }
        }

        m.reload();

    }

    //metodos para seleccion, color de figura y fuente
    public void seleccion(ClasseFigura selected, boolean isClicked) {

        if (isClicked) {
            Border borde = BorderFactory.createLineBorder(new Color(147, 147, 147), 1);
            selected.setBorder(borde);
        } else {
            selected.setBorder(null);
        }

    }

    public void changeColor(ClasseFigura c, Color color) {
        c.getTitleBG().setBackground(color);
        c.getTitulo().setBackground(color);

        if (color.equals(btn_black.getBackground())
                || color.equals(btn_bloodred.getBackground())
                || color.equals(btn_blue.getBackground())
                || color.equals(btn_brown.getBackground())
                || color.equals(btn_opaqueblue.getBackground())) {

            c.getTit().setForeground(new Color(255, 255, 255));
            c.getTitulo().setForeground(new Color(255, 255, 255));

        } else {
            c.getTit().setForeground(new Color(0, 0, 0));
            c.getTitulo().setForeground(new Color(0, 0, 0));

        }
    }

    public void changeFont() {

        int selectedStlye = cb_estilo.getSelectedIndex();
        switch (selectedStlye) {

            case 0:
                int writtenLength = docText.getLength();
                int writtenLengthTit = docTitle.getLength();

                /*
                for (int i = 0; i < writtenLengthTit; i++) {
                    Element element = docText.getCharacterElement(i);
                    AttributeSet attrs = element.getAttributes();

                    //Titulo
                    
                    if (StyleConstants.isBold(attrs)) {
                        StyleConstants.setBold(styleTitle, false);
                        docTitle.setCharacterAttributes(0,
                                docTitle.getLength(),
                                styleTitle,
                                true);
                    }
                    if (StyleConstants.isItalic(attrs)) {
                        StyleConstants.setItalic(styleTitle, false);
                        docTitle.setCharacterAttributes(0,
                                docTitle.getLength(),
                                styleTitle,
                                true);

                    }
                    if (StyleConstants.isUnderline(attrs)) {
                        StyleConstants.setUnderline(styleTitle, false);
                        docTitle.setCharacterAttributes(0,
                                docTitle.getLength(),
                                styleTitle,
                                true);

                    }
                }*/
                //Texto
                for (int i = 0; i < writtenLength; i++) {
                    Element element = docText.getCharacterElement(i);
                    AttributeSet attrs = element.getAttributes();

                    if (StyleConstants.isBold(attrs)) {
                        StyleConstants.setBold(styleText, false);
                        StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                        docText.setCharacterAttributes(0,
                                docText.getLength(),
                                styleText,
                                true);

                        for (JTextPane miembro : currentSel.getAtributos()) {
                            StyledDocument tempDocText = miembro.getStyledDocument();
                            Style tempTextStlye = miembro.addStyle("myStyleText", null);

                            StyleConstants.setBold(tempTextStlye, false);
                            StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                        }

                    }
                    if (StyleConstants.isItalic(attrs)) {
                        StyleConstants.setItalic(styleText, false);
                        StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                        docText.setCharacterAttributes(0,
                                docText.getLength(),
                                styleText,
                                true);

                        for (JTextPane miembro : currentSel.getAtributos()) {
                            StyledDocument tempDocText = miembro.getStyledDocument();
                            Style tempTextStlye = miembro.addStyle("myStyleText", null);

                            StyleConstants.setItalic(tempTextStlye, false);
                            StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                        }

                    }
                    if (StyleConstants.isUnderline(attrs)) {
                        StyleConstants.setUnderline(styleText, false);
                        StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                        docText.setCharacterAttributes(0,
                                docText.getLength(),
                                styleText,
                                true);

                        for (JTextPane miembro : currentSel.getAtributos()) {
                            StyledDocument tempDocText = miembro.getStyledDocument();
                            Style tempTextStlye = miembro.addStyle("myStyleText", null);

                            StyleConstants.setUnderline(tempTextStlye, false);
                            StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                        }

                    }
                }

                break;

            case 1:
                StyleConstants.setBold(styleText, true);
                //StyleConstants.setBold(styleTitle, true);
                StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                docText.setCharacterAttributes(0,
                        docText.getLength(),
                        styleText,
                        true);

                //docTitle.setCharacterAttributes(0, docTitle.getLength(), styleTitle, true);
                for (JTextPane miembro : currentSel.getAtributos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempTextStlye = miembro.addStyle("myStyleText", null);

                    StyleConstants.setBold(tempTextStlye, true);
                    StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                }
                break;

            case 2:
                StyleConstants.setItalic(styleText, true);
                //StyleConstants.setItalic(styleTitle, true);
                StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                docText.setCharacterAttributes(0,
                        docText.getLength(),
                        styleText,
                        true);

                //docTitle.setCharacterAttributes(0,docTitle.getLength(),styleTitle,true);
                for (JTextPane miembro : currentSel.getAtributos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempTextStlye = miembro.addStyle("myStyleText", null);

                    StyleConstants.setItalic(tempTextStlye, true);
                    StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                }
                break;

            case 3:
                StyleConstants.setUnderline(styleText, true);
                //StyleConstants.setUnderline(styleTitle, true);
                StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                docText.setCharacterAttributes(0,
                        docText.getLength(),
                        styleText,
                        true);

                //docTitle.setCharacterAttributes(0,docTitle.getLength(),styleTitle,true);
                for (JTextPane miembro : currentSel.getAtributos()) {
                    StyledDocument tempDocText = miembro.getStyledDocument();
                    Style tempTextStlye = miembro.addStyle("myStyleText", null);

                    StyleConstants.setUnderline(tempTextStlye, true);
                    StyleConstants.setFontSize(tempTextStlye, Integer.parseInt(cb_size.getSelectedItem().toString()));
                    tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
                }
                break;
            default:

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

    //variables globales
    Font f = new Font("Title", 1, 16);
    Point startPoint;
    ClasseFigura currentSel = null;
    ArrayList<ClasseFigura> copiedSimps = new ArrayList<>();
    ArrayList<InheritanceFigura> copiedHerencias = new ArrayList<>();
    ArrayList<AbstractaFigura> copiedAbstractos = new ArrayList<>();
    ArrayList<InterfazFigura> copiedInterfaces = new ArrayList<>();
    ArrayList Figuras = new ArrayList();
    ArrayList deserializedFiguras = new ArrayList();
    //ArrayList<JTextPane> miembros = new ArrayList<>();
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    StyledDocument docTitle, docText;
    Style styleTitle, styleText;
    
    ArrayList<String>textPadre = new ArrayList<>();


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
    private javax.swing.JPanel btn_exitPython;
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
    private javax.swing.JPanel btn_python;
    private javax.swing.JButton btn_red;
    private javax.swing.JButton btn_showTree;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JDialog jd_arbol;
    private javax.swing.JDialog jd_python;
    private javax.swing.JPanel jp_workArea;
    private javax.swing.JTree jt_arbolClases;
    private javax.swing.JMenu m_menu;
    private javax.swing.JMenuItem mi_cargar;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_help;
    private javax.swing.JMenuItem mi_pegar;
    private javax.swing.JPopupMenu pm_menu;
    private javax.swing.JPanel pn_formasMenu;
    private javax.swing.JPanel pn_ribbonMenu;
    private javax.swing.JPopupMenu pp_menu;
    private javax.swing.JToolBar tb_colors1;
    private javax.swing.JToolBar tb_colors2;
    private javax.swing.JToolBar tb_letras;
    private javax.swing.JTextPane tp_pyIDE;
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

                JMenuItem addAttribute = new JMenuItem("Agregar atributo");
                JMenuItem addMethod = new JMenuItem("Agregar metodo");
                JMenuItem makeInheritance = new JMenuItem("Crear clase hija");
                JMenuItem loadTree = new JMenuItem("Actualizar arbol");
                JMenu properties = new JMenu("Propiedades de la figura");
                JMenuItem changeFontColor = new JMenuItem("Cambiar color");
                JMenuItem changeFontHighlight = new JMenuItem("Subrayar");

                JMenuItem copy = new JMenuItem("Copiar");
                JMenuItem modify = new JMenuItem("Modificar");
                JMenuItem delete = new JMenuItem("Eliminar");
                JMenuItem help = new JMenuItem("Ayuda");

                JSeparator separador = new JSeparator(SwingUtilities.HORIZONTAL);
                JSeparator separador2 = new JSeparator(SwingUtilities.HORIZONTAL);
                JSeparator separador3 = new JSeparator(SwingUtilities.HORIZONTAL);
                JSeparator separador4 = new JSeparator(SwingUtilities.HORIZONTAL);

                properties.add(loadTree);
                properties.add(separador4);
                properties.add(addAttribute);
                properties.add(addMethod);
                properties.add(separador2);
                properties.add(changeFontColor);
                properties.add(changeFontHighlight);

                //Agrega el pop menu y los items
                JPopupMenu rCMenu = new JPopupMenu();
                rCMenu.add(properties);
                rCMenu.add(makeInheritance);
                rCMenu.add(separador);

                rCMenu.add(copy);
                rCMenu.add(modify);
                rCMenu.add(delete);
                rCMenu.add(separador3);
                rCMenu.add(help);

                //agrega los actionlisteners de cada menuitem
                // Agregar atributos
                addAttribute.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof ClasseFigura) {

                            ClasseFigura selected = (ClasseFigura) source;

                            eliminarNodo(selected);

                            JTextPane newAttribute = new JTextPane();
                            newAttribute.setSize(selected.getTextA().getWidth(), selected.getTextA().getHeight());

                            newAttribute.setText("NombreAtributo");
                            selected.add(newAttribute);
                            selected.getAtributos().add(newAttribute);
                            selected.setSize(selected.getWidth(), selected.getHeight() + 40);
                            selected.repaint();

                            jp_workArea.revalidate();
                            jp_workArea.repaint();
                        }

                    }
                });

                //cargar arbol
                loadTree.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            ClasseFigura figToLoad = (ClasseFigura) currentSel;

                            generarArbol(figToLoad);

                            JOptionPane.showMessageDialog(bg_UML, "Se ha cargado la informacion exitosamente!");
                        } catch (NullPointerException ex) {
                            JOptionPane.showMessageDialog(bg_UML, "Seleccione primero la figura que desea cargar", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

                //Agregar metodos
                addMethod.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ClasseFigura selected = (ClasseFigura) source;

                        eliminarNodo(selected);

                        JTextPane newMethod = new JTextPane();
                        newMethod.setSize(selected.getTextM().getWidth(), selected.getTextM().getHeight());

                        if (selected instanceof AbstractaFigura) {
                            int op = JOptionPane.showConfirmDialog(jp_workArea, "Desea que este metodo sea abstracto?");

                            if (op == JOptionPane.YES_OPTION) {
                                newMethod.setText("@NombreMetodo");
                                selected.add(newMethod);
                                selected.getMetodos().add(newMethod);
                                selected.setSize(selected.getWidth(), selected.getHeight() + 40);
                                selected.repaint();
                            } else {
                                newMethod.setText("NombreMetodo");
                                selected.add(newMethod);
                                selected.getMetodos().add(newMethod);
                                selected.setSize(selected.getWidth(), selected.getHeight() + 40);
                                selected.repaint();
                            }

                        } else if (selected instanceof InterfazFigura) {
                            newMethod.setText("@NombreMetodo");
                            selected.add(newMethod);
                            selected.getMetodos().add(newMethod);
                            selected.setSize(selected.getWidth(), selected.getHeight() + 40);
                            selected.repaint();
                        } else {
                            newMethod.setText("NombreMetodo");
                            selected.add(newMethod);
                            selected.getMetodos().add(newMethod);
                            selected.setSize(selected.getWidth(), selected.getHeight() + 40);
                            selected.repaint();
                        }

                        jp_workArea.revalidate();
                        jp_workArea.repaint();
                    }
                });

                // Agregar Herencia
                makeInheritance.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (source instanceof AbstractaFigura) {
                            AbstractaFigura sel = (AbstractaFigura) source;

                            createInheritance(sel);

                            jp_workArea.revalidate();
                            jp_workArea.repaint();

                        } else if (source instanceof ClasseFigura) {
                            ClasseFigura selected = (ClasseFigura) source;

                            createInheritance(selected);

                            jp_workArea.revalidate();
                            jp_workArea.repaint();

                        }

                    }
                });

                //Cambiar color del font
                changeFontColor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {

                            docText = currentSel.getTextA().getStyledDocument();
                            styleText = currentSel.getTextA().addStyle("myStyleText", null);

                            Color fontColor = JColorChooser.showDialog(bg_UML, "Seleccione Color", Color.red);
                            currentSel.setFontColor(fontColor);

                            StyleConstants.setForeground(styleText, fontColor);

                            docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            for (JTextPane atributo : currentSel.getAtributos()) {
                                StyledDocument tempDocText = atributo.getStyledDocument();
                                Style tempTextStlye = atributo.addStyle("myStyleText", null);

                                StyleConstants.setForeground(tempTextStlye, fontColor);
                                tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);

                            }
                            for (JTextPane metodo : currentSel.getMetodos()) {
                                StyledDocument tempDocText = metodo.getStyledDocument();
                                Style tempTextStlye = metodo.addStyle("myStyleText", null);

                                StyleConstants.setForeground(tempTextStlye, fontColor);
                                tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);

                            }

                        } catch (Exception ex) {
                        }
                    }
                });

                // Copiar 
                copy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {

                            if (currentSel instanceof InheritanceFigura) {
                                InheritanceFigura casted = (InheritanceFigura) currentSel;

                                InheritanceFigura copiedClasseFigura = new InheritanceFigura(casted);

                                copiedHerencias.add(copiedClasseFigura);
                                Figuras.add(copiedClasseFigura);

                                jp_workArea.revalidate();
                                jp_workArea.repaint();

                                if (!copiedHerencias.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_UML, "Copiado!");
                                }
                            } else if (currentSel instanceof AbstractaFigura) {
                                AbstractaFigura casted = (AbstractaFigura) currentSel;

                                AbstractaFigura copiedClasseFigura = new AbstractaFigura(casted);

                                copiedAbstractos.add(copiedClasseFigura);
                                Figuras.add(copiedClasseFigura);

                                jp_workArea.revalidate();
                                jp_workArea.repaint();

                                if (!copiedAbstractos.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_UML, "Copiado!");
                                }

                            } else if (currentSel instanceof InterfazFigura) {
                                InterfazFigura casted = (InterfazFigura) currentSel;

                                InterfazFigura copiedClasseFigura = new InterfazFigura(casted);

                                copiedInterfaces.add(copiedClasseFigura);
                                Figuras.add(copiedClasseFigura);

                                jp_workArea.revalidate();
                                jp_workArea.repaint();

                                if (!copiedAbstractos.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_UML, "Copiado!");
                                }

                            } else {
                                ClasseFigura claseCopiada = new ClasseFigura(currentSel);

                                copiedSimps.add(claseCopiada);
                                Figuras.add(claseCopiada);

                                jp_workArea.revalidate();
                                jp_workArea.repaint();

                                if (!copiedSimps.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_UML, "Copiado!");
                                }
                            }

                        } catch (NullPointerException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(bg_UML, "Debe seleccionar primero la figura", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

                // Modificar
                modify.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (currentSel instanceof ClasseFigura) {
                            eliminarNodo(currentSel);
                            seleccion(currentSel, false);
                        }
                    }
                });

                // Eliminar
                delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof ClasseFigura) {

                            int op = JOptionPane.showConfirmDialog(bg_UML, "Esta seguro que desea eliminar?\nSe eliminara tambien la informacion de este grafo del arbol!");

                            if (op == JOptionPane.YES_OPTION) {
                                ClasseFigura selected = (ClasseFigura) source;
                                jp_workArea.remove(selected);
                                Figuras.remove(selected);
                                eliminarNodo(selected);
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

            if (source instanceof ClasseFigura) {

                ClasseFigura fig = (ClasseFigura) source;

                Point location = SwingUtilities.convertPoint(fig, e.getPoint(), source.getParent());

                Point newLocation = fig.getLocation();
                newLocation.translate(location.x - startPoint.x, location.y - startPoint.y);
                newLocation.x = Math.max(newLocation.x, 0);
                newLocation.y = Math.max(newLocation.y, 0);
                newLocation.x = Math.min(newLocation.x, fig.getParent().getWidth() - fig.getWidth());
                newLocation.y = Math.min(newLocation.y, fig.getParent().getHeight() - fig.getHeight());
                fig.setLocX(newLocation.x);
                fig.setLocY(newLocation.y);
                fig.setLocation(newLocation);
                startPoint = location;
            }

        } catch (Exception ex) {

        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
