public class Main {
    public static void main(String[] args) {

    // Variáveis de teste
    boolean possuiIngresso = true;
    int idade = 12;
    double precoIngresso = 40.0;

    // ------------------------------------------------------------------
    // ESTÁGIO 1: Estrutura if/else simples
    // Usada quando temos apenas duas possibilidades (sim ou não / verdadeiro ou falso).
    // ------------------------------------------------------------------
    if (possuiIngresso) {
        // Este bloco executa se a condição for VERDADEIRA
        System.out.println("Acesso liberado. Bom filme!");

        // --------------------------------------------------------------
        // ESTÁGIO 2: Estrutura if / else if / else
        // Usada quando temos múltiplas condições para avaliar em sequência.
        // O Java testa de cima para baixo e executa APENAS o primeiro bloco que for verdadeiro.
        // --------------------------------------------------------------
        if (idade < 5) {
            // Condição 1: Crianças menores de 5 anos não pagam
            precoIngresso = 0.0;
            System.out.println("Desconto: Criança menor de 5 anos não paga.");

        } else if (idade >= 5 && idade <= 12) {
            // Condição 2: Crianças entre 5 e 12 anos pagam meia-entrada (50% de desconto)
            precoIngresso = precoIngresso * 0.5;
            System.out.println("Desconto: Criança (5 a 12 anos) paga meia-entrada.");

        } else if (idade >= 60) {
            // Condição 3: Idosos também pagam meia-entrada
            precoIngresso = precoIngresso * 0.5;
            System.out.println("Desconto: Idoso (60 anos ou mais) paga meia-entrada.");

        } else {
            // Caso padrão: Se NENHUMA das condições anteriores for verdadeira,
            // significa que é um adulto entre 13 e 59 anos (paga inteira).
            System.out.println("Desconto: Valor integral (sem desconto).");
        }

        // Exibe o valor final a ser pago
        System.out.println("Valor final do ingresso: R$ " + precoIngresso);

    } else {
        // Este bloco executa se a condição do primeiro 'if' for FALSA
        System.out.println("Acesso negado. Você precisa de um ingresso válido.");
    }
}
}
