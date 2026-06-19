import aulas.Aluno;
import aulas.Turma;

public class MainAulas {
    static void main() {
        Turma culinaria = new Turma(5); // cria uma turma de 5 alunos
        culinaria.addAluno( new Aluno("Juca",10,9) );

        Aluno maria =  new Aluno("Maria",7,7);
        culinaria.addAluno( maria );

        maria = new Aluno("Juliano", 3, 2);
        culinaria.addAluno( maria ); // só que a agora tem "Juliano" dentro de maria ;)

        Aluno alunoZ = new Aluno("Zenóbia");
        culinaria.addAluno( alunoZ );
        alunoZ.setNota1(10);
        alunoZ.setNota2(10);

        Aluno mario = new Aluno();
        mario.setNome("Mario");
        mario.setNota1(8);
        mario.setNota2(7.5);

        // agora imprime
        System.out.println("TURMA DE CULINÁRIA:");
        for(Aluno aluno : culinaria.getAlunos()){
            System.out.println(aluno);
        }

    }
}
