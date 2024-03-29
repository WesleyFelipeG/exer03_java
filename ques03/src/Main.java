import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        if (tipoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(nomeTitular);
            menuContaCorrente(contaCorrente, scanner);
        } else if (tipoConta == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(nomeTitular);
            menuContaPoupanca(contaPoupanca, scanner);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void menuContaCorrente(ContaCorrente conta, Scanner scanner) {
    }

    public static void menuContaPoupanca(ContaPoupanca conta, Scanner scanner) {
        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular rendimento");
            System.out.println("4. Exibir dados da conta");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.print("Digite a taxa Selic atual: ");
                    double selic = scanner.nextDouble();
                    conta.calcularRendimento(selic);
                    break;
                case 4:
                    conta.mostrarSaldo();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}