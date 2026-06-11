import java.util.InputMismatchException;
import java.util.Scanner;

public class Coisa4b {


    // calcula frequencia de aula
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int aulas=0, presencas=0;

        boolean ok = false;
        do {
            try {
                System.out.print("Total de aulas: ");
                aulas = teclado.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Digite somente numeros inteiros.");
                teclado.nextLine(); // lê o ENTER pra limpar o teclado
            }
        }while (!ok);




        ok = false;
        do {
            try {
                System.out.print("Total de presenças: ");
                presencas = teclado.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Digite somente numeros inteiros.");
                teclado.nextLine(); // lê o ENTER pra limpar o teclado
            }
        }while (!ok);

        // esse 100.0 ali evita que perca as casas decimais
        double percentual = presencas*100.0/aulas;

        System.out.printf("Percentual de presencas: %.2f%%", percentual);
    }
}
