
package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;


public class Documento extends JPanel{
    private int sizeX, sizeY, locX, locY;
    
    protected JTextPane text = new JTextPane();
    Color color = new Color(255, 255, 255);
    
    private Font font = null;
    
    private ArrayList<JTextPane> miembros = new ArrayList<>();
    
    public Documento(int sizeX, int sizeY, int locX, int locY, Font font) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;

        //Atributos de la figura "proceso"
        setBackground(new Color(70, 114, 196));
        setSize(new Dimension(sizeX, sizeY));
        setLocation(locX / 2, locY / 2);
        
        
        
        text.setText("Instruccion");
        
        add(text);
        
        repaint();
        
    }
    
    public Documento(JPanel c) {
        super();
        this.copy(c);
    }
    
     public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
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

    public JTextPane getText() {
        return text;
    }

    public void setText(JTextPane text) {
        this.text = text;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public ArrayList<JTextPane> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<JTextPane> miembros) {
        this.miembros = miembros;
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(color);
        g.fillRect(2, 2, 95, 55);
        
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(2, 30, 30, 50,95, 35);
        g2d.setColor(new Color(70, 114, 196));
        g2d.draw(q);
        
    }
    
    public void copy(JPanel c) {
        
        Documento newC = (Documento) c;
        this.setBackground(newC.getBackground());
        this.setSize(newC.getSize());
        this.setLocation(newC.getLocation());

        this.text = new JTextPane();
        this.text.setText(newC.getText().getText());

        this.add(this.text);

    }
}
