import java.util.InputMismatchException;
import java.util.Scanner;

public class Coisa4c {

    static Scanner teclado = new Scanner(System.in);

    /**
     * Pede pra digitar um inteiro
     * @param texto a mensagem antes de digitar
     * @return o número digitado
     */
    private static int digitaInteiro(String texto){
        int valor = 0;
        boolean ok = false;
        do {
            try {
                System.out.print(texto);
                valor = teclado.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Digite somente numeros inteiros.");
                teclado.nextLine(); // lê o ENTER pra limpar o teclado
            }
        }while (!ok);
        return valor;
    }

    // calcula frequencia de aula
    public static void main(String[] args) {
        int aulas=0, presencas=0;

        aulas = digitaInteiro("nº aulas: ");
        presencas = digitaInteiro("nº presencas: ");

        // esse 100.0 ali evita que perca as casas decimais
        double percentual = presencas*100.0/aulas;

        System.out.printf("Percentual de presencas: %.2f%%", percentual);
    }
}
