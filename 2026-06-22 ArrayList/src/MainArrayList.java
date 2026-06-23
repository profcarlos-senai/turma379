import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cria um arraylist viciado na classe Carro
        ArrayList<Carro> carros = new ArrayList<>();

        String continuar;

        do {
            // cria um carro
            Carro carro = new Carro();

            System.out.print("Digite a placa: ");
            carro.setPlaca(scanner.nextLine());

            System.out.print("Digite o nome do motorista: ");
            carro.setMotorista(scanner.nextLine());

            // adiciona no arraylist
            carros.add(carro);

            System.out.print("Deseja cadastrar outro carro? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nQuantidade de carros cadastrados: " + carros.size());
        do{
            System.out.print("Digite um número entre 1 e "+ carros.size()+ ": ");
            int numero = Integer.parseInt(scanner.nextLine());
            // pega aquele carro usando .get()
            Carro carro = carros.get(numero-1);
            System.out.println(carro);


            System.out.print("Quer pesquisar mais um carro? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();
        } while (continuar.equalsIgnoreCase("S"));

        // lista todos
        System.out.println("\nLista de carros em ordem de placa:");
        for (Carro carro : carros) {
            System.out.println(
                    "Placa: " + carro.getPlaca() +
                            " | Motorista: " + carro.getMotorista()
            );
        }

        scanner.close();
    }
}