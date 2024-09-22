package cuentas;

public class CuentaAhorro extends Cuenta {

    // Atributos
    private int saldoAhorro = getSaldo();

    // Constructor
    public CuentaAhorro(int saldo) {
        super(saldo);
    }

    // Depositar
    public void depositar(int monto) {
        saldoAhorro += monto;
        System.out.println("Depósito de $" + monto + " realizado con éxito a cuenta de ahorro.");
        System.out.println("El saldo de la Cuenta Ahorro ahora es: $" + saldoAhorro);
        System.out.println();
    }

    // Retirar
    public void retirar(int monto) {
        if (saldoAhorro >= monto) {
            saldoAhorro -= monto;
            System.out.println("Retiro de $" + monto + " realizado con éxito de la cuenta de ahorro.");
            System.out.println("El saldo de la Cuenta Ahorro ahora es: $" + saldoAhorro);
            System.out.println();
        } else {
            System.out.println("No hay sufficiente saldo para realizar el retiro.");
            System.out.println();

        }
    }

}
