  package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

public class DecisionFigura extends JPanel {
    private int sizeX, sizeY, locX, locY;
    private boolean isLoop;
    private boolean isConditional;

    protected JTextPane text = new JTextPane();
    private Color color;

    private Font font = null;

    private ArrayList<JTextPane> miembros = new ArrayList<>();
    

    public DecisionFigura(int sizeX, int sizeY, int locX, int locY, Font font, Color color) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;
        this.color = color;

        //Atributos de la figura "proceso"
        setBackground(Color.WHITE);
        setSize(new Dimension(sizeX, sizeY));
        setLocation(locX / 2, locY / 2);

        text.setText("Instruccion");

        add(text);

        repaint();
    }

    
    
    public boolean isIsLoop() {
        return isLoop;
    }
    
    public void setIsLoop(boolean isLoop) {
        this.isLoop = isLoop;
    }

    public boolean isIsConditional() {
        return isConditional;
    }

    public void setIsConditional(boolean isConditional) {
        this.isConditional = isConditional;
    }
    
    
    
    public DecisionFigura(JPanel c) {
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

    public JTextPane getText() {
        return text;
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

    public void setText(JTextPane text) {
        this.text = text;
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
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int w = 100;
        int h = 60;

        int[] xPoints = {x, x + w / 2, x, x - w / 2};
        int[] yPoints = {y - h / 2, y, y + h / 2, y};

        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 4); // Dibujar el rombo
    }
    
    public void copy(JPanel c) {
        
        DecisionFigura newC = (DecisionFigura) c;
        this.setBackground(newC.getBackground());
        this.setSize(newC.getSize());
        this.setLocation(newC.getLocation());

        this.text = new JTextPane();
        this.text.setText(newC.getText().getText());

        this.add(this.text);

    }

    @Override
    public String toString() {
        return text.getText();
    }
    
    

}
