public class MainStaticCoisa {
    public static void main(String[] args) {
        // não criei coisa nenhuma ainda!
        StaticCoisa.funcaoDasCoisas();

        StaticCoisa jaburu = new StaticCoisa("Jaburu");
        StaticCoisa chaveiro = new StaticCoisa("Chaveiro");

        jaburu.funcaoDeUmaCoisa();
        chaveiro.funcaoDeUmaCoisa();

        // chama a função estática de novo
        StaticCoisa.funcaoDasCoisas();
    }
}
