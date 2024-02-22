import src.Boolean;
import src.Scanner;
import src.String;

    public class Exercicio5 {
	
		  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	      System.out.print("Digite a nota do aluno de 0 a 100: ");
	      int nota = input.nextInt();
	    
	    	final Boolean Aprovado = nota >= 70;
	    
	    	if (Aprovado) {
	          System.out.print("Parabéns você passou de ano.");
	          
	        } else {
	          System.out.print("Nota abaixo da média, você reprovou.");
	        }
	    
	    input.close();
	        
	  }

}