Import java.util.scanner

public class EXERCICIO19 {
    public static void imprimirTabuada(int multiplicando, int multiplicador) {
        if (multiplicador <= 10) {
            int resultado = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
            imprimirTabuada(multiplicando, multiplicador + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        scanner.close();

        imprimirTabuada(numero, 0);
    }
}