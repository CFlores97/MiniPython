package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.BorderFactory;
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

public class Flujo extends javax.swing.JFrame implements MouseListener, MouseMotionListener {

    public Flujo() {
        initComponents();
        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
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

        pp_shits = new javax.swing.JPopupMenu();
        mi_pegar = new javax.swing.JMenuItem();
        mi_help = new javax.swing.JMenuItem();
        jd_arbol = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btn_exitDialog = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jt_arbolF = new javax.swing.JTree();
        jLabel26 = new javax.swing.JLabel();
        pp_addMenu = new javax.swing.JPopupMenu();
        mi_addNode = new javax.swing.JMenuItem();
        pp_delMenu = new javax.swing.JPopupMenu();
        mi_delNode = new javax.swing.JMenuItem();
        jd_python = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tp_pyIDE = new javax.swing.JTextPane();
        btn_exitPy = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        pp_archivos = new javax.swing.JPopupMenu();
        mi_guardar = new javax.swing.JMenuItem();
        mi_cargar = new javax.swing.JMenuItem();
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
        btn_python = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        pn_formasMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workArea = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_proc = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_decision = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_iniofin = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_dat = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_verArbol = new javax.swing.JButton();

        mi_pegar.setText("Pegar");
        mi_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_pegarActionPerformed(evt);
            }
        });
        pp_shits.add(mi_pegar);

        mi_help.setText("Ayuda");
        pp_shits.add(mi_help);

        jd_arbol.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));

        btn_exitDialog.setBackground(new java.awt.Color(10, 10, 10));
        btn_exitDialog.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitDialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitDialogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitDialogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitDialogMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("X");

        javax.swing.GroupLayout btn_exitDialogLayout = new javax.swing.GroupLayout(btn_exitDialog);
        btn_exitDialog.setLayout(btn_exitDialogLayout);
        btn_exitDialogLayout.setHorizontalGroup(
            btn_exitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_exitDialogLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btn_exitDialogLayout.setVerticalGroup(
            btn_exitDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_exitDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_arbolF.setBackground(new java.awt.Color(68, 68, 68));
        jt_arbolF.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Flujo");
        jt_arbolF.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_arbolF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_arbolFMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Seleccione a donde desea ingresar la instruccion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(36, 36, 36)
                        .addComponent(btn_exitDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jt_arbolF, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exitDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jt_arbolF, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mi_addNode.setText("Agregar");
        mi_addNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_addNodeActionPerformed(evt);
            }
        });
        pp_addMenu.add(mi_addNode);

        mi_delNode.setText("Eliminar");
        mi_delNode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_delNodeActionPerformed(evt);
            }
        });
        pp_delMenu.add(mi_delNode);

        jd_python.setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Codigo en Python");

        tp_pyIDE.setBackground(new java.awt.Color(30, 31, 34));
        tp_pyIDE.setForeground(new java.awt.Color(187, 179, 172));
        jScrollPane3.setViewportView(tp_pyIDE);

        btn_exitPy.setBackground(new java.awt.Color(10, 10, 10));
        btn_exitPy.setForeground(new java.awt.Color(255, 255, 255));
        btn_exitPy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitPyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitPyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitPyMouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("X");

        javax.swing.GroupLayout btn_exitPyLayout = new javax.swing.GroupLayout(btn_exitPy);
        btn_exitPy.setLayout(btn_exitPyLayout);
        btn_exitPyLayout.setHorizontalGroup(
            btn_exitPyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_exitPyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel29)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btn_exitPyLayout.setVerticalGroup(
            btn_exitPyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_exitPyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_exitPy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btn_exitPy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jd_pythonLayout = new javax.swing.GroupLayout(jd_python.getContentPane());
        jd_python.getContentPane().setLayout(jd_pythonLayout);
        jd_pythonLayout.setHorizontalGroup(
            jd_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_pythonLayout.setVerticalGroup(
            jd_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mi_guardar.setText("Guardar");
        mi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarActionPerformed(evt);
            }
        });
        pp_archivos.add(mi_guardar);

        mi_cargar.setText("Cargar");
        pp_archivos.add(mi_cargar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg_flujo.setBackground(new java.awt.Color(38, 38, 38));

        jPanel1.setBackground(new java.awt.Color(10, 10, 10));

        btn_archivo.setBackground(new java.awt.Color(10, 10, 10));
        btn_archivo.setPreferredSize(new java.awt.Dimension(64, 22));
        btn_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_archivoMouseClicked(evt);
            }
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

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project icons/Python logo.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Convertir ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("a Python");

        javax.swing.GroupLayout btn_pythonLayout = new javax.swing.GroupLayout(btn_python);
        btn_python.setLayout(btn_pythonLayout);
        btn_pythonLayout.setHorizontalGroup(
            btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pythonLayout.createSequentialGroup()
                .addGroup(btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27))
                    .addGroup(btn_pythonLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_pythonLayout.setVerticalGroup(
            btn_pythonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pythonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jSeparator22.setBackground(new java.awt.Color(68, 68, 68));
        jSeparator22.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_python, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        pn_ribbonMenuLayout.setVerticalGroup(
            pn_ribbonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jSeparator22)
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

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 1000));

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setPreferredSize(new java.awt.Dimension(1000, 1000));
        workArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workAreaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(workArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
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
                .addContainerGap(31, Short.MAX_VALUE))
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

        btn_iniofin.setBackground(new java.awt.Color(212, 212, 212));
        btn_iniofin.setForeground(new java.awt.Color(255, 255, 255));
        btn_iniofin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniofinMouseClicked(evt);
            }
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

        btn_dat.setBackground(new java.awt.Color(212, 212, 212));
        btn_dat.setForeground(new java.awt.Color(255, 255, 255));
        btn_dat.setPreferredSize(new java.awt.Dimension(100, 48));
        btn_dat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datMouseClicked(evt);
            }
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
                .addContainerGap(46, Short.MAX_VALUE))
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

        btn_verArbol.setText("Ver Arbol");
        btn_verArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verArbolMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_proc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_decision, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btn_iniofin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btn_verArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_proc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_decision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_iniofin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btn_verArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void btn_iniofinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniofinMouseEntered
        btn_iniofin.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_iniofinMouseEntered

    private void btn_iniofinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniofinMouseExited
        btn_iniofin.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_iniofinMouseExited

    private void btn_procMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_procMouseClicked
        createSquare();
    }//GEN-LAST:event_btn_procMouseClicked

    private void btn_decisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_decisionMouseClicked
        createRombus();

    }//GEN-LAST:event_btn_decisionMouseClicked

    private void btn_iniofinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniofinMouseClicked
        createCapsue();
    }//GEN-LAST:event_btn_iniofinMouseClicked

    private void mi_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_pegarActionPerformed
        //Pegar el elemento copiado
        try {
            toPasteFig = copiedFigures.get(copiedFigures.size() - 1);

            toPasteFig.addMouseListener(this);
            toPasteFig.addMouseMotionListener(this);

            workArea.add(toPasteFig);
            toPasteFig.setLocation(workArea.getWidth() / 2 + 10, workArea.getHeight() / 2 + 10);
            copiedFigures.remove(toPasteFig);

            workArea.revalidate();
            workArea.repaint();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay nada copiado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mi_pegarActionPerformed

    private void workAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workAreaMouseClicked
        //mostrar el popmenu
        if (evt.isMetaDown()) {
            pp_shits.show(workArea, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_workAreaMouseClicked

    private void btn_blackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blackMouseClicked
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_black.getBackground());
        }
    }//GEN-LAST:event_btn_blackMouseClicked

    private void btn_grayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_grayMouseClicked
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_gray.getBackground());
        }
    }//GEN-LAST:event_btn_grayMouseClicked

    private void btn_bloodredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bloodredMouseClicked
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_bloodred.getBackground());
        }
    }//GEN-LAST:event_btn_bloodredMouseClicked

    private void btn_redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_redMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_red.getBackground());
        }
    }//GEN-LAST:event_btn_redMouseClicked

    private void btn_orangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_orangeMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_orange.getBackground());
        }
    }//GEN-LAST:event_btn_orangeMouseClicked

    private void btn_yellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yellowMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_yellow.getBackground());
        }
    }//GEN-LAST:event_btn_yellowMouseClicked

    private void btn_greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_greenMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_green.getBackground());
        }
    }//GEN-LAST:event_btn_greenMouseClicked

    private void btn_cyanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cyanMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_cyan.getBackground());
        }
    }//GEN-LAST:event_btn_cyanMouseClicked

    private void btn_blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_blueMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_blue.getBackground());
        }
    }//GEN-LAST:event_btn_blueMouseClicked

    private void btn_purpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_purpleMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_purple.getBackground());
        }
    }//GEN-LAST:event_btn_purpleMouseClicked

    private void btn_whiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_whiteMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_white.getBackground());
        }
    }//GEN-LAST:event_btn_whiteMouseClicked

    private void btn_lightgrayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lightgrayMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_lightgray.getBackground());
        }
    }//GEN-LAST:event_btn_lightgrayMouseClicked

    private void btn_brownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brownMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_brown.getBackground());
        }
    }//GEN-LAST:event_btn_brownMouseClicked

    private void btn_pinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pinkMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_pink.getBackground());
        }
    }//GEN-LAST:event_btn_pinkMouseClicked

    private void btn_mangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mangoMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_mango.getBackground());
        }
    }//GEN-LAST:event_btn_mangoMouseClicked

    private void btn_yellowopaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_yellowopaqueMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_yellowopaque.getBackground());
        }
    }//GEN-LAST:event_btn_yellowopaqueMouseClicked

    private void btn_limegreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limegreenMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_limegreen.getBackground());
        }
    }//GEN-LAST:event_btn_limegreenMouseClicked

    private void btn_opaquecyanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaquecyanMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_opaquecyan.getBackground());
        }
    }//GEN-LAST:event_btn_opaquecyanMouseClicked

    private void btn_opaqueblueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaqueblueMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_opaqueblue.getBackground());
        }
    }//GEN-LAST:event_btn_opaqueblueMouseClicked

    private void btn_opaquepurpleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_opaquepurpleMouseClicked
        // TODO add your handling code here:
        if (currentSel instanceof JPanel) {
            changeColor(currentSel, btn_opaquepurple.getBackground());
        }
    }//GEN-LAST:event_btn_opaquepurpleMouseClicked

    private void cb_fuenteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_fuenteItemStateChanged
        // TODO add your handling code here:

        if (currentSel instanceof ProcesoFigura) {
            try {

                if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                    ProcesoFigura temp = (ProcesoFigura) currentSel;
                    // declara variables
                    docText = temp.getText().getStyledDocument();

                    styleText = temp.getText().addStyle("myStyleText", null);

                    //Asigna el font a la variable styleText
                    StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                    //Cambia el font de "myStyleText" al que se selecciono
                    docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        if (currentSel instanceof DecisionFigura) {
            try {

                if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                    DecisionFigura temp = (DecisionFigura) currentSel;
                    // declara variables
                    docText = temp.getText().getStyledDocument();

                    styleText = temp.getText().addStyle("myStyleText", null);

                    //Asigna el font a la variable styleText
                    StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                    //Cambia el font de "myStyleText" al que se selecciono
                    docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (currentSel instanceof InicioFigura) {
            try {

                if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                    InicioFigura temp = (InicioFigura) currentSel;
                    // declara variables
                    docText = temp.getText().getStyledDocument();

                    styleText = temp.getText().addStyle("myStyleText", null);

                    //Asigna el font a la variable styleText
                    StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                    //Cambia el font de "myStyleText" al que se selecciono
                    docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (currentSel instanceof DatosFigura) {
            try {

                if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                    DatosFigura temp = (DatosFigura) currentSel;
                    // declara variables
                    docText = temp.getText().getStyledDocument();

                    styleText = temp.getText().addStyle("myStyleText", null);

                    //Asigna el font a la variable styleText
                    StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                    //Cambia el font de "myStyleText" al que se selecciono
                    docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (currentSel instanceof Documento) {
            try {

                if (cb_fuente.getSelectedIndex() != -1 && currentSel != null) {

                    Documento temp = (Documento) currentSel;
                    // declara variables
                    docText = temp.getText().getStyledDocument();

                    styleText = temp.getText().addStyle("myStyleText", null);

                    //Asigna el font a la variable styleText
                    StyleConstants.setFontFamily(styleText, cb_fuente.getSelectedItem().toString());

                    //Cambia el font de "myStyleText" al que se selecciono
                    docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Seleccione la figura la cual desea aplicar la fuente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_cb_fuenteItemStateChanged

    private void cb_estiloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_estiloItemStateChanged
        if (currentSel instanceof ProcesoFigura) {
            ProcesoFigura papada = (ProcesoFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                    changeFont();
                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof DecisionFigura) {
            DecisionFigura papada = (DecisionFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                    changeFont();
                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof InicioFigura) {
            InicioFigura papada = (InicioFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                    changeFont();
                }
            } catch (Exception e) {
            }

        }
        
        if (currentSel instanceof DatosFigura) {
            DatosFigura papada = (DatosFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                    changeFont();
                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof Documento) {
            Documento papada = (Documento) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    //cb_estilo.setSelectedIndex(-1);  ------> DO NOT UNCOMMENT <------
                    changeFont();
                }
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_cb_estiloItemStateChanged

    private void cb_sizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_sizeItemStateChanged
        if (currentSel instanceof ProcesoFigura) {
            ProcesoFigura papada = (ProcesoFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);

                    changeFont();

                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof DecisionFigura) {
            DecisionFigura papada = (DecisionFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);

                    changeFont();

                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof InicioFigura) {
            InicioFigura papada = (InicioFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);

                    changeFont();

                }
            } catch (Exception e) {
            }

        }
        
        if (currentSel instanceof DatosFigura) {
            DatosFigura papada = (DatosFigura) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);

                    changeFont();

                }
            } catch (Exception e) {
            }

        }
        if (currentSel instanceof Documento) {
            Documento papada = (Documento) currentSel;
            try {
                if (currentSel != null) {

                    docText = papada.getText().getStyledDocument();

                    styleText = papada.getText().addStyle("myStyleText", null);

                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);

                    changeFont();

                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cb_sizeItemStateChanged

    private void btn_datMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMouseExited
        btn_dat.setBackground(new Color(212, 212, 212));
    }//GEN-LAST:event_btn_datMouseExited

    private void btn_datMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMouseEntered
        btn_dat.setBackground(new Color(211, 221, 225));
    }//GEN-LAST:event_btn_datMouseEntered

    private void btn_datMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMouseClicked
        createParalel();
    }//GEN-LAST:event_btn_datMouseClicked

    private void btn_verArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verArbolMouseClicked
        jd_arbol.pack();
        jd_arbol.setModal(true);
        jd_arbol.setLocationRelativeTo(this);
        jd_arbol.setVisible(true);
    }//GEN-LAST:event_btn_verArbolMouseClicked

    private void btn_exitDialogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitDialogMouseClicked
        jd_arbol.setVisible(false);
    }//GEN-LAST:event_btn_exitDialogMouseClicked

    private void btn_exitDialogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitDialogMouseEntered
        btn_exitDialog.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_exitDialogMouseEntered

    private void btn_exitDialogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitDialogMouseExited
        btn_exitDialog.setBackground(new Color(10, 10, 10));
    }//GEN-LAST:event_btn_exitDialogMouseExited

    private void jt_arbolFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_arbolFMouseClicked
        if (evt.isMetaDown()) {
            //DefaultTreeModel m = (DefaultTreeModel) jt_arbolF.getModel();

            selectedNode = (DefaultMutableTreeNode) jt_arbolF.getLastSelectedPathComponent();

            try {
                if (selectedNode.getUserObject().equals("True") || selectedNode.getUserObject().equals("False")) {
                    pp_addMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                } else {
                    pp_delMenu.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            } catch (NullPointerException e) {
                //JOptionPane.showMessageDialog(this, "Seleccione un nodo adentro del bucle o condicional al que quiera agregar!");
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jt_arbolFMouseClicked

    private void mi_addNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_addNodeActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_arbolF.getModel();
        String figTit = "";

        if (selectedNode != null && currentSel != null) {
            if (currentSel instanceof ProcesoFigura) {
                ProcesoFigura temp = (ProcesoFigura) currentSel;
                figTit = "Proceso: " + temp.getText().getText();
                DefaultMutableTreeNode sigInstru = new DefaultMutableTreeNode(figTit);
                selectedNode.add(sigInstru);

            } else if (currentSel instanceof DecisionFigura) {
                DecisionFigura temp = (DecisionFigura) currentSel;

                if (temp.isIsLoop()) {

                    generarWhile(temp, selectedNode);
                    bucles.add(temp);

                } else if (temp.isIsConditional()) {

                    generarIf(temp, selectedNode);
                    condicionales.add(temp);

                }

            } else if (currentSel instanceof DatosFigura) {
                DatosFigura temp = (DatosFigura) currentSel;
                figTit = "Datos: " + temp.getText().getText();
                DefaultMutableTreeNode sigInstru = new DefaultMutableTreeNode(figTit);
                selectedNode.add(sigInstru);
            } else if (currentSel instanceof InicioFigura) {
                InicioFigura temp = (InicioFigura) currentSel;
                figTit = "#" + temp.getText().getText();
                DefaultMutableTreeNode sigInstru = new DefaultMutableTreeNode(figTit);
                selectedNode.add(sigInstru);
            }
        }

        m.reload();
    }//GEN-LAST:event_mi_addNodeActionPerformed

    private void mi_delNodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_delNodeActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_arbolF.getModel();

        if (selectedNode != null && currentSel != null) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar el nodo?");

            if (op == JOptionPane.YES_OPTION) {
                m.removeNodeFromParent(selectedNode);
            }

        }

        m.reload();
    }//GEN-LAST:event_mi_delNodeActionPerformed

    private void btn_pythonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseClicked

        int confirmacion = JOptionPane.showConfirmDialog(this, "Procedera a generarse codigo de python, verifique que todo este correcto");

        if (confirmacion == JOptionPane.YES_OPTION) {

            jd_python.pack();
            jd_python.setModal(true);
            jd_python.setLocationRelativeTo(this);
            jd_python.setVisible(true);

            try {

                tp_pyIDE.setText("");
                
                DefaultTreeModel m = (DefaultTreeModel) jt_arbolF.getModel();
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) m.getRoot();

                AdminTreeFLujo arbolFlujo = new AdminTreeFLujo();

                arbolFlujo.translate(root, tp_pyIDE);
                
                

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al generar codigo");
            }
        }

        //m.reload();
    }//GEN-LAST:event_btn_pythonMouseClicked

    private void btn_pythonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseEntered
        btn_python.setBackground(new Color(68, 68, 68));
    }//GEN-LAST:event_btn_pythonMouseEntered

    private void btn_pythonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pythonMouseExited
        btn_python.setBackground(new Color(54, 54, 54));
    }//GEN-LAST:event_btn_pythonMouseExited

    private void btn_exitPyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPyMouseClicked
        jd_python.setVisible(false);
    }//GEN-LAST:event_btn_exitPyMouseClicked

    private void btn_exitPyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPyMouseEntered
        btn_exitPy.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btn_exitPyMouseEntered

    private void btn_exitPyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitPyMouseExited
        btn_exitPy.setBackground(new Color(38, 38, 38));
    }//GEN-LAST:event_btn_exitPyMouseExited

    private void btn_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_archivoMouseClicked
        if(evt.isMetaDown()){
            pp_archivos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_btn_archivoMouseClicked

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

                for (Component figura : workArea.getComponents()) {

                    if (figura instanceof ProcesoFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Procesofigura....");
                        ProcesoFigura temp = (ProcesoFigura) figura;
//                        DatosInheritance dat = convertirDatosInh(temp);
//                        bw.writeObject(dat);
                        bw.flush();
                    } else if (figura instanceof DatosFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Datosfigura....");
                        DatosFigura temp = (DatosFigura) figura;
//                        DatosAbstract dat = convertirDatosAbs(temp);
//                        bw.writeObject(dat);
                        bw.flush();

                    } else if (figura instanceof DecisionFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Decisionfigura....");
                        DecisionFigura temp = (DecisionFigura) figura;
//                        DatosInterfaz dat = convertirDatosInt(temp);
//                        bw.writeObject(dat);
                        bw.flush();

                    } else if (figura instanceof InicioFigura) {
                        JOptionPane.showMessageDialog(this, "Serializando Inicio o fin figura....");
                        InicioFigura temp = (InicioFigura) figura;
//                        DatosClasse dat = convertirDatosSimp(temp);
//                        bw.writeObject(dat);
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

    //metodo para generar whiles e ifs
    public void generarWhile(DecisionFigura temp, DefaultMutableTreeNode c) {

        String figTit = "while " + temp.getText().getText() + ":";

        DefaultMutableTreeNode figName = new DefaultMutableTreeNode(figTit);

        DefaultMutableTreeNode verdadero = new DefaultMutableTreeNode("True");
        DefaultMutableTreeNode falso = new DefaultMutableTreeNode("False");

        figName.add(verdadero);
        figName.add(falso);

        c.add(figName);
    }

    public void generarIf(DecisionFigura temp, DefaultMutableTreeNode c) {

        String figTit = "If " + temp.getText().getText() + ":";

        DefaultMutableTreeNode figName = new DefaultMutableTreeNode(figTit);

        DefaultMutableTreeNode verdadero = new DefaultMutableTreeNode("True");
        DefaultMutableTreeNode falso = new DefaultMutableTreeNode("False");

        figName.add(verdadero);
        figName.add(falso);

        c.add(figName);
    }

    //metodo para generar arbol
    public void generarArbol(JPanel c) {
        DefaultTreeModel modelo = (DefaultTreeModel) jt_arbolF.getModel();

        DefaultMutableTreeNode root = (DefaultMutableTreeNode) modelo.getRoot();

        String figTit = "";

        if (c instanceof ProcesoFigura) {
            ProcesoFigura temp = (ProcesoFigura) c;
            
            figTit = "Proceso: " + temp.getText().getText();
            
            DefaultMutableTreeNode figName = new DefaultMutableTreeNode(figTit);
            
            root.add(figName);
            
            JOptionPane.showMessageDialog(bg_flujo, "Se ha cargado la informacion exitosamente!");

        }
        if (c instanceof DecisionFigura) {
            DecisionFigura temp = (DecisionFigura) c;

            if (temp.isIsLoop()) {
                generarWhile(temp, root);
                JOptionPane.showMessageDialog(bg_flujo, "Se ha cargado la informacion exitosamente!");

            } else if (temp.isIsConditional()) {
                generarIf(temp, root);
                JOptionPane.showMessageDialog(bg_flujo, "Se ha cargado la informacion exitosamente!");

            } else {
                JOptionPane.showMessageDialog(this, "Debe marcar si es bucle o condicional primero!");
            }

        }
        if (c instanceof InicioFigura) {
            InicioFigura temp = (InicioFigura) c;
            figTit = "#" + temp.getText().getText();
            DefaultMutableTreeNode figName = new DefaultMutableTreeNode(figTit);
            root.add(figName);
            JOptionPane.showMessageDialog(bg_flujo, "Se ha cargado la informacion exitosamente!");

        }
        if (c instanceof DatosFigura) {
            DatosFigura temp = (DatosFigura) c;
            figTit = "Datos: " + temp.getText().getText();
            DefaultMutableTreeNode figName = new DefaultMutableTreeNode(figTit);
            root.add(figName);
            JOptionPane.showMessageDialog(bg_flujo, "Se ha cargado la informacion exitosamente!");

        }

        modelo.reload();

    }

    //verificar si hay bucles y condicionales
    public boolean hayBucles() {
        return !bucles.isEmpty();
    }

    public boolean hayCondicionales() {
        return !condicionales.isEmpty();
    }

    //metodos personales
    public void createSquare() {

        ProcesoFigura proceso = new ProcesoFigura(
                200,
                60,
                workArea.getWidth(),
                workArea.getHeight(),
                f);

        proceso.addMouseListener(this);
        proceso.addMouseMotionListener(this);

        workArea.add(proceso);

        proceso.revalidate();
        workArea.repaint();
    }

    public void createRombus() {
        DecisionFigura rombo = new DecisionFigura(
                100,
                60,
                workArea.getWidth(),
                workArea.getHeight(),
                f);

        rombo.addMouseListener(this);
        rombo.addMouseMotionListener(this);

        workArea.add(rombo);

        rombo.revalidate();
        workArea.repaint();
    }

    public void createCapsue() {
        InicioFigura capsule = new InicioFigura(
                230,
                40,
                workArea.getWidth(),
                workArea.getHeight(),
                f);

        capsule.addMouseListener(this);
        capsule.addMouseMotionListener(this);

        workArea.add(capsule);

        capsule.revalidate();
        workArea.repaint();
    }

    public void createParalel() {
        DatosFigura capsule = new DatosFigura(
                210,
                60,
                workArea.getWidth(),
                workArea.getHeight(),
                f);

        capsule.addMouseListener(this);
        capsule.addMouseMotionListener(this);

        workArea.add(capsule);

        capsule.revalidate();
        workArea.repaint();
    }

    public void createDoc() {
        Documento documento = new Documento(
                100,
                60,
                workArea.getWidth(),
                workArea.getHeight(),
                f);

        documento.addMouseListener(this);
        documento.addMouseMotionListener(this);

        workArea.add(documento);

        documento.revalidate();
        workArea.repaint();
    }

    public void seleccion(JPanel selected, boolean isClicked) {

        if (isClicked) {
            Border borde = BorderFactory.createLineBorder(new Color(147, 147, 147), 1);
            selected.setBorder(borde);
        } else {
            selected.setBorder(null);
        }

    }

    public void changeColor(JPanel c, Color color) {

        if (currentSel instanceof ProcesoFigura) {
            ProcesoFigura papada = (ProcesoFigura) currentSel;
            papada.setColor(color);

        }
        if (currentSel instanceof DecisionFigura) {
            DecisionFigura papada = (DecisionFigura) currentSel;
            papada.setColor(color);

        }
        if (currentSel instanceof InicioFigura) {
            InicioFigura papada = (InicioFigura) currentSel;
            papada.setColor(color);
        }
        
        if (currentSel instanceof DatosFigura) {
            DatosFigura papada = (DatosFigura) currentSel;
            papada.setColor(color);
        }
        if (currentSel instanceof Documento) {
            Documento papada = (Documento) currentSel;
            papada.setColor(color);
        }

    }

    public void changeFont() {
        if (currentSel instanceof ProcesoFigura) {
            ProcesoFigura papada = (ProcesoFigura) currentSel;
            int selectedStlye = cb_estilo.getSelectedIndex();

            switch (selectedStlye) {
                case 0:
                    int writtenLength = docText.getLength();
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
                        }

                        if (StyleConstants.isItalic(attrs)) {
                            StyleConstants.setItalic(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

                        }
                        if (StyleConstants.isUnderline(attrs)) {
                            StyleConstants.setUnderline(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

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
                    break;
                case 2:
                    StyleConstants.setItalic(styleText, true);
                    //StyleConstants.setItalic(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                case 3:
                    StyleConstants.setUnderline(styleText, true);
                    //StyleConstants.setUnderline(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                default:

            }

        }
        if (currentSel instanceof DecisionFigura) {
            DecisionFigura papada = (DecisionFigura) currentSel;
            int selectedStlye = cb_estilo.getSelectedIndex();
            switch (selectedStlye) {
                case 0:
                    int writtenLength = docText.getLength();
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
                        }
                        if (StyleConstants.isItalic(attrs)) {
                            StyleConstants.setItalic(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

                        }
                        if (StyleConstants.isUnderline(attrs)) {
                            StyleConstants.setUnderline(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

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
                    break;
                case 2:
                    StyleConstants.setItalic(styleText, true);
                    //StyleConstants.setItalic(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                case 3:
                    StyleConstants.setUnderline(styleText, true);
                    //StyleConstants.setUnderline(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                default:

            }

        }
        if (currentSel instanceof InicioFigura) {
            InicioFigura papada = (InicioFigura) currentSel;
            int selectedStlye = cb_estilo.getSelectedIndex();
            switch (selectedStlye) {
                case 0:
                    int writtenLength = docText.getLength();
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
                        }
                        if (StyleConstants.isItalic(attrs)) {
                            StyleConstants.setItalic(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

                        }
                        if (StyleConstants.isUnderline(attrs)) {
                            StyleConstants.setUnderline(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

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
                    break;
                case 2:
                    StyleConstants.setItalic(styleText, true);
                    //StyleConstants.setItalic(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                case 3:
                    StyleConstants.setUnderline(styleText, true);
                    //StyleConstants.setUnderline(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                default:

            }
        }
        
        if (currentSel instanceof DatosFigura) {
            DatosFigura papada = (DatosFigura) currentSel;
            int selectedStlye = cb_estilo.getSelectedIndex();
            switch (selectedStlye) {
                case 0:
                    int writtenLength = docText.getLength();
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
                        }
                        if (StyleConstants.isItalic(attrs)) {
                            StyleConstants.setItalic(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

                        }
                        if (StyleConstants.isUnderline(attrs)) {
                            StyleConstants.setUnderline(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

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
                    break;
                case 2:
                    StyleConstants.setItalic(styleText, true);
                    //StyleConstants.setItalic(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                case 3:
                    StyleConstants.setUnderline(styleText, true);
                    //StyleConstants.setUnderline(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                default:

            }
        }
        if (currentSel instanceof Documento) {
            Documento papada = (Documento) currentSel;
            int selectedStlye = cb_estilo.getSelectedIndex();
            switch (selectedStlye) {
                case 0:
                    int writtenLength = docText.getLength();
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
                        }
                        if (StyleConstants.isItalic(attrs)) {
                            StyleConstants.setItalic(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

                        }
                        if (StyleConstants.isUnderline(attrs)) {
                            StyleConstants.setUnderline(styleText, false);
                            StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                            docText.setCharacterAttributes(0,
                                    docText.getLength(),
                                    styleText,
                                    true);

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
                    break;
                case 2:
                    StyleConstants.setItalic(styleText, true);
                    //StyleConstants.setItalic(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                case 3:
                    StyleConstants.setUnderline(styleText, true);
                    //StyleConstants.setUnderline(styleTitle, true);
                    StyleConstants.setFontSize(styleText, Integer.parseInt(cb_size.getSelectedItem().toString()));

                    docText.setCharacterAttributes(0,
                            docText.getLength(),
                            styleText,
                            true);
                    break;
                default:

            }
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

    Font f = new Font("Title", 1, 16);
    Point startPoint;
    JPanel currentSel = null;
    JPanel toPasteFig = null;
    ArrayList<JPanel> copiedFigures = new ArrayList<>();
    ArrayList<DecisionFigura> bucles = new ArrayList<>();
    ArrayList<DecisionFigura> condicionales = new ArrayList<>();

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

    StyledDocument docTitle, docText;
    Style styleTitle, styleText;

    DefaultMutableTreeNode selectedNode = null;

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
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_exitDialog;
    private javax.swing.JPanel btn_exitPy;
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
    private javax.swing.JPanel btn_python;
    private javax.swing.JButton btn_red;
    private javax.swing.JButton btn_verArbol;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JTree jt_arbolF;
    private javax.swing.JMenuItem mi_addNode;
    private javax.swing.JMenuItem mi_cargar;
    private javax.swing.JMenuItem mi_delNode;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_help;
    private javax.swing.JMenuItem mi_pegar;
    private javax.swing.JPanel pn_formasMenu;
    private javax.swing.JPanel pn_ribbonMenu;
    private javax.swing.JPopupMenu pp_addMenu;
    private javax.swing.JPopupMenu pp_archivos;
    private javax.swing.JPopupMenu pp_delMenu;
    private javax.swing.JPopupMenu pp_shits;
    private javax.swing.JToolBar tb_colors1;
    private javax.swing.JToolBar tb_colors2;
    private javax.swing.JToolBar tb_letras;
    private javax.swing.JTextPane tp_pyIDE;
    private javax.swing.JPanel workArea;
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
            if (source instanceof JPanel) {

                JPanel selected = (JPanel) source;
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

        //click derecho
        if (e.isMetaDown()) {

            try {
                JMenuItem addAttribute = new JMenuItem("Crear coneccion");

                JMenuItem loadTree = new JMenuItem("Actualizar arbol");
                JMenu properties = new JMenu("Propiedades de la fuente");

                JMenu opciones = new JMenu("Opciones");

                JMenuItem changeFontColor = new JMenuItem("Cambiar color");

                JMenuItem isLoop = new JMenuItem("Marcar como ciclo \"while\"");
                JMenuItem isConditional = new JMenuItem("Marcar como condicional");

                JMenuItem addToConditional = new JMenuItem("Añadir a una condicional");
                JMenuItem addToLoop = new JMenuItem("añadir a un bucle");
                JMenuItem addProcess = new JMenuItem("Agregar un proceso");
                JMenuItem addDatos = new JMenuItem("Agregar una lectura de datos");

                JMenuItem copy = new JMenuItem("Copiar");
                JMenuItem delete = new JMenuItem("Eliminar");
                JMenuItem help = new JMenuItem("Ayuda");

                JSeparator separador = new JSeparator(SwingUtilities.HORIZONTAL);
                JSeparator separador2 = new JSeparator(SwingUtilities.HORIZONTAL);
                JSeparator separador3 = new JSeparator(SwingUtilities.HORIZONTAL);

                if (currentSel instanceof DecisionFigura) {
                    opciones.add(loadTree);
                    opciones.add(isLoop);
                    opciones.add(isConditional);
                } else {
                    opciones.add(loadTree);
                }

                if (hayBucles()) {

                    opciones.add(addToLoop);
                }
                if (hayCondicionales()) {
                    opciones.add(addToConditional);
                }
                properties.add(changeFontColor);

                //Agrega el pop menu y los items
                JPopupMenu rCMenu = new JPopupMenu();

                rCMenu.add(opciones);
                rCMenu.add(addAttribute);
                rCMenu.add(separador);
                rCMenu.add(properties);
                rCMenu.add(separador2);
                rCMenu.add(copy);
                rCMenu.add(delete);
                rCMenu.add(separador3);
                rCMenu.add(help);

                //agregar profundidad a bucle
                addToLoop.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jd_arbol.pack();
                        jd_arbol.setModal(true);
                        jd_arbol.setLocationRelativeTo(bg_flujo);
                        jd_arbol.setVisible(true);

                    }
                });

                addToConditional.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jd_arbol.pack();
                        jd_arbol.setModal(true);
                        jd_arbol.setLocationRelativeTo(bg_flujo);
                        jd_arbol.setVisible(true);
                    }
                });

                //agregar bucles al arbol
                isLoop.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (currentSel instanceof DecisionFigura) {
                                DecisionFigura bucle = (DecisionFigura) currentSel;
                                bucle.setIsLoop(true);

                                JOptionPane.showMessageDialog(bg_flujo, "Marcado como bucle");
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(bg_flujo, "No se puedo agregar al arbol!");
                            ex.printStackTrace();
                        }

                    }
                });

                //agregar condicionales al arbol
                isConditional.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (currentSel instanceof DecisionFigura) {
                                DecisionFigura condicional = (DecisionFigura) currentSel;
                                condicional.setIsConditional(true);

                                JOptionPane.showMessageDialog(bg_flujo, "Marcado como condicional");
                            }

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(bg_flujo, "No se puedo agregar al arbol!");
                            ex.printStackTrace();
                        }

                    }
                });

                // Copiar 
                copy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {

                            if (currentSel instanceof ProcesoFigura) {

                                ProcesoFigura claseCopiada = new ProcesoFigura(currentSel);

                                copiedFigures.add(claseCopiada);

                                workArea.revalidate();
                                workArea.repaint();

                                if (!copiedFigures.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_flujo, "Copiado!");
                                }
                            }
                            if (currentSel instanceof DecisionFigura) {

                                DecisionFigura claseCopiada = new DecisionFigura(currentSel);

                                copiedFigures.add(claseCopiada);

                                workArea.revalidate();
                                workArea.repaint();

                                if (!copiedFigures.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_flujo, "Copiado!");
                                }
                            }
                            if (currentSel instanceof InicioFigura) {
                                InicioFigura claseCopiada = new InicioFigura(currentSel);

                                copiedFigures.add(claseCopiada);

                                workArea.revalidate();
                                workArea.repaint();

                                if (!copiedFigures.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_flujo, "Copiado!");
                                }
                            }
                           
                            if (currentSel instanceof DatosFigura) {
                                DatosFigura claseCopiada = new DatosFigura(currentSel);

                                copiedFigures.add(claseCopiada);

                                workArea.revalidate();
                                workArea.repaint();

                                if (!copiedFigures.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_flujo, "Copiado!");
                                }
                            }
                            if (currentSel instanceof Documento) {
                                Documento claseCopiada = new Documento(currentSel);

                                copiedFigures.add(claseCopiada);

                                workArea.revalidate();
                                workArea.repaint();

                                if (!copiedFigures.isEmpty()) {
                                    JOptionPane.showMessageDialog(bg_flujo, "Copiado!");
                                }
                            }

                        } catch (NullPointerException ex) {
                            JOptionPane.showMessageDialog(bg_flujo, "Debe seleccionar primero la figura", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                });

                //cargar Arbol
                loadTree.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (currentSel instanceof ProcesoFigura) {
                                ProcesoFigura figToLoad = (ProcesoFigura) currentSel;
                                generarArbol(figToLoad);

                            }
                            if (currentSel instanceof DecisionFigura) {
                                DecisionFigura figToLoad = (DecisionFigura) currentSel;

                                generarArbol(figToLoad);
                                if (figToLoad.isIsLoop()) {
                                    bucles.add(figToLoad);
                                } else if (figToLoad.isIsConditional()) {
                                    condicionales.add(figToLoad);
                                }

                            }
                            if (currentSel instanceof InicioFigura) {
                                InicioFigura figToLoad = (InicioFigura) currentSel;
                                generarArbol(figToLoad);
                            }
                            if (currentSel instanceof DatosFigura) {
                                DatosFigura figToLoad = (DatosFigura) currentSel;
                                generarArbol(figToLoad);
                            }

                        } catch (NullPointerException ex) {
                            JOptionPane.showMessageDialog(bg_flujo, "Seleccione primero la figura que desea cargar", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });

                //Cambiar color del font
                changeFontColor.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (currentSel instanceof ProcesoFigura) {
                                ProcesoFigura papada = (ProcesoFigura) currentSel;

                                docText = papada.getText().getStyledDocument();
                                styleText = papada.getText().addStyle("myStyleText", null);

                                Color fontColor = JColorChooser.showDialog(bg_flujo, "Seleccione Color", Color.red);

                                StyleConstants.setForeground(styleText, fontColor);

                                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            }
                            if (currentSel instanceof DecisionFigura) {
                                DecisionFigura papada = (DecisionFigura) currentSel;
                                docText = papada.getText().getStyledDocument();
                                styleText = papada.getText().addStyle("myStyleText", null);

                                Color fontColor = JColorChooser.showDialog(bg_flujo, "Seleccione Color", Color.red);

                                StyleConstants.setForeground(styleText, fontColor);

                                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            }
                            if (currentSel instanceof InicioFigura) {
                                InicioFigura papada = (InicioFigura) currentSel;
                                docText = papada.getText().getStyledDocument();
                                styleText = papada.getText().addStyle("myStyleText", null);

                                Color fontColor = JColorChooser.showDialog(bg_flujo, "Seleccione Color", Color.red);

                                StyleConstants.setForeground(styleText, fontColor);

                                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            }
                         
                            if (currentSel instanceof DatosFigura) {
                                DatosFigura papada = (DatosFigura) currentSel;
                                docText = papada.getText().getStyledDocument();
                                styleText = papada.getText().addStyle("myStyleText", null);

                                Color fontColor = JColorChooser.showDialog(bg_flujo, "Seleccione Color", Color.red);

                                StyleConstants.setForeground(styleText, fontColor);

                                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            }
                            if (currentSel instanceof Documento) {
                                Documento papada = (Documento) currentSel;
                                docText = papada.getText().getStyledDocument();
                                styleText = papada.getText().addStyle("myStyleText", null);

                                Color fontColor = JColorChooser.showDialog(bg_flujo, "Seleccione Color", Color.red);

                                StyleConstants.setForeground(styleText, fontColor);

                                docText.setCharacterAttributes(0, docText.getLength(), styleText, true);

                            }

                        } catch (Exception ex) {
                        }
                    }
                });
                /*
                 */

                // Eliminar
                delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (source instanceof JPanel) {

                            int op = JOptionPane.showConfirmDialog(bg_flujo, "Esta seguro que desea eliminar?");

                            if (op == JOptionPane.YES_OPTION) {
                                JPanel selected = (JPanel) source;
                                workArea.remove(selected);
                                workArea.revalidate();
                                workArea.repaint();

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
        // dice a la computadora, donde esta el objeto con relacion a "la pantalla" que lo contiene.
        Component source = e.getComponent(); //guarda el objeto de donde se origina el evento

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
