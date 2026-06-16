public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Maria Souza");
        aluno.setNota1(8.5);
        aluno.setNota2(7.0);
        aluno.setNota3(9.0);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        System.out.println("Média Final: " + aluno.getMedia());
    }
}

