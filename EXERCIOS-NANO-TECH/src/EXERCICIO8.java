import src.Double;
import src.Integer;
import src.Scanner;
import src.String;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		System.out.println();
		
		System.out.print("Digite o tipo de operação [1= Adição | 2= Subtração | 3= Multiplicação | 4= Divisão: ");
		Integer tipoDeOperação = scanner.nextInt();
		System.out.println();
		
		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (tipoDeOperação.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (tipoDeOperação.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		
		if (tipoDeOperação.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		if (tipoDeOperação.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		System.out.println();
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
		
	}
}