public class Smartphone extends Produto {
    public Smartphone(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public void ligacao() {
        System.out.println("Realizando ligação com o smartphone " + getNome() + "...");
    }
}