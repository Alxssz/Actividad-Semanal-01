package Gestion_Cuentas;
/**
 *
 * @author Eddy Boror Ruiz
 */
public class Cuenta {

    // Caractersticas
    private int numeroCuenta;
    private double saldo;
    private double saldoInicial;

    // Constructor de cuenta
    public Cuenta(int numeroCuenta, double saldoInicial) {

        this.saldoInicial = saldoInicial;
        this.numeroCuenta = numeroCuenta;

        // que el saldo sea mayor a 0
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Ingrese un saldo inicial positivo");
            this.saldo = 0;
        }
    }

    // metodos
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Deposito exitoso de " + cantidad + ", Nuevo saldo:  " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de " + cantidad + ", Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no valida para retirar " + cantidad);
        }
    }

    public double getconsultarSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoInicial() {
        if (saldoInicial >= 0) {
            return saldoInicial;
        }
        return 0;
    }
}
