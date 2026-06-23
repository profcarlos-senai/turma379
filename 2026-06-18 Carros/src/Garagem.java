public class Garagem {
    Carro[] carros;

    public Garagem(int vagas) {
        carros = new Carro[vagas];
    }

    public void estaciona(int vaga, Carro carro){
        if(carros[vaga] == null){
            carros[vaga] = carro;
        } else {
            throw new IllegalStateException("Vaga está ocupada");
        }
    }

    public Carro retira(int vaga){
        Carro carro = carros[vaga]; // pega o carro
        carros[vaga] = null; // esvazia a vaga
        return carro; // retorna o carro que tava na vaga
    }

    public Boolean isOcupada(int vaga){
        return carros[vaga] != null;
    }

    public Carro getCarro(int vaga){
        return carros[vaga];
    }

    public Carro[] getCarros(){
        return carros.clone();
    }
}
