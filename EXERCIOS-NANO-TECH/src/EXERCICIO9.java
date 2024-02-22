import src.Scanner;
import src.String;

public class Exercicio9 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorCompra;
        double valorFrete = 15.0; // Valor padrão do frete

        System.out.print("Digite o valor da compra: R$");
        valorCompra = input.nextDouble();

        if (valorCompra > 100.0) {
            System.out.println("Parabéns! Você ganhou frete grátis!");
        } else {
            double valorTotal = valorCompra + valorFrete;
            System.out.println("O valor da compra é R$" + valorTotal);
        }
    }
}