public class Cuenta {
    private static final double LIMITE_DESCUBIERTO = -500.0;
    private double saldo;
    private String numero;

    public Cuenta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if ((this.saldo - cantidad) >= LIMITE_DESCUBIERTO) {
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}