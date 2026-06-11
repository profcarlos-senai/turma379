import java.util.Scanner;

public class MenuBanco {
    private final Scanner teclado = new Scanner(System.in);
    private final ContaBancaria minhaGrana;

    MenuBanco(ContaBancaria conta) {
        minhaGrana = conta;
    }

    public void mostraMenu() {

        int opcao;
        do{
            opcao = escolheDoMenu();
            switch (opcao) {
                case 1 -> fazDeposito();
                case 2 -> fazSaque();
                case 3 -> System.out.print("Saindo...\n ");
                default -> System.out.print("Opção inválida...\n ");
            }
        } while (opcao != 0);
    }

    private void fazSaque() {
        System.out.print("Quanto quer sacar?\n ");
        double valorSaque = teclado.nextDouble();
        if (valorSaque <= 0) {
            System.out.print("Saque valores positivos\n ");
            return;
        }
        minhaGrana.sacar(valorSaque);
    }

    private void fazDeposito() {
        System.out.print("Quanto quer depositar? \n ");
        double valorDeposito = teclado.nextDouble();
        if (valorDeposito <= 0) {
            System.out.print("Deposite valores positivos\n ");
            return;
        }
        minhaGrana.depositar(valorDeposito);
    }

    private int escolheDoMenu() {
        System.out.printf("\nSaldo: R$ %.2f\n", minhaGrana.getSaldo());

        int opcao;
        System.out.print("Escolha uma opção: \n ");
        System.out.print("1 - Depositar\n ");
        System.out.print("2 - Sacar\n ");
        System.out.print("0 - Sair\n ");

        opcao = teclado.nextInt();
        return opcao;
    }
}
