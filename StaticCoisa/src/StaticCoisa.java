public class StaticCoisa {

    // exemplo para explicar atributos e métodos estáticos

    private static int quantasCoisas = 0;

    private final String nomeDaCoisa;

    public StaticCoisa(String nome){
        quantasCoisas++;
        nomeDaCoisa = nome;
    }

    public void funcaoDeUmaCoisa(){
        System.out.println("Eu sou a coisa chamada "+this.nomeDaCoisa);
    }

    public static void funcaoDasCoisas(){
        System.out.println("Existem "+quantasCoisas+" coisas");
    }
}
