public class Carro implements Comparable<Carro>{
    private String placa;
    private String motorista;

    public Carro(String placa, String motorista) {
        this.placa = placa;
        this.motorista = motorista;
    }

    public Carro(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Carro placa "+placa+" motorista "+motorista;
    }

    @Override
    public int compareTo(Carro o) {
        return this.getPlaca().compareTo(o.getPlaca());
    }
}
