import java.util.Scanner;


public class Main2 {
    static double saldo = 0;

    public static void main(String[] args) {
        double depositar = 0, sacar = 0, valor = 0;

        System.out.println("Seja bem-vindo ao caixa eletônico! Qual operacao desteja fazer ?");
        System.out.println("Depositar (1), sacar(2), extrato(3), sair(0)");
        System.out.println("Qual operacão deseja fazer ?");
        Scanner entradaDados = new Scanner(System.in);
        int operacao = entradaDados.nextInt();

        while (operacao != 0) {

            if (operacao == 1 || operacao == 2) {
                System.out.println("Você escolheu " + operacao + ". Quanto você deseja movimentar ?");
                valor = entradaDados.nextDouble();
            }

            switch (operacao) {
                case 1 -> {
                    depositar(valor);
                }
                case 2 -> {
                    sacar(valor);
                }
                case 3 -> {
                    System.out.println("seu valor é: R$" + saldo);
                }
                default -> System.out.println("Opção inválida! tente novamente.");
            }

            System.out.println("Seja bem-vindo ao caixa eletônico! Qual operacao desteja fazer ?");
            System.out.println("Depositar (1), sacar(2), extrato(3), sair(0)");
            System.out.println("Qual operacão deseja fazer ?");
            operacao = entradaDados.nextInt();
        }

        System.out.println("Tenha um bom dia!");
    }

    private static void sacar(double valor) {
        double sacar;
        sacar = valor;
        saldo -= sacar;
        System.out.println("Operação realizada!");
    }

    private static void depositar(double valor) {
        double depositar;
        depositar = valor;
        saldo += depositar;
        System.out.println("Operação realizada!");
    }
}