import src.Scanner;
import src.String;

public class Exercicio12 { //Verificar se a pessoa passou no concurso público
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite a nota de português: ");
	        int notaPortugues = input.nextInt();

	        System.out.println("Digite a nota de matemática: ");
	        int notaMatematica = input.nextInt();

	        int total = notaPortugues + notaMatematica;

	        if (notaPortugues >= 60 && notaMatematica >= 60 && total >= 150) {
	            System.out.println("Parabéns, você passou!");
	        } else {
	            System.out.println("Infelizmente, você não passou.");
	        }
	    }
	}