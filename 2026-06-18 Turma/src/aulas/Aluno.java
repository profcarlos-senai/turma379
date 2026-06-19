package aulas;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno(){
        // faz nada
    }

    public Aluno(String nome){
        this.nome = nome;
    }

    public double getMedia() {
        double media = (nota1 + nota2)/2.0;
        return Math.round(media*10)/10.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio!");
        }
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 < 0 || nota1 > 10) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10");
        }
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 < 0 || nota2 > 10) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10");
        }
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return String.format("%s - %.1f (%.1f - %.1f)", nome, getMedia(), nota1, nota2);
    }
}
