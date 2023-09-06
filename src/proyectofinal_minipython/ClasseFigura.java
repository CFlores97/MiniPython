
package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class ClasseFigura extends JPanel{
    private int sizeX, sizeY, locX, locY;
    protected JPanel titleBG = new JPanel();
    protected JTextArea titulo = new JTextArea("NombreClase");
    private Font font = null;
    JTextArea textA = new JTextArea(1, 10);

    public ClasseFigura() {
        super();
    }

    
    
    public ClasseFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;
        
        //Atributos de la figura "clase"
        setBackground(new Color(242, 242, 242));
        setSize(200, 100);
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
    
    
    
    
}
