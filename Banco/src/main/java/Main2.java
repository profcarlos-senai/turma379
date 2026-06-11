import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        double saldo = 0, depositar = 0, sacar = 0, valor = 0;


        System.out.println("Seja bem-vindo ao caixa eletônico! Qual operacao desteja fazer ?");
        System.out.println("Depositar (1), sacar(2), extrato(3), sair(0)");
        System.out.println("Qual operacão deseja fazer ?");
        Scanner entradaDados = new Scanner(System.in);
        int operacao = entradaDados.nextInt();

        while(operacao != 0){

            if(operacao == 1 || operacao == 2) {
                System.out.println("Você escolheu " + operacao + ". Quanto você deseja movimentar ?");
                valor = entradaDados.nextDouble();
            }

            switch (operacao){
                case 1 -> {
                    depositar = valor;
                    saldo += depositar;
                    System.out.println("Operação realizada!");
                }
                case 2 -> {
                    sacar = valor;
                    saldo -= sacar;
                    System.out.println("Operação realizada!");
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
}