import java.util.Scanner;

public class ExemploStrings {
    static void main() {
        Scanner input = new Scanner(System.in);

        String a = "abcdefg";
        System.out.println("Digite a senha");
        String b = input.nextLine();

        if(a.equals(b)) {
            System.out.println("pode entrar");
        }
        else {
            System.out.println("acesso negado");
        }
    }
}
