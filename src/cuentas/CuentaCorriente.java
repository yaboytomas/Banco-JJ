package cuentas;

public class CuentaCorriente extends Cuenta{

    // Atributos
    private int saldoCorriente = getSaldo();

    // Constructor
    public CuentaCorriente(int saldo) {
        super(saldo);
    }

    // Depositar
    public void depositar(int monto) {
        saldoCorriente += monto;
        System.out.println("Depósito de $" + monto + " realizado con éxito a cuenta corriente.");
        System.out.println("El saldo de la Cuenta Corriente ahora es: $" + saldoCorriente);
        System.out.println();
    }

    // Retirar
    public void retirar(int monto) {
        if (saldoCorriente >= monto) {
            saldoCorriente -= monto;
            System.out.println("Retiro de $" + monto + " realizado con éxito de la cuenta corriente.");
            System.out.println("El saldo de la Cuenta Corriente ahora es: $" + saldoCorriente);
            System.out.println();
        } else {
            System.out.println("No hay sufficiente saldo para realizar el retiro.");
            System.out.println();
        }
    }

}
