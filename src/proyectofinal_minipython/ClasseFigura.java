package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class ClasseFigura extends JPanel {

    private int sizeX, sizeY, locX, locY;

    protected JPanel titleBG = new JPanel();
    protected JTextArea titulo = new JTextArea("NombreClase");

    private Font font = null;
    private JTextArea textA = new JTextArea(1, 10);
    
    private ArrayList<JTextArea> miembros = new ArrayList<>();

    public ArrayList<JTextArea> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<JTextArea> miembros) {
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
        titleBG.setPreferredSize(new Dimension(getWidth(), 40));

        //Atributos del textArea del titulo
        titulo.setRows(1);
        titulo.setColumns(2);
        titulo.setPreferredSize(new Dimension(170, 30));
        titulo.setBackground(new Color(70, 114, 196));
        titulo.setFont(font);
        titleBG.add(titulo);

        add(titleBG); //agrega el panel del titulo

        add(textA);

    }

    public JTextArea getTitulo() {
        return titulo;
    }

    public void setTitulo(JTextArea titulo) {
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

    public JTextArea getTextA() {
        return textA;
    }

    public void setTextA(JTextArea textA) {
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

        this.titulo = new JTextArea(c.getTitulo().getText());
        this.titulo.setRows(c.getTitulo().getRows());
        this.titulo.setColumns(c.getTitulo().getColumns());
        this.titulo.setPreferredSize(c.getTitulo().getPreferredSize());
        this.titulo.setBackground(c.getTitulo().getBackground());
        this.titulo.setFont(c.getTitulo().getFont());
        this.titleBG.add(this.titulo);
        
        this.textA = new JTextArea(c.getTextA().getText());
        this.textA.setRows(c.getTextA().getRows());
        this.textA.setColumns(c.getTextA().getColumns());
        
        this.add(this.titleBG);
        this.add(this.textA);

        for (JTextArea miembro : c.miembros) {
            JTextArea copiedMiembro = new JTextArea(miembro.getText());
            copiedMiembro.setRows(miembro.getRows());
            copiedMiembro.setColumns(miembro.getColumns());
            
            this.add(copiedMiembro);
            this.miembros.add(copiedMiembro);
            
            
        }
        
        
        

        
        

    }

    

}
