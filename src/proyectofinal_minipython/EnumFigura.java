
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class EnumFigura extends ClasseFigura{
    JLabel tit = new JLabel("<<Enum>>");

    public EnumFigura() {
        super();
    }

    public EnumFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        super(sizeX, sizeY, locX, locY, font);
        
        titulo.setText("NombreEnumeración");
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
    
    
    
}
