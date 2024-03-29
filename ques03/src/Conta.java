public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
            mostrarSaldo();
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            mostrarSaldo();
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo disponível: R$" + saldo);
    }
}