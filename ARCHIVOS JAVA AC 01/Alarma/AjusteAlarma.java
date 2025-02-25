package Alarma;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class AjusteAlarma{

    public static void main(String[] args) {
        
        //nuevo temporizador y alarma
        Temporizador temporizador = new Temporizador();
        Alarma alarma = new Alarma(10); 
        
        System.out.println("Alarma establecida en "+ alarma.getTiempo()+  " segundos");
         
        // alarma establecida y ingresar temporizador
        temporizador.setAlarma(alarma);
        temporizador.iniciar(30); 
    }
}

