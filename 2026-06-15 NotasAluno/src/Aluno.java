public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public double getMedia() {
        double media = (nota1 + nota2 + nota3)/3.0;
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

    private void testaNota(double nota) {
        if(nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve ser entre 0 e 10!");
        }
    }

    public void setNota(int i, double nota) {
        testaNota(nota);
        switch (i){
            case 1 -> nota1 = nota;
            case 2 -> nota2 = nota;
            case 3 -> nota3 = nota;
            default -> throw new IllegalArgumentException("Nº da nota deve ser entre 1 e 3!");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        testaNota(nota1); // dá erro se for <0 ou >10
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        testaNota(nota2); // dá erro se for <0 ou >10
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        testaNota(nota3); // dá erro se for <0 ou >10
        this.nota3 = nota3;
    }
}
