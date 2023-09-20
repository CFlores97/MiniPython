
package proyectofinal_minipython;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;


public class DatosInheritance extends DatosClasse implements Serializable{
    private String tA;
    

    public DatosInheritance() {
        super();
    }

    public DatosInheritance(int sizeX, int sizeY, int locX, int locY, String titulo, String tA, Color color) {
        super(sizeX, sizeY, locX, locY, titulo, color);
        this.tA = tA;
    }
    
    

    public String gettA() {
        return tA;
    }

    public void settA(String tA) {
        this.tA = tA;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<String> metodos) {
        this.metodos = metodos;
    }
    
    
    
}
