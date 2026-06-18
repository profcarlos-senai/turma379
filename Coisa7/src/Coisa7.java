import java.util.InputMismatchException;
import java.util.Scanner;

public class Coisa7 {
    static void main() {
        /* */
        try (Scanner tecla = new Scanner(System.in)) { // se der erro aqui libera o Scanner
            boolean digitou = false;
            do { // repete até digitar direito
                try {
                    System.out.print("Digite um numero: ");
                    int a = tecla.nextInt(); // dá InputMismatchException
                    System.out.print("Digite mais um numero: ");
                    int b = Integer.parseInt((tecla.nextLine())); // dá NumberFormatException
                    digitou = true;
                    int xuxu = a / b; // pode dar outro erro
                    System.out.println("Número: " + xuxu);
                } catch (InputMismatchException e) {
                    tecla.nextLine(); // limpa o scanner
                    System.out.println("Digita direito seu burro");
                } catch (ArithmeticException e) {
                    System.out.println("Perdeu playboy");
                } catch (RuntimeException e) {
                    System.out.println("Deu outro erro que eu não estava prevendo: "+e.getMessage());
                }
                finally {
                    System.out.println("Passou por aqui");
                }
            } while (!digitou);
        } // fim do try do scanner -- aqui ele libera o scanner

        /* */

        /* */
        int[] x = {1,2,3}; // array pré-preenchida
        try { // faz a coisa que pode dar erro
            System.out.println("Posição 200 do array: " + x[200]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // "e" é uma variável que guarda os detalhes do erro
            System.out.println("Explodiu: "+e.getMessage());
        }
        System.out.println("Nunca vai chegar aqui");
        /* */
    }
}
