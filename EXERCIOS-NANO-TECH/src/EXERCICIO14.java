import src.Scanner;
import src.String;

public class EXERCICIO14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 7 para representar o dia da semana: ");
        int numero = scanner.nextInt();
        
        String dia;
        
        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número inválido, por favor digite um número de 1 a 7.";
                break;
        }
        
        System.out.println("O dia da semana correspondente é: " + dia);
    }
}