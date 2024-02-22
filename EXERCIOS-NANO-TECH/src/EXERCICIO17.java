Import java.util.scanner

public class EXERCICIO17 {
    public static void main(String[] args) {
        String[] tarefas = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, cadastre as 5 tarefas mais importantes do seu dia:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Tarefa " + (i + 1) + ": ");
            tarefas[i] = scanner.nextLine();
        }

        System.out.println("\nTarefas cadastradas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
