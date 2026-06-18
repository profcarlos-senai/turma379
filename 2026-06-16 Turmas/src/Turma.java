import java.util.Arrays;

public class Turma{
    private int quantAlunos = 0;
    private int maxAlunos = 0;
    private final String[] alunos;

    public Turma(int tamanho) {
        maxAlunos = tamanho;
        alunos = new String[tamanho];
    }

    public void addAluno(String aluno){
        if(quantAlunos < maxAlunos){
            alunos[quantAlunos] = aluno;
            quantAlunos++;
        } else {
            throw new IllegalArgumentException("Turma já está cheia");
        }
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public String[] getAlunos() {
        return Arrays.copyOf(alunos, quantAlunos);
    }

}
