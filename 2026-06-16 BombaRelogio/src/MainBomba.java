import java.util.Random;
import java.util.Scanner;

public class MainBomba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opcao;

        BombaRelogio bomba =  new BombaRelogio(new Random());

        try {
            do{
                System.out.print("Quer desistir (S/N)?");
                opcao = input.next().toUpperCase().charAt(0);

                if(opcao == 'N'){
                    bomba.tick();
                    System.out.println("Ufa!");
                }
            }while(opcao != 'S');

            System.out.println("Você parou a "+ bomba.getContador()+ " segundos do final!");

        } catch (RuntimeException e) { // EXPLODIU
            // mostra o erro de um jeito civilizado
            System.out.println(e.getMessage());
        }
    }
}
