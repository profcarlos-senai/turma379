public class MainTurmas {
    public static void main(String[] args) {
        // cria uma nova turma e guarda em informatica
        Turma informatica = new Turma(5);
        informatica.addAluno("Juquinha");
        informatica.addAluno("Mariazinha");
        informatica.addAluno("Zezinho");

        // imprime a turma
        System.out.println("Alunos de informática: ");
        for(String nome: informatica.getAlunos()){
            System.out.println("- "+nome);
        }

        // nova turma
        Turma costura = new Turma(30);


    }
}
