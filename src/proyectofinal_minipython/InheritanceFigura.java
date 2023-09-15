
package proyectofinal_minipython;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class InheritanceFigura extends ClasseFigura{
    
    ClasseFigura clasePadre = new ClasseFigura();
    

    public InheritanceFigura() {
        super();
    }
    
    public InheritanceFigura(InheritanceFigura c) {
        super();
        this.copyInh(c);
    }

    public ClasseFigura getClasePadre() {
        return clasePadre;
    }

    public void setClasePadre(ClasseFigura clasePadre) {
        this.clasePadre = clasePadre;
    }
    
    

    public InheritanceFigura(int sizeX, int sizeY, int locX, int locY, Font font, JTextPane tA) {
        super(sizeX, sizeY, locX, locY, font);
        
        tit.setText(tA.getText());
        
        titulo.setText("ClaseHija");
        titulo.setPreferredSize(new Dimension(140, 30));
        
        titleBG.setPreferredSize(new Dimension(getWidth(), 60));
        titleBG.add(tit);
        titleBG.add(titulo);
        
        
    }
    
    public void copyInh(InheritanceFigura c){
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
