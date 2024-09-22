package cuentas;

public abstract class Cuenta {

    // Atributos
    private int saldo;

    // Constructor
    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    // Getters y Setters
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
