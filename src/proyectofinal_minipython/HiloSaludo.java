package proyectofinal_minipython;

import java.util.Date;
import javax.swing.JLabel;

public class HiloSaludo implements Runnable {

    private JLabel saludo;

    public HiloSaludo(JLabel saludo) {
        this.saludo = saludo;
    }

    public void changeWelcome(JLabel welcome) {
        Date d = new Date();
        int hora = d.getHours();
        
        if(hora >= 0 && hora <= 12){
            welcome.setText("Buenos Dias :D");
        }else if(hora > 12 && hora <= 18){
            welcome.setText("Buenas Tardes :D");
        }
        else{
            welcome.setText("Buenas noches :D");
        }
    }

    @Override
    public void run() {
        while (true) {
            changeWelcome(saludo);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }

}
