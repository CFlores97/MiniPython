package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class InheritanceFigura extends ClasseFigura {

    ClasseFigura clasePadre = new ClasseFigura();
    private JTextPane tA;

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

    public InheritanceFigura(int sizeX, int sizeY, int locX, int locY, Font font, JTextPane tA, Color color) {
        super(sizeX, sizeY, locX, locY, font, color);
        this.tA = tA;

        tit.setText(tA.getText());

        titulo.setText("ClaseHija");
        titulo.setPreferredSize(new Dimension(140, 30));

        titleBG.setPreferredSize(new Dimension(getWidth(), 60));

        /*
        for (JTextPane metodo : clasePadre.getMetodos()) {
            if (metodo.getText().contains("@")) {
                JOptionPane.showMessageDialog(null, "si tiene");
                JTextPane abMet = new JTextPane();
                abMet.setText(metodo.getText());
                abMet.setBounds(getWidth() / 2, getHeight() / 2, 300, 200);
                abMet.setMinimumSize(new Dimension(300, 200));
                abMet.setMaximumSize(new Dimension(300, 200));
                add(abMet);
            }
        }*/
        titleBG.add(tit);
        titleBG.add(titulo);

    }

    public JTextPane gettA() {
        return tA;
    }

    public void settA(JTextPane tA) {
        this.tA = tA;
    }
    
    

    public void copyInh(InheritanceFigura c) {
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
        System.out.println(tA);
        this.tit.setForeground(c.getTit().getForeground());

        this.titleBG.add(this.tit);
        this.titleBG.add(this.titulo);

        this.add(this.titleBG);

        for (JTextPane atributo : c.atributos) {
            JTextPane copiedAtributo = new JTextPane();
            copiedAtributo.setText(atributo.getText());
            copiedAtributo.setSize(atributo.getSize());
            
            StyledDocument tempDocText = copiedAtributo.getStyledDocument();
            Style tempTextStlye = copiedAtributo.addStyle("myStyleText", null);

//            StyleConstants.setForeground(tempTextStlye, c.getFontColor());
            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);
            
            this.add(copiedAtributo);
            this.atributos.add(copiedAtributo);

        }
        for (JTextPane metodo : c.metodos) {
            JTextPane copiedMetodo = new JTextPane();
            copiedMetodo.setText(metodo.getText());
            copiedMetodo.setSize(metodo.getSize());

            StyledDocument tempDocText = copiedMetodo.getStyledDocument();
            Style tempTextStlye = copiedMetodo.addStyle("myStyleText", null);

//            StyleConstants.setForeground(tempTextStlye, c.getFontColor());
            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);

            this.add(copiedMetodo);
            this.metodos.add(copiedMetodo);

        }
    }

}
