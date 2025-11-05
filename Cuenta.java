public class Cuenta {
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

    public void retirar(double cantidad) {
        if ((this.saldo - cantidad) >= -500.0) {
            this.saldo -= cantidad;
        }
    }
}