
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class InterfazFigura extends ClasseFigura{
    

    public InterfazFigura() {
        super();
    }
    public InterfazFigura(InterfazFigura c) {
        super();
        this.copyInt(c);
    }
    

    public InterfazFigura(int sizeX, int sizeY, int locX, int locY, Font font) {
        super(sizeX, sizeY, locX, locY, font);
        
        tit.setText("<<Interfaz>>");
        titulo.setText("NombreInterfaz");
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
    }
     public void copyInt(InterfazFigura c){
        this.setBackground(c.getBackground());
        this.setSize(c.getSize());
        this.setLocation(c.getLocation());

        this.titleBG = new JPanel();
        this.titleBG.setBackground(c.getTitleBG().getBackground());
        this.titleBG.setPreferredSize(c.getTitleBG().getPreferredSize());

        this.titulo = new JTextPane();
        this.titulo.setText(c.getTitulo().getText());
        this.titulo.setSize(c.getTitulo().getSize());
        this.titulo.setPreferredSize(c.getTitulo().getPreferredSize());
        this.titulo.setBackground(c.getTitulo().getBackground());
        this.titulo.setFont(c.getTitulo().getFont());
        this.titulo.setForeground(c.getTitulo().getForeground());
        
        this.tit = new JLabel();
        this.tit.setText(c.getTit().getText());
        this.tit.setForeground(c.getTit().getForeground());
        
        this.titleBG.add(this.tit);
        this.titleBG.add(this.titulo);

        
        this.add(this.titleBG);

        for (JTextPane atributo : c.atributos) {
            JTextPane copiedAtributo = new JTextPane();
            copiedAtributo.setText(atributo.getText());
            copiedAtributo.setSize(atributo.getSize());
            this.add(copiedAtributo);
            this.atributos.add(copiedAtributo);

        }
        for (JTextPane metodo : c.metodos) {
            JTextPane copiedMetodo = new JTextPane();
            copiedMetodo.setText(metodo.getText());
            copiedMetodo.setSize(metodo.getSize());
            this.add(copiedMetodo);
            this.metodos.add(copiedMetodo);

        }
    }
    
}
