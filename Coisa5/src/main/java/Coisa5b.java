public class Coisa5b {
    public static void main(String[] args) {

        // Declaração do vetor de 12 Strings
        String[] meses = new String[12];

        // Atribuição de valor para cada posição do vetor individualmente
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        // Exibe o tamanho total do vetor criado
        System.out.println("Tamanho do vetor: " + meses.length);

        // Percorre o vetor para exibir todos os meses guardados
        for (int i = 0; i < meses.length; i++) {
            // Imprime o índice e o mês correspondente
            System.out.println("Índice " + i + " armazena: " + meses[i]);
        }

        // para cada mes em "meses"
        for (String mes : meses) {
            // coloca cada item de "meses" em "mes" e faz o loop
            System.out.println(mes);
        }
    }
}
