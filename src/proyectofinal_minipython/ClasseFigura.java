package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class ClasseFigura extends JPanel {

    private int sizeX, sizeY, locX, locY;

    protected JPanel titleBG = new JPanel();
    protected JTextPane titulo = new JTextPane();
    protected JLabel tit = new JLabel("<<Clase>>");

    private Font font = null;
    private JTextPane textA = new JTextPane();
    private JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);

    private ArrayList<JTextPane> miembros = new ArrayList<>();

    public ArrayList<JTextPane> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<JTextPane> miembros) {
        this.miembros = miembros;
    }

    public ClasseFigura() {
    }

    public ClasseFigura(ClasseFigura c) {
        super();
        this.copy(c);
    }

    public ClasseFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;

        //Atributos de la figura "clase"
        setBackground(new Color(242, 242, 242));
        setSize(sizeX, sizeY);
        setLocation(locX / 2, locY / 2);

        //Atributos del panel del titulo
        titleBG.setBackground(new Color(70, 114, 196));
        titleBG.setPreferredSize(new Dimension(getWidth(), 50));

        //Atributos del textArea del titulo
        titulo.setSize(1, 2);
        titulo.setText("NombreClase");
        titulo.setPreferredSize(new Dimension(170, 30));
        titulo.setBackground(new Color(70, 114, 196));
        titulo.setFont(font);
        titulo.setForeground(Color.BLACK);
        
        
        titleBG.add(tit);
        titleBG.add(titulo);

        //Atributos del texto 
        textA.setText("NombreMiembro");
        textA.setBounds(getWidth() / 2, getHeight() / 2, 300, 200);
        textA.setMinimumSize(new Dimension(300, 200));
        textA.setMaximumSize(new Dimension(300, 200));
        /*
        textA.setPreferredSize(new Dimension(300, textA.getHeight()));
        textA.setMinimumSize(new Dimension(300, textA.getHeight()));
        textA.setMaximumSize(new Dimension(300, textA.getHeight()));*/
        
        

        add(titleBG); //agrega el panel del titulo

        add(textA);
        add(separator);
        
        //revalidate();
        repaint();

    }

    public JLabel getTit() {
        return tit;
    }

    public void setTit(JLabel tit) {
        this.tit = tit;
    }

    public JSeparator getSeparator() {
        return separator;
    }

    public void setSeparator(JSeparator separator) {
        this.separator = separator;
    }
    

    public JTextPane getTitulo() {
        return titulo;
    }

    public void setTitulo(JTextPane titulo) {
        this.titulo = titulo;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }

    public JPanel getTitleBG() {
        return titleBG;
    }

    public void setTitleBG(JPanel titleBG) {
        this.titleBG = titleBG;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public JTextPane getTextA() {
        return textA;
    }

    public void setTextA(JTextPane textA) {
        this.textA = textA;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    public void copy(ClasseFigura c) {
        this.setBackground(c.getBackground());
        this.setSize(c.getSize());
        this.setLocation(c.getLocation());

        this.titleBG = new JPanel();
        this.titleBG.setBackground(c.getTitleBG().getBackground());
        this.titleBG.setPreferredSize(c.getTitleBG().getPreferredSize());

        this.titulo = new JTextPane();
        this.titulo.setText(c.getTitulo().getText());
        this.titulo.setSize(c.getTitulo().getSize());
        this.titulo.setPreferredSize(c.getTitulo().getPreferredSize());
        this.titulo.setBackground(c.getTitulo().getBackground());
        this.titulo.setFont(c.getTitulo().getFont());
        this.titulo.setForeground(c.getTitulo().getForeground());
        
        this.tit = new JLabel();
        this.tit.setText(c.getTit().getText());
        this.tit.setForeground(c.getTit().getForeground());
        
        this.titleBG.add(this.tit);
        this.titleBG.add(this.titulo);

        this.textA = new JTextPane();
        this.textA.setText(c.getTextA().getText());

        this.textA.setPreferredSize(c.getTextA().getSize());
        this.textA.setForeground(c.getTextA().getForeground());

        this.add(this.titleBG);
        this.add(this.textA);

        for (JTextPane miembro : c.miembros) {
            JTextPane copiedMiembro = new JTextPane();
            copiedMiembro.setText(miembro.getText());
            copiedMiembro.setSize(miembro.getSize());
            this.add(copiedMiembro);
            this.miembros.add(copiedMiembro);

        }

    }

}
