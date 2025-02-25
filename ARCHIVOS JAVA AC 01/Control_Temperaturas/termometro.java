package Control_Temperaturas;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class termometro {

    private double tempCelsius;

    
    //constrauctir
    public termometro(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    
    
    //metodos
    public double convertirAFahrenheit() {
        return (tempCelsius * 9 / 5) + 32;
    }

    public double getTempFahrenheit() {
        return convertirAFahrenheit();
    }

    
    
    public double convertirAKelvin() {
        return tempCelsius + 273.15;
    }

    public double getTempKelvin() {
        return convertirAKelvin();
    }
}
