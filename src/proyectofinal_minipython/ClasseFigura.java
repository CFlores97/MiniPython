package proyectofinal_minipython;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ClasseFigura extends JPanel implements Serializable {

    private int sizeX, sizeY, locX, locY;
    private Color color, fontColor;
    private StyledDocument docText, docTit;
    private Style styleText, stlyeTit;

    protected JPanel titleBG = new JPanel();
    protected JTextPane titulo = new JTextPane();
    protected JLabel tit = new JLabel("<<Clase>>");

    private Font font = null;
    private JTextPane textA = new JTextPane();
    private JTextPane textM = new JTextPane();
    private JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);

    //Atributos y Metodos
    protected ArrayList<JTextPane> atributos = new ArrayList<>();
    protected ArrayList<JTextPane> metodos = new ArrayList<>();

    public ArrayList<JTextPane> getAtributos() {
        return atributos;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }
    

    public void setAtributos(ArrayList<JTextPane> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<JTextPane> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<JTextPane> metodos) {
        this.metodos = metodos;
    }

    public JTextPane getTextM() {
        return textM;
    }

    public void setTextM(JTextPane textM) {
        this.textM = textM;
    }

    public StyledDocument getDocText() {
        return docText;
    }

    public void setDocText(StyledDocument docText) {
        this.docText = docText;
    }

    public StyledDocument getDocTit() {
        return docTit;
    }

    public void setDocTit(StyledDocument docTit) {
        this.docTit = docTit;
    }

    public Style getStyleText() {
        return styleText;
    }

    public void setStyleText(Style styleText) {
        this.styleText = styleText;
    }

    public Style getStlyeTit() {
        return stlyeTit;
    }

    public void setStlyeTit(Style stlyeTit) {
        this.stlyeTit = stlyeTit;
    }

    public ClasseFigura() {
    }

    public ClasseFigura(ClasseFigura c) {
        super();
        this.copy(c);
    }

    public ClasseFigura(int sizeX, int sizeY, int locX, int locY, Font font, Color color) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.locX = locX;
        this.locY = locY;
        this.font = font;
        this.color = color;

        //Atributos de la figura "clase"
        setBackground(new Color(242, 242, 242));
        setSize(sizeX, sizeY);
        setLocation(locX / 2, locY / 2);

        //Atributos del panel del titulo
        titleBG.setBackground(color);
        titleBG.setPreferredSize(new Dimension(getWidth(), 50));

        //Atributos del textArea del titulo
        titulo.setSize(1, 2);
        titulo.setText("NombreClase");
        titulo.setPreferredSize(new Dimension(170, 30));
        titulo.setBackground(new Color(70, 114, 196));
        titulo.setFont(font);
        titulo.setForeground(Color.BLACK);

        titleBG.add(tit);
        titleBG.add(titulo);

        //Atributos del atributo
        textA.setText("NombreAtributo");
        textA.setBounds(getWidth() / 2, getHeight() / 2, 300, 200);
        textA.setMinimumSize(new Dimension(300, 200));
        textA.setMaximumSize(new Dimension(300, 200));
        //atributos.add(textA);

        //Atributos del metodo 
        textM.setText("NombreMetodo");
        textM.setBounds(getWidth() / 2, getHeight() / 2, 300, 200);
        textM.setMinimumSize(new Dimension(300, 200));
        textM.setMaximumSize(new Dimension(300, 200));
        //metodos.add(textM);
        
        textA.setPreferredSize(new Dimension(300, textA.getHeight()));
        textA.setMinimumSize(new Dimension(300, textA.getHeight()));
        textA.setMaximumSize(new Dimension(300, textA.getHeight()));

        add(titleBG); //agrega el panel del titulo

        /*add(textA);
        add(textM);*/
 /*
        for (JTextPane atributo : atributos) {
            add(atributo);
        }
        for (JTextPane metodo : metodos) {
            add(metodo);
        }*/
        add(separator);

        //revalidate();
        repaint();

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public JLabel getTit() {
        return tit;
    }

    public void setTit(JLabel tit) {
        this.tit = tit;
    }

    public JSeparator getSeparator() {
        return separator;
    }

    public void setSeparator(JSeparator separator) {
        this.separator = separator;
    }

    public JTextPane getTitulo() {
        return titulo;
    }

    public void setTitulo(JTextPane titulo) {
        this.titulo = titulo;
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

    public JPanel getTitleBG() {
        return titleBG;
    }

    public void setTitleBG(JPanel titleBG) {
        this.titleBG = titleBG;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public JTextPane getTextA() {
        return textA;
    }

    public void setTextA(JTextPane textA) {
        this.textA = textA;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    public void copy(ClasseFigura c) {
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

            StyledDocument tempDocText = copiedAtributo.getStyledDocument();
            Style tempTextStlye = copiedAtributo.addStyle("myStyleText", null);

            StyleConstants.setForeground(tempTextStlye, c.getFontColor());
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

            StyleConstants.setForeground(tempTextStlye, c.getFontColor());
            tempDocText.setCharacterAttributes(0, tempDocText.getLength(), tempTextStlye, true);

            
            this.add(copiedMetodo);
            this.metodos.add(copiedMetodo);

        }

    }

}
