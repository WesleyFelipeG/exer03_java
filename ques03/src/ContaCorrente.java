public class ContaCorrente extends Conta {
    private final double chequeEspecial = 1000;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Utilização do cheque especial realizada com sucesso.");
            mostrarSaldo();
        } else {
            System.out.println("Limite do cheque especial ultrapassado.");
        }
    }
}