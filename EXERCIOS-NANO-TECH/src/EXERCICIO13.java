import src.Scanner;
import src.String;

public class EXERCICIO13 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Digite a meta de faturamento anual da empresa: ");
	        double metaFaturamento = input.nextDouble();

	        System.out.println("Digite o faturamento real da empresa no último ano: ");
	        double faturamentoReal = input.nextDouble();

	        System.out.println("Digite a média salarial do funcionário: ");
	        double mediaSalarial = input.nextDouble();

	        if (faturamentoReal >= metaFaturamento) {
	            System.out.println("O prêmio do funcionário será igual a sua média salarial do último ano: " + mediaSalarial);
	        } else if (faturamentoReal >= 0.8 * metaFaturamento) {
	            double premio = 0.8 * mediaSalarial;
	            System.out.println("O prêmio do funcionário será de 80% de sua média salarial: " + premio);
	        } else {
	            System.out.println("Infelizmente, o funcionário não receberá prêmio neste ano.");
	        }
	    }
	}
