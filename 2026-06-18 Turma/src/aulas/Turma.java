package aulas;

import java.util.Arrays;

public class Turma {
    private int quantAlunos = 0; // quantos alunos já adicionou
    private int maxAlunos = 5; // máximo de alunos que pode ter
    private Aluno[] alunos = new Aluno[5]; // o vetor de alunos

    public Turma(int tamanho) {
        quantAlunos = 0;
        maxAlunos = tamanho;
        alunos = new Aluno[tamanho];
    }

    public void addAluno(Aluno aluno){
        if(quantAlunos < maxAlunos){
            alunos[quantAlunos] = aluno;
            quantAlunos++;
        } else {
            throw new IllegalArgumentException("aulas.Turma já está cheia");
        }
    }

    public int getMaxAlunos() {
        return maxAlunos;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public Aluno[] getAlunos() {
        return Arrays.copyOf(alunos, quantAlunos);
    }

}
