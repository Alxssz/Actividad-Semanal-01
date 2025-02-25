package Alarma;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Alarma {
    
    private int tiempo;
    private boolean activada;

    // Constructor
    public Alarma(int tiempo) {
        this.tiempo = tiempo;
        this.activada = false;
    }

    // Metodo
    public void verificarAlarma(int tiempoActual) {
        if (tiempoActual >= tiempo) {
            //alarma activada
            activada = true;
            System.out.println("Alarma activada tiempo alcanzado");
        }
    }

    public boolean getActivada() {
        return activada;
    }

    public int getTiempo() {
        return tiempo;
    }
}
