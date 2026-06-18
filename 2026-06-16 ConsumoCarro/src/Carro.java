class Carro {
    // 1. Atributos privados
    private String motorista;
    private int kmInicial;
    private int kmTotal;
    private int litrosTotal;

    // 2. Construtor (Obrigatório informar motorista e kmInicial ao criar o objeto)
    public Carro(String motorista, int quilometragemInicial) {
        this.motorista = motorista;
        this.kmInicial = quilometragemInicial;
        // No começo, a quilometragem total atual é igual à inicial
        this.kmTotal = quilometragemInicial;
        // Começa com 0 litros abastecidos
        this.litrosTotal = 0;
    }

    // 3. Métodos Getter e Setter para o Motorista
    public String getMotorista() {
        return this.motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    // 4. Apenas métodos GETTERS (sem Setters públicos para estes três)
    public int getKmInicial() {
        return kmInicial;
    }

    public int getKmTotal() {
        return kmTotal;
    }

    public int getLitrosTotal() {
        return litrosTotal;
    }

    // 5. Método para registrar o abastecimento
    public void registraAbastecimento(int km, int litros) {
        this.kmTotal = km; // Atualiza a quilometragem total atual do carro
        this.litrosTotal = this.litrosTotal + litros; // Soma os novos litros ao total acumulado
    }

    // 6. Método para calcular o consumo médio
    public double getConsumo() {
        // Distância percorrida = km de agora menos o km de quando começou
        double distanciaPercorrida = kmTotal - kmInicial;

        // Evita divisão por zero caso o carro ainda não tenha sido abastecido
        if (litrosTotal == 0) {
            return 0.0;
        }

        // Calcula o consumo dividindo a distância pelos litros totais
        return distanciaPercorrida / litrosTotal;
    }
}