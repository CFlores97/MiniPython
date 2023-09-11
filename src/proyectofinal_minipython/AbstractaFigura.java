
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;


public class AbstractaFigura extends ClasseFigura{

    public AbstractaFigura() {
        super();
    }

    public AbstractaFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        super(sizeX, sizeY, locX, locY, font);
        
        titulo.setText("NombreAbstracta");
        tit.setText("<<Abstract>>");
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
}
