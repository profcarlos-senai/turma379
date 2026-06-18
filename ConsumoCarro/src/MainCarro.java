public class MainCarro {
    public static void main(String[] args) {
        // Criando o carro com motorista "Jeremias" e KM inicial de 10000
        Carro meuCarro = new Carro("Jeremias", 10000);

        // Registrando abastecimentos ao longo do tempo
        meuCarro.registraAbastecimento(10400, 30); // Rodou 400km com 30L
        meuCarro.registraAbastecimento(10850, 35); // Rodou mais 450km com 35L

        System.out.println("Motorista: " + meuCarro.getMotorista());
        System.out.println("KM Inicial: " + meuCarro.getKmInicial());
        System.out.println("KM Atual: " + meuCarro.getKmTotal());
        System.out.println("Total de Litros: " + meuCarro.getLitrosTotal());

        // Deve exibir o consumo médio de todo o período (850km / 65L)
        System.out.printf("Consumo Médio: %.2f km/l\n", meuCarro.getConsumo());
    }
}
