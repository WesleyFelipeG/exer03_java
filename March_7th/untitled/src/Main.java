package untitled.src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario F = new Funcionario();
        Gerente G = new Gerente();
        Diretor D = new Diretor();

        System.out.println("Digite o nome do usuário: ");
        F.setNome(sc.nextLine());

        System.out.println("Digite o valor da hora trabalhada: R$ ");
        F.setValorHora(sc.nextDouble());

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        F.setHorasTrabalhadas(sc.nextInt());

        System.out.println("Digite o nome do gerente: ");
        G.setNomeGerente(sc.next());

        System.out.println("Digite o departamento do gerente: ");
        G.setDepartamento(sc.next());

        System.out.println("Digite o nome do Diretor: ");
        D.setNomeDiretor(sc.next());

        System.out.println("Digite a quantidade de ações do diretor: ");
        D.setAcoesDiretor(sc.nextDouble());

        F.calcularSalario();
        G.calcularBonus();
        System.out.println("Funcionário: "+ F.nome);
        System.out.println("O valor da hora: "+ F.valorHora+ " R$, trabalhando " + F.getHorasTrabalhadas()+ " horas");
        System.out.println("Salário bruto: "+ F.salario);
        System.out.println("Bonus: "+ G.bonus);
        System.out.println("Gerente: "+ G.nomeGerente);
        System.out.println("Departamento: "+ G.departamento);
        System.out.println("Diretor: "+ D.nomeDiretor);
        System.out.println("Ações do diretor: "+ D.acoesDiretor);
    }
}