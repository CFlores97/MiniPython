
package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;


public class DatosDecision implements Serializable{
    private int sizeX, sizeY, locX, locY;
    
    
    private boolean isLoop;
    private boolean isConditional;
    
    private Color color;
    
    private String text;
    
    private StyledDocument docText;
    private Style styleText;
    
    private Font font = null;

    public DatosDecision(int sizeX, int sizeY, int locX, int locY, String text, Font font) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;
        this.text = text;
    }

    public boolean isIsLoop() {
        return isLoop;
    }

    public StyledDocument getDocText() {
        return docText;
    }

    public void setDocText(StyledDocument docText) {
        this.docText = docText;
    }

    public Style getStyleText() {
        return styleText;
    }

    public void setStyleText(Style styleText) {
        this.styleText = styleText;
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

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    
    
}
