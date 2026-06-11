import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Essa classe vai ter vários métodos para pedir pra digitar valores
 * de vários tipos
 */
public class Digitador {
    private static final Scanner teclado = new Scanner(System.in);

    /**
     * pede pra digitar um inteiro
     * @param texto o que mostrar antes de pedir pra digitar
     * @return o valor digitado
     */
    public static int digitaInteiro(String texto){
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

    /**
     * pergunta sim ou não e retorna True ou False
     * @param texto a pergunta
     * @return true se respondeu sim
     */
    public static boolean perguntaSimOuNao(String texto){
        char resposta = '.';
        do{
            System.out.print(texto+" (S/N) ");
            resposta = teclado.next().toUpperCase().charAt(0);
            if(resposta != 'S' && resposta != 'N'){
                System.out.println("Digite somente S ou N.");
            }
        }while(resposta != 'S' && resposta != 'N');
        return (resposta == 'S');
    }
}
