public class ComparaPessoas {
    static void main() {
        Pessoa umCara = new Pessoa("Juca","da Silva");

        Pessoa mesmoCara = umCara;

        Pessoa outroCara = new Pessoa("Juca","da Silva");

        // se duas variáveis contém o mesmo objeto elas são iguais
        if(umCara == mesmoCara) {
            System.out.println("umCara é mesmoCara");
        } else {
            System.out.println("umCara não é mesmoCara");
        }

        // dois objetos diferentes são diferentes mesmo que o conteúdo seja igual
        if(umCara == outroCara) {
            System.out.println("umCara = outrCara");
        } else {
            System.out.println("umCara não é outroCara");
        }

        // pra perguntar se o conteúdo é igual, use .equals()
        // MAS tem que escrever o .equals na classe
        if(umCara.equals(outroCara)) {
            System.out.println("umCara == outroCara");
        } else {
            System.out.println("umCara != outroCara");
        }
    }
}
