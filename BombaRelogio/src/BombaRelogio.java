import java.util.Random;

// Exemplo para explicar construtores

public class BombaRelogio {
    private int contador;

    BombaRelogio(){
        this(3);
    }

    BombaRelogio(int contador){
        this.contador = contador;
    }

    BombaRelogio(Random rand){
        contador = rand.nextInt(10)+1;
    }

    public void tick(){
        if (contador-- <= 0){
            throw new RuntimeException("BUM!");
        }
    }

    public int getContador() {
        return this.contador;
    }
}
