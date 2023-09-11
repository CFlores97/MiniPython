
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;


public class InterfazFigura extends ClasseFigura{
    

    public InterfazFigura() {
        super();
    }

    public InterfazFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        super(sizeX, sizeY, locX, locY, font);
        
        tit.setText("<<Interfaz>>");
        titulo.setText("NombreInterfaz");
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
}
