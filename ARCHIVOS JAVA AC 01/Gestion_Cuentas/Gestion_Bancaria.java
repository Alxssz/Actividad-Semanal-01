package Gestion_Cuentas;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Gestion_Bancaria {
    public static void main(String[] args) {
        
        // Crear cuenta con saldo
        Cuenta cuenta = new Cuenta(12345, 500);

        
        // Operacione
        System.out.println("Numero de cuenta creada: "+ cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getconsultarSaldo());
        System.out.println("");
        
        cuenta.depositar(200);
        System.out.println("");
        
        cuenta.retirar(600);
        System.out.println("");
        System.out.println("Saldo actual: " + cuenta.getconsultarSaldo());

    }
}

