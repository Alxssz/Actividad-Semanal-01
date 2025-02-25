package Alarma;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Temporizador {
    
    
    private int tiempoActual;
    private Alarma alarma;

    // Constructor
    public Temporizador() {
        this.tiempoActual = 0;
    }
    
    // Metodos
    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    
    // Método para iniciar el temporizador
    public void iniciar(int tiempoMaximo) {
        for (tiempoActual = 0; tiempoActual <= tiempoMaximo; tiempoActual++) {
            System.out.println("Tiempo : " + tiempoActual + " segundos");
            
            
            // Verificar si la alarma debe activarse
            if (alarma != null) {
                alarma.verificarAlarma(tiempoActual);
                
                //si la alarma se activa se rompe el conteo
                if (alarma.getActivada()) {
                break;
                
                }
            }
        }
    }
}
