import src.Integer;
import src.String;

public class EXERCICIO16 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        System.out.println("Números divisíveis por 3:");

        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
            i++;
        }
    }
}