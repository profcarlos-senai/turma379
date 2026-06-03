import java.util.Scanner;

public class Coisa4 {
    // calcula frequencia de aula
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aulas, presencas;

        System.out.print("Total de aulas: ");
        aulas = teclado.nextInt();

        System.out.print("Total de presencas: ");
        presencas = teclado.nextInt();

        // esse 100.0 ali evita que perca as casas decimais
        double percentual = presencas*100.0/aulas;

        System.out.printf("Percentual de presencas: %.2f%%", percentual);
    }
}
