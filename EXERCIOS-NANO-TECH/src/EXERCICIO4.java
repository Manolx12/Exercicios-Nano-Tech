import src.Scanner;
import src.String;

public class Exercicio4 {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o Nome Desejado:");
			String nome = scanner.nextLine();
			
			System.out.println("Digite o Sobrenome Desejado:");
			String sobrenome = scanner.nextLine();
			
			System.out.println("Nome Digitado foi: "  + nome + "  " + sobrenome);
			
			scanner.close();
		}

	}