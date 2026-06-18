import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivo1 {
    static void main() {
        File arquivo = new File("2026-06-18 Arquivo1/cidades.txt");
        try(Scanner leitor = new Scanner(arquivo)){

            System.out.printf("%-15s | %s\n", "cidade", "população");
            System.out.println("-".repeat(16)+"+"+"-".repeat(10));

            while(leitor.hasNextLine()){ // .hasNextLine é TRUE se tem mais uma linha

                String linha = leitor.nextLine();
                // joga nas variáveis
                String[] dados = linha.split("\t"); // \t é a tabulação
                String cidade = dados[0].trim(); // trim() remove espaços da string

                try {

                    int populacao = Integer.parseInt(dados[1].trim()); // Integer.parseInt() converte de String para int
                    System.out.printf("%-15s | %8d\n", cidade, populacao);

                } catch (NumberFormatException e) {
                    System.out.println("#ERRO - [" + linha + "]");
                }

            }

        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }

    }
}
