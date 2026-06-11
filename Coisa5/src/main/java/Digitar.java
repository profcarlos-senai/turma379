import java.util.Scanner;

public class Digitar {
    static void main(String[] args) {
        // primeiro vc precisa criar uma variável com um Scanner dentro
        Scanner entradaDados = new Scanner(System.in);

        // agora usa o scanner pra pedir pra digitar
        System.out.print("Digite um inteiro");
        // .nextInt() pega um inteiro
        int inteiro = entradaDados.nextInt();
        System.out.printf("Você digitou %i \n", inteiro);

        // .nextDouble digita um double
        System.out.print("Quanto quer depositar?");
        double valor = entradaDados.nextDouble(); // puxa um double do teclado
        System.out.printf("O valor é R$ %.2f\n", valor);

        // pra pegar a próxima PALAVRA use .next
        // se vc digitar "JOÃO SILVA" só vai pegar "joão"
        String nome = entradaDados.next();

        // .nextLine() pega a linha inteira, com espaços e tudo
        String endereco = entradaDados.nextLine();

        // pra pegar somente um caractere, leia uma string e pegue só a posição 0
        char sexo = entradaDados.next().charAt(0);

        System.out.printf("Nome: %s\nSexo: %c\nEndereço %s\n", nome, sexo, endereco);
    }
}
