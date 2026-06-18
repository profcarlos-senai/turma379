import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arquivo2 {

    public static void main(String[] args) {

        // cria um scanner para ler o arquivo "pessoas.txt"
        try (Scanner arquivo = new Scanner(new File("2026-06-18 Arquivo2/pessoas.txt"))) {

            // Ignora o cabeçalho
            arquivo.nextLine();

            // hasNextLine() retorna TRUE se ainda tiver valores para ler
            int i = 0;
            while (arquivo.hasNext()) {

                // lê a linha para dentro de uma string
                String linha = arquivo.nextLine();
                i++; // conta as linhas

                // cria um scanner para processar essa linha
                try{

                    String dados[] = linha.split("\t"); // \t é o caracter de tabulação

                    // lê os dados para dentro de variáveis
                    String nome = dados[0].trim();
                    double altura = Double.parseDouble(dados[1]);
                    double peso = Double.parseDouble(dados[2]);
                    int idade = Integer.parseInt(dados[3]);
                    boolean estudante = Boolean.parseBoolean(dados[4]);
                    char sexo = dados[5].charAt(0);

                    // imprime o que leu
                    System.out.printf(
                            "%-15s - %1.2f m - %3.1f kg - %3d anos - %-5b - %c\n",
                            nome, altura, peso, idade, estudante, sexo
                    );
                } catch(NumberFormatException e) {
                    System.out.printf("<<< erro na linha %d: [%s]\n", i, linha);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}