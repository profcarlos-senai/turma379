public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234");
        Motorista motora1 = new Motorista("Juca");
        Motorista motora2 = new Motorista("Zeca");

        carro.setMotorista(motora1);
        System.out.printf("Quem está dirigindo o carro %s é o %s\n",
                carro.getPlaca(), carro.getMotorista().getNome());

        carro.setMotorista(motora2);
        System.out.printf("Quem está dirigindo o carro %s é o %s\n",
                carro.getPlaca(), carro.getMotorista().getNome());
    }
}
