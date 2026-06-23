public class Carro {
    private String placa;
    private Motorista motorista;

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
