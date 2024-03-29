import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Televisao tv = new Televisao("Smart TV", 10, 2000.0);
        Smartphone sp = new Smartphone("iPhone", 20, 3000.0);

        System.out.println("Seleciona a compra");
        System.out.println("1. Comprar TV");
        System.out.println("2. Comprar Smartphone");
        int opcao = scanner.nextInt();

        System.out.println("Quantidade desejada:");
        int quantidade = scanner.nextInt();

        switch (opcao) {
            case 1:
                tv.vender(quantidade);
                tv.acessarCanais();
                break;
            case 2:
                sp.vender(quantidade);
                sp.ligacao();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
