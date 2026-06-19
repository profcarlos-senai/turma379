import java.time.LocalDate;

public class Animal {

    private Integer id; // pode ser null
    private String nome;
    private String especie;
    private String sexo;
    private Integer idade;
    private Double peso; // pode ser null
    private String paisOrigem;
    private LocalDate dataChegada;
    private Boolean carnivoro; // pode ser null

    public Animal(){

    }

    public Animal(Integer id,
                  String nome,
                  String especie,
                  String sexo,
                  Integer idade,
                  Double peso,
                  String paisOrigem,
                  LocalDate dataChegada,
                  Boolean carnivoro) {

        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
        this.dataChegada = dataChegada;
        this.carnivoro = carnivoro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", peso=" + peso +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", dataChegada=" + dataChegada +
                ", carnivoro=" + carnivoro +
                '}';
    }
}