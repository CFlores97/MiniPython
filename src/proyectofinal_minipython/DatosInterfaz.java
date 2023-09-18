package proyectofinal_minipython;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

public class DatosInterfaz extends DatosClasse implements Serializable {

    public DatosInterfaz() {
        super();
    }

    public DatosInterfaz(int sizeX, int sizeY, int locX, int locY, String titulo, Color color) {
        super(sizeX, sizeY, locX, locY, titulo, color);
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
