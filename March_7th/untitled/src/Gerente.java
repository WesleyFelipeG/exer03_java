package untitled.src;

public class Gerente extends Funcionario {
    public String nomeGerente, departamento;
    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double calcularBonus() {
        bonus = super.salario * 0.1;
        return bonus;
    }
}
