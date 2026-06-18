import java.util.Scanner;

public class Coisa5 {
    static void main(String[] args) {
        // como fazer switch em Java
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um numero de 1 a 3");
        int opcao = leitor.nextInt();

        // um jeito: com BREAK
        switch (opcao) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            default:
                System.out.println("ERRO");
        }

        // outro jeito (java versão 14 e acima)

        switch (opcao) {
            case 1 -> {
                System.out.println("ESCOLHEU UM");
            }
            case 2 -> {
                System.out.println("ESCOLHEU DOIS");
            }
            case 3 -> {
                System.out.println("ESCOLHEU TRES");
            }
            default -> System.out.println("ERRO");
        }

    }
}
