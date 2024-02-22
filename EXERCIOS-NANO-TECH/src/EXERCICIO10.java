import src.Scanner;
import src.String;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorContaLuz, valorContaAgua, valorContaTelefone, valorEscolaFilho, valorFaturaCartao, gastosSupermercado;
        
        System.out.println("Informe o valor da conta de luz: ");
        valorContaLuz = input.nextDouble();
        
        System.out.println("Informe o valor da conta de água: ");
        valorContaAgua = input.nextDouble();
        
        System.out.println("Informe o valor da conta de telefone: ");
        valorContaTelefone = input.nextDouble();
        
        System.out.println("Informe o valor da escola do filho: ");
        valorEscolaFilho = input.nextDouble();
        
        System.out.println("Informe o valor da fatura do cartão: ");
        valorFaturaCartao = input.nextDouble();
        
        System.out.println("Informe os gastos com supermercado: ");
        gastosSupermercado = input.nextDouble();
        
        // Calcula o gasto total
        double gastoTotal = 0;
        gastoTotal += valorContaLuz;
        gastoTotal += valorContaAgua;
        gastoTotal += valorContaTelefone;
        gastoTotal += valorEscolaFilho;
        gastoTotal += valorFaturaCartao;
        gastoTotal += gastosSupermercado;
        
        System.out.println("O gasto total da família no mês foi de: R$" + gastoTotal);
    }
}
