import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Coisa1 {
    public static void main(String[] args) {
        int idade;
        String nome;
        char niver;

        // pra ler do teclado
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Já fez aniversário (S/N)? ");
        niver = teclado.next().charAt(0);

        // adivinha o ano de nascimento
        int ano = 2026-idade;
        if(niver == 'N' || niver == 'n'){
            ano--;
        }
        System.out.println(nome+", você nasceu em "+ano);
    }
}