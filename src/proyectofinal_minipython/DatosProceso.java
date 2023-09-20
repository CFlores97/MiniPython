
package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;


public class DatosProceso implements Serializable{
    private int sizeX, sizeY, locX, locY;
    
    private Color color;
    
    private String text;
    private StyledDocument docText;
    private Style styleText;
    
    private Font font = null;

    public DatosProceso(int sizeX, int sizeY, int locX, int locY,  String text, Font font) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.text = text;
        this.font = font;
    }

    public Style getStyleText() {
        return styleText;
    }

    public void setStyleText(Style styleText) {
        this.styleText = styleText;
    }

    public StyledDocument getDocText() {
        return docText;
    }

    public void setDocText(StyledDocument docText) {
        this.docText = docText;
    }

    
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "DatosProceso{" + "sizeX=" + sizeX + ", sizeY=" + sizeY + ", locX=" + locX + ", locY=" + locY + ", color=" + color + ", text=" + text + '}';
    }
    
    
}
