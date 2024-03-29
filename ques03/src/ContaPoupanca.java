public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado e adicionado ao saldo.");
        mostrarSaldo();
    }
}