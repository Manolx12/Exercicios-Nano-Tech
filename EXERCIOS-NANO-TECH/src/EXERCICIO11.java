import src.Double;
import src.Integer;
import src.Scanner;
import src.String;

public class Exercicio11 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Digite seu tempo de contribuição: ");
		Double tempoContribuicao = scanner.nextDouble();
		
		if (idade >= 55 && tempoContribuicao >= 25) {
			System.out.println("Você pode se aposentar!");
		} else {
			System.out.println("Ainda não pode se aposentar!");
		}

		scanner.close();

	}

}