public class Coisa4d {

    // calcula frequencia de aula
    public static void main(String[] args) {
        int aulas=0, presencas=0;

        do {

            aulas = Digitador.digitaInteiro("nº aulas: ");
            presencas = Digitador.digitaInteiro("nº presencas: ");

            // esse 100.0 ali evita que perca as casas decimais
            double percentual = presencas * 100.0 / aulas;

            System.out.printf("Percentual de presencas: %.2f%%\n", percentual);

        }while(Digitador.perguntaSimOuNao("Quer repetir?"));
    }
}