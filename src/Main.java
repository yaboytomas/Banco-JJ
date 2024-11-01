import cuentas.CuentaAhorro;
import cuentas.CuentaCorriente;

public class Main {
    public static void main(String[] args) {

    // Instancias
        CuentaCorriente cuentaCorriente = new CuentaCorriente(500000);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1000000);

    // Mostrar Saldo
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("                 Banco Szabo                 ");
        System.out.println("---------------------------------------------");
        System.out.println("Saldo Cuenta Corriente: $" + cuentaCorriente.getSaldo());
        System.out.println("Saldo Cuenta Ahorro: $" + cuentaAhorro.getSaldo());
        System.out.println("---------------------------------------------");
        System.out.println();

    // Depositar
        cuentaCorriente.depositar(50000);
        cuentaAhorro.depositar(500000);

    // Retirar
        cuentaCorriente.retirar(43);
        cuentaAhorro.retirar(999);
    }
}