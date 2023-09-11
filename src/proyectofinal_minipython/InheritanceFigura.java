
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class InheritanceFigura extends ClasseFigura{
    

    public InheritanceFigura() {
        super();
    }

    public InheritanceFigura(int sizeX, int sizeY, int locX, int locY, Font font, JTextPane tA) {
        super(sizeX, sizeY, locX, locY, font);
        
        tit.setText("extends " + tA.getText());
        
        titulo.setText("ClaseHija");
        titulo.setPreferredSize(new Dimension(140, 30));
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
    
    
    
    
    
}
