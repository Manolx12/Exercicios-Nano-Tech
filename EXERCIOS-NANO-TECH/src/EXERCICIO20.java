
class Produto {
    String nome;
    int quantidadeEstoque;
}


public class EXERCICIO20 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "XBOX SERIES S";
        produto.quantidadeEstoque = 11; // E preciso alterar a quantidade para testar se é necessario repor

        System.out.println("O produto " + produto.nome + " precisa repor o estoque? " + verificarReposicaoEstoque(produto));
    }

  
    public static boolean verificarReposicaoEstoque(Produto produto) {
        return produto.quantidadeEstoque < 10;
    }
}