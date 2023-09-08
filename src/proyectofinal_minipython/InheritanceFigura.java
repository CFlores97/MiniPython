
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class InheritanceFigura extends ClasseFigura{
    JLabel tit = null;

    public InheritanceFigura() {
        super();
    }

    public InheritanceFigura(int sizeX, int sizeY, int locX, int locY, Font font, JTextArea tA) {
        super(sizeX, sizeY, locX, locY, font);
        
        tit = new JLabel("extends " + tA.getText());
        
        titulo.setText("ClaseHija");
        titulo.setPreferredSize(new Dimension(140, 30));
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
    
    
    
    
    
}
