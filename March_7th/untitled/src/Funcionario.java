package untitled.src;

public class Funcionario extends Main{
    public double valorHora, salario, bonus;
    private int horasTrabalhadas;
    public String nome;
    public void setNome(String nome) {
            this.nome = nome; }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora; }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas; }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas; }
    public void calcularSalario() {
        salario = valorHora * horasTrabalhadas;
        System.out.println("O salário do funcionário é: R$ " + salario);
    }
}