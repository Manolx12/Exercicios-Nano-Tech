import src.Double;
import src.Scanner;
import src.String;

	public class Exercicio6 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			

			System.out.print("Qual o valor do produto: ");
			Double valorProduto = scanner.nextDouble();
			
			System.out.print("Quantos produtos foram adquiridos?: ");
			Double quantidadeProdutos = scanner.nextDouble();
			
			Double subtotal = quantidadeProdutos * valorProduto;
			Double desconto = 0.0; 
			if (quantidadeProdutos <= 10) {
				
			} else {
				desconto = 10.0;
			}
			
			Double ValorDesconto = subtotal * desconto/100;
			Double valorFinal = subtotal - valorDesconto; 
				
			System.out.println("Valor final do produto é: " + valorFinal);
			
			scanner.close();
		}
	}
