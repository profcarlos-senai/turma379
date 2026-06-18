import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arquivos {

    public static void main(String[] args) {

        // cria um scanner para ler o arquivo "pessoas.txt"
        try (Scanner arquivo = new Scanner(new File("2026-06-18 Arquivos/pessoas.txt"))) {

            // Ignora o cabeçalho
            arquivo.nextLine();

            // hasNextLine() retorna TRUE se ainda tiver valores para ler
            int i = 0;
            while (arquivo.hasNext()) {

                // lê a linha para dentro de uma string
                String linha = arquivo.nextLine();
                i++; // conta as linhas

                // cria um scanner para processar essa linha
                try (Scanner leitorLinha = new Scanner(linha)) {

                    // o separador de dados é o caracter de tabulação
                    leitorLinha.useDelimiter("\t");

                    // lê os dados para dentro de variáveis
                    String nome = leitorLinha.next();
                    double altura = leitorLinha.nextDouble();
                    double peso = leitorLinha.nextDouble();
                    int idade = leitorLinha.nextInt();
                    boolean estudante = leitorLinha.nextBoolean();
                    char sexo = leitorLinha.next().charAt(0);

                    // imprime o que leu
                    System.out.printf(
                            "%-15s - %1.2f m - %3.1f kg - %3d anos - %-5b - %c\n",
                            nome, altura, peso, idade, estudante, sexo
                    );
                } catch(InputMismatchException e) {
                    System.out.printf("<<< erro na linha %d: [%s]\n", i, linha);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}