import java.util.HashMap;
import java.util.Scanner;

public class MainHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // cria um mapa em que a chave é String e o segredo é Carro
        HashMap<String, Carro> carros = new HashMap<>();

        // Cadastro inicial de 5 carros
        carros.put("ABC1234", new Carro("ABC1234", "João"));
        carros.put("DEF5678", new Carro("DEF5678", "Maria"));
        carros.put("GHI9012", new Carro("GHI9012", "Carlos"));
        carros.put("JKL3456", new Carro("JKL3456", "Ana"));
        carros.put("MNO7890", new Carro("MNO7890", "Pedro"));

        String continuar;

        do {
            System.out.print("Digite a placa: ");
            String placa = scanner.nextLine().toUpperCase();

            Carro carro = carros.get(placa);

            if (carro != null) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Motorista: " + carro.getMotorista());
            } else {
                System.out.println("Veículo não encontrado.");
            }

            System.out.print("Deseja consultar outra placa? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase();

        } while (continuar.equals("S"));

        // listar as chaves com o FOR EACH
        System.out.println("PLACAS:");
        for(String placa: carros.keySet()) {
            System.out.println(placa);
        }
        System.out.println();

        // listar os carros com o FOR EACH
        System.out.println("MOTORISTAS:");
        for(Carro meuCarro: carros.values()){
            System.out.println( meuCarro.getMotorista() );
        }

        scanner.close();
    }
}