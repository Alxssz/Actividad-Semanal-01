package Control_Temperaturas;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class temperatura {

    public static void main(String[] args) {
        
        // Crear un termómetro con una temperatura inicial
        termometro termometro = new termometro(25);

        // Mostrar las conversiones
        System.out.println("Temperatura en Celsius: " + termometro.getTempCelsius() + " grados");
        System.out.println("Temperatura en Fahrenheit: " + termometro.getTempFahrenheit() + " grados");
        System.out.println("Temperatura en Kelvin: " + termometro.getTempKelvin()+ " grados");
    }
}

