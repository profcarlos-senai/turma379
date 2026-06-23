public class MainGaragem {
    public static void main(String[] args) {
        Garagem garagem = new Garagem(10);
        Carro carro = new Carro("ABC-1234");
        carro.setMotorista(new Motorista("Juca"));

        if(!garagem.isOcupada(3)) {
            garagem.estaciona(3, carro);
        } else {
            System.out.println("Vaga 3 ocupada");
        }

        System.out.println("Carro estacionado: "+garagem.getCarro(3).getPlaca());

        garagem.estaciona(0, new Carro("XYZ-9876"));
        garagem.estaciona(9, new Carro("BBB-6767"));

        System.out.println("\nCARROS ESTACIONADOS\n----------------------------");
        for(Carro car: garagem.getCarros()){
            if(car != null){
                System.out.println(car.getPlaca());
            } else {
                System.out.println("vazio");
            }
        }

    }
}
