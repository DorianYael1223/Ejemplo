package Ejemplo;

public class EjemploException {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        try {
            cuenta.retirar(3100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {

            throw new SaldoInsuficienteException("Saldo insuficiente para retirara: " + cantidad);

        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
    }

}
