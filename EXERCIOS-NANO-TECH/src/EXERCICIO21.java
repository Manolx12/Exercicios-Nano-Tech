
class Produto {
    String nome;
    int quantidadeEstoque;

    // Método para verificar a necessidade de reposição de estoque
    public boolean precisaReporEstoque() {
        return this.quantidadeEstoque < 10;
    }
}

// Classe Principal


public class EXERCICIO21 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "XBOX SERIES S";
        produto.quantidadeEstoque = 9; // Altere a quantidade para testar diferentes cenários

        System.out.println("O produto " + produto.nome + " precisa repor o estoque? " + produto.precisaReporEstoque());
    }
}